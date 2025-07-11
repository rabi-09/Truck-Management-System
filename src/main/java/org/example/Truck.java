package org.example;

public class Truck {
	private int id, capacity;
	private String company, model, driver_name;
	
	public Truck() {
        super();
	}
	
	public Truck(int id, String company, String model, int capacity, String driver_name) {
		this.id = id;
		this.company = company;
		this.model = model;
		this.capacity = capacity;
		this.driver_name = driver_name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public String getDriver_name() {
		return driver_name;
	}
	
	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}
}
