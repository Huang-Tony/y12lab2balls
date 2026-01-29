import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.List;

public class CruiseShip {
    private String name;
    private int psgCap;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public CruiseShip(String name, int psgCap) {
        this.name = name;
        this.psgCap = psgCap;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getPsgCap() {
        return psgCap;
    }

    public List<Passenger> getPassengers() {
        return new ArrayList<>(passengers);
    }

    public void addDestination(Destination destination){
        itinerary.add(destination);
    }

    public List<Destination> getItinerary() {
        return new ArrayList<>(itinerary);
    }

    public boolean addPsg(Passenger p){
        if(passengers.size()>=psgCap){
            System.out.println("Cruise is full, better luck next time :(");
            return false;
        }
        passengers.add(p);
        System.out.println("Passenger added");
        return true;
    }

    public Passenger findPsgByNum(int n){
        for(Passenger p:passengers){
            if(p.getNumber()==n){
                return p;
            }
        }
        System.out.println("Passenger not found");
        return null;
    }

    public void printItinerary(){
        System.out.println("Itinerary for Ship: "+name);
        for(Destination d:itinerary){
            System.out.println(d+":");
            for(Activity a:d.getActivities()){
                System.out.println(a.toString());
            }
        }
    }

    public void printPsgList(){
        System.out.println("Passenger list for for Ship: "+name);
        System.out.println("Passenger capacity: "+psgCap);
        System.out.println("Passengers on cruise: "+passengers.size());
        for(Passenger p:passengers){
            System.out.println(p.getName()+", Number "+p.getNumber());
        }
    }

    public void printPsgDetails(Passenger p){
        System.out.println("Passenger Details:");
        System.out.println("Name: "+p.getName());
        System.out.println("Passenger Number: "+p.getNumber());
        System.out.println(" "+p.getBalanceInfo());
        System.out.println("Activities:");
        for(Booking b: p.getBookings()){
            System.out.println(b.toString());
        }
    }

    public void availableActivities(){
        System.out.println("Activities with available spaces are: ");
        for(Destination d:itinerary){
            for(Activity a: d.getActivities()){
                if(a.hasSpace()){
                    System.out.println("Destination: "+d.getName()+" Activity: "+a.getName()+" Spaces remaining: "+a.getSpacesRemaining());
                }
            }
        }
    }
}