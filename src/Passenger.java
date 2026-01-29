import java.util.ArrayList;
import java.util.List;

public abstract class Passenger{
    private String name;
    private int number;
    private List<Booking> bookings;

    public Passenger(String name, int number) {
        this.name = name;
        this.number = number;
        this.bookings=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public List<Booking> getBookings() {
        return new ArrayList<>(bookings);
    }

    public boolean signUp(Activity activity){
        if(!activity.hasSpace()){
            return false;
        }
        if(hasBookingAtDestination(activity.getDestination())){
            return false;
        }
        double pricePay= getPriceOfActivity(activity);
        if(!canAfford(pricePay)){
            return false;
        }
        charge(pricePay);
        activity.addPassenger(this);
        bookings.add(new Booking(activity.getDestination(),activity,pricePay));
        return true;
    }

    private boolean hasBookingAtDestination(Destination d) {
        for(Booking b:bookings) {
            if(b.getDestination().equals(d)) {
                return true;
            }
        }
        return false;
    }

    protected abstract double getPriceOfActivity(Activity activity);
    protected abstract boolean canAfford(double amt);
    protected abstract void charge(double amt);
    protected abstract String getBalanceInfo();

    @Override
    public String toString() {
        return "Passenger "+number+" - "+name;
    }
}