package models;

public class Driver {
    private String vehicleNumber;
    private String name;
    private String contact;

    public Driver(String name, String contact) {
        this.vehicleNumber = vehicleNumber;
        this.name = name;
        this.contact = contact;
    }

    public String getDriverName() {
        return this.name;
    }

    public String getContact() {
        return this.contact;
    }

}
