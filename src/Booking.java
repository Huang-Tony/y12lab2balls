public class Booking {
    private Destination destination;
    private Activity activity;
    private double pricePaid;

    public Booking(Destination destination, Activity activity, double pricePaid) {
        this.destination = destination;
        this.activity = activity;
        this.pricePaid = pricePaid;
    }

    public Destination getDestination() {
        return destination;
    }

    public Activity getActivity() {
        return activity;
    }

    public double getPricePaid() {
        return pricePaid;
    }

    @Override
    public String toString(){
        return"Destination: "+destination.getName()+", Activity: "+activity.getName()+", Price paid: "+pricePaid;
    }
}