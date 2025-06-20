package models;

public class Bus extends Vehicle {

    // Constructor
    public Bus(String vehicleId) {
        super(vehicleId, "Bus", null, true, false);
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