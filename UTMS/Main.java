import models.Student;
import models.Vehicle;
import models.Van;
import models.Bus;
import models.Driver;
import models.Lecturer;
import models.TransportOfficer;

public class Main {
    public static void main(String[] args) {

        // create drivers
        Driver uncleJohn = new Driver("Uncle John", "070123456");
        Driver taataSam = new Driver("Taata Sam", "0787632332");
        Driver joe = new Driver("Joe kisaakye", "0786239234");
        Driver salongo = new Driver("Salongo Bill", "0765823923");


        // create officers
        TransportOfficer Alex = new TransportOfficer("Alex", "0765432987");
        TransportOfficer Alice = new TransportOfficer("Alice", "0775436997");

        // Create vehicles
        Vehicle bus1 = new Bus("Bus-001");
        bus1.assignDriver(uncleJohn);
        bus1.assignOfficer(Alex);


        Vehicle bus2 = new Bus("Bus-002");
        bus2.assignDriver(taataSam);
        bus2.assignOfficer(Alex);
        bus2.takeForService(true);


        Vehicle van1 = new Van("Van-004");
        van1.assignDriver(salongo);
        van1.assignOfficer(Alice);
        van1.takeForService(true);

        Vehicle van2 = new Van("Van-001");
        van2.assignOfficer(Alice);
        van2.assignDriver(joe);

        // Create users
        Student lucky = new Student("Lucky", "Kikoni");
        Lecturer Mark = new Lecturer("Mark", "Kiteezi");
        Student Bill = new Student("Bill", "Muyenga");
        Lecturer Jerome = new Lecturer("Jerome", "Mutungo");
        
        lucky.requestTransport(bus1); 
        Mark.requestTransport(bus2); 
        Bill.requestTransport(van1); 
        Jerome.requestTransport(van2); 
    }
}
