package models;
import java.util.Random;

public class TransportOfficer extends User {
    private String contact;
    
    public TransportOfficer(String name, String contact) {
        super(name, null, null);
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public void requestTransport(Vehicle vehicle) {
        return;
    }

}
