package models;

public class Van extends Vehicle {

    // Constructor
    public Van(String vehicleId) {
        super(vehicleId, "Van", null, true, false);
    }

    public String getVehicleId() {
        return super.getVehicleId();
    }

    public String getDriverName() {
        return super.getDriverName();
    }

    @Override
    public void assignDriver(Driver driver) {
        super.setDriverName(driver.getDriverName());
        super.setDriverContact(driver.getContact());
    }
}