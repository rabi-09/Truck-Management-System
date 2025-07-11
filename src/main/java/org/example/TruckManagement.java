package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckManagement {
	
	public void getALlTrucks(){
	    try{
		    Connection connection = DriverConnection.getConnection();
			String fetchAllQuery = "select * from truck";
		    Statement statement = connection.createStatement();
		    ResultSet resultSet = statement.executeQuery(fetchAllQuery);
			List<Truck> trucks = new ArrayList<>();
		    System.out.println("Fetching All Truck Details:");
			while(resultSet.next()){
				Truck truck = new Truck();
				truck.setId(resultSet.getInt("id"));
				truck.setCompany(resultSet.getString("company"));
				truck.setModel(resultSet.getString("model"));
				truck.setCapacity(resultSet.getInt("capacity"));
				truck.setDriver_name(resultSet.getString("driver_name"));
				trucks.add(truck);
				System.out.println(truck.getId()+" "+truck.getCompany()+" "+truck.getModel()+" "+truck.getCapacity()+" "+truck.getDriver_name());
			}
			connection.close();
		   
	    }catch(SQLException e) {
		    System.out.println("ERROR:\n" + e.getMessage());
	    }
	}
	
	public void getTruckByID(int id){
	    try{
		    Connection connection = DriverConnection.getConnection();
			String fetchQuery = "select * from truck where id = ?";
		    PreparedStatement preparedStatement = connection.prepareStatement(fetchQuery);
		    preparedStatement.setInt(1, id);
		    ResultSet resultSet = preparedStatement.executeQuery();
		    
		    System.out.println("Truck Details:");
			while(resultSet.next()){
				Truck truck = new Truck();
				truck.setCompany(resultSet.getString("company"));
				truck.setModel(resultSet.getString("model"));
				truck.setCapacity(resultSet.getInt("capacity"));
				truck.setDriver_name(resultSet.getString("driver_name"));
				System.out.println(resultSet.getInt("id")+" "+truck.getCompany()+" "+truck.getModel()+" "+truck.getCapacity()+" "+truck.getDriver_name());
			}
			connection.close();
		   
	    }catch(SQLException e) {
		    System.out.println("ERROR:\n" + e.getMessage());
	    }
	}
	
	public void updateTruckByID(int id){
		try{
			Connection connection = DriverConnection.getConnection();
			String updateQuery = "update truck set company = ?, model = ?, capacity =?, driver_name = ? where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Truck Company Name");
			String company = sc.next();
			System.out.println("Enter Truck Model Name");
			String model = sc.next();
			System.out.println("Enter Truck Capacity");
			int capacity = sc.nextInt();
			System.out.println("Enter Truck Driver Name");
			String driver = sc.next();
			
			preparedStatement.setString(1, company);
			preparedStatement.setString(2, model);
			preparedStatement.setInt(3, capacity);
			preparedStatement.setString(4, driver);
			preparedStatement.setInt(5, id);
			
			int i = preparedStatement.executeUpdate();
			System.out.println(i+" row Updated");
			
			connection.close();
			
		}catch(SQLException e) {
			System.out.println("ERROR:\n" + e.getMessage());
		}
	}
	
	public void insertTruck(){
		try{
			Connection connection = DriverConnection.getConnection();
			String insertQuery = "insert into truck (company, model, capacity, driver_name) values (?,?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Truck Company Name");
			String company = sc.next();
			System.out.println("Enter Truck Model Name");
			String model = sc.next();
			System.out.println("Enter Truck Capacity");
			int capacity = sc.nextInt();
			System.out.println("Enter Truck Driver Name");
			String driver = sc.next();
			
			preparedStatement.setString(1, company);
			preparedStatement.setString(2, model);
			preparedStatement.setInt(3, capacity);
			preparedStatement.setString(4, driver);
			
			int i = preparedStatement.executeUpdate();
			System.out.println(i+" row Inserted");
			
			connection.close();
			
		}catch(SQLException e) {
			System.out.println("ERROR:\n" + e.getMessage());
		}
	}
	
	public void deleteTruckByID(int id){
		try{
			Connection connection = DriverConnection.getConnection();
			String deleteQuery = "delete from truck where id = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery);
			preparedStatement.setInt(1, id);
			
			int i = preparedStatement.executeUpdate();
			System.out.println(i+" row Deleted");
			
			connection.close();
			
		}catch(SQLException e) {
			System.out.println("ERROR:\n" + e.getMessage());
		}
	}
	
}
