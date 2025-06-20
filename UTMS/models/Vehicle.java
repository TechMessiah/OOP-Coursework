package models;

public abstract class Vehicle {
    private String vehicleId;
    private String vehicleType;
    private String driverName;
    private String driverContact;
    private String vehicleStatus;
    private boolean isTrackable;
    private boolean isBeingServiced;
    TransportOfficer officer;


    // Constructor
    public Vehicle(String vehicleId, String vehicleType, String driverName, Boolean isTrackable, Boolean isBeingServiced) {
        this.vehicleId = vehicleId;
        this.vehicleType = vehicleType;
        this.driverName = driverName;
        this.isTrackable = isTrackable;
        this.driverContact = driverContact;
        this.isBeingServiced = isBeingServiced;
        this.officer = officer;
    }

    public String getVehicleStatus() {
        if (isBeingServiced) {
            vehicleStatus = "Sorry for the inconvinience the " + vehicleType + " [ " + vehicleId +" ] is being serviced.";
        } else if (isTrackable) {
            vehicleStatus = vehicleType + " [ " +vehicleId+ " ] is Available. You will be picked shortly by " + driverName;
        } else {
            vehicleStatus = "Sorry ! "+ vehicleType + " [ " + vehicleId + " ] is Unavailable.";
        }
        
        return vehicleStatus;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getDriverContact() {
        return driverContact;
    }

    public void setDriverContact(String contact) {
        this.driverContact = contact;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setIsTrackable(Boolean isTrackable) {
        this.isTrackable = isTrackable;
    }
    
    public void takeForService(Boolean isBeingServiced) {
        this.isBeingServiced = isBeingServiced;
    }

    public void assignOfficer(TransportOfficer officer) {
        this.officer = officer;
    }

    public String getOfficerContact() {
        return this.officer.getContact();
    }

    public abstract void assignDriver(Driver driver); //  to be implemented by subclasses with their own version

}