import java.util.ArrayList;
import java.util.List;

public abstract class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private Destination destination;
    private List<Passenger> enrolled;

    public Activity(String name, String description, double cost, int capacity) {
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.capacity = capacity;
        this.enrolled = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public int getSpacesRemaining() {
        return capacity-enrolled.size();
    }

    public boolean hasSpace() {
        return getSpacesRemaining()>0;
    }

    public boolean isEnrolled(Passenger p) {
        return enrolled.contains(p);
    }

    public void addPassenger(Passenger p) {
        enrolled.add(p);
    }

    public List<Passenger> getEnrolled() {
        return new ArrayList<>(enrolled);
    }

    @Override
    public String toString() {
        String extra=getExtraInfo();
        return "Activity: "+name+" (cost "+cost+", capacity "+capacity+(extra.isEmpty() ? "":", "+extra)+")";
    }

    protected abstract String getExtraInfo();
}