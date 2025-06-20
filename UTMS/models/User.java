package models;

public abstract class User {
    private String name;
    private String userId;
    private String pickupPoint;

    // Constructor
    public User(String name, String userId, String pickupPoint) {
        this.name = name;
        this.userId = userId;
        this.pickupPoint = pickupPoint;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getPickupPoint() {
        return pickupPoint;
    }
    
    public abstract void requestTransport(Vehicle vehicle); //  to be implemented by subclasses with their own version

}