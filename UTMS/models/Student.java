package models;

import java.util.Random;

public class Student extends User {
    
    public Student(String name, String pickupPoint) {
        super(name, generateStudentUserId(), pickupPoint);
    }

    @Override
    public void requestTransport(Vehicle vehicle) {

        System.out.println("----------------------------------------------------------- \n");
        System.out.println("New transport request by student: \nName: " + getName() + "\nPickup Point: " + getPickupPoint() + "\n");

        System.out.println(vehicle.getVehicleStatus());

        System.out.println("For More Info. \n Contact: \n Driver: " + vehicle.getDriverContact() + "\n Officer: " + vehicle.getOfficerContact() + "\n");
        

    }

    private static String generateStudentUserId() {
        Random rand = new Random();
        int id = rand.nextInt(900 - 100 + 1) + 100; // Generates a random 3-digit user ID
        return "STU-" + id;
    }
}
