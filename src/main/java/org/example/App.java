package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        TruckManagement tm = new TruckManagement();
        
        while(true){
            System.out.println("Enter Your Choice:\n0 - Exit\n1 - Insert a Truck\n2 - Get All Trucks\n3 - Get a Truck by ID\n4 - Update Truck\n5 - Delete a Truck");
            int choice = sc.nextInt();
            switch (choice){
                case 0:
                    System.exit(0);
                case 1:
                    //Insert Truck
                    tm.insertTruck();
                    System.out.println();
                    break;
                case 2:
                    //Get All Trucks
                    tm.getALlTrucks();
                    System.out.println();
                    break;
                case 3:
                    //Get Truck by ID
                    System.out.println("Enter a Truck ID to Fetch");
                    int id = sc.nextInt();
                    tm.getTruckByID(id);
                    System.out.println();
                    break;
                case 4:
                    //Update Truck
                    System.out.println("Enter a Truck ID to Update");
                    id = sc.nextInt();
                    tm.updateTruckByID(id);
                    System.out.println();
                    break;
                case 5:
                    //Delete truck
                    System.out.println("Enter a Truck ID to Delete");
                    id = sc.nextInt();
                    tm.deleteTruckByID(id);
                    System.out.println();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}






