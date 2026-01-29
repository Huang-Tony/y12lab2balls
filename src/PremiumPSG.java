public class PremiumPSG extends Passenger{
    private double balance;

    public PremiumPSG(String name, int number) {
        super(name, number);
    }

    public double getBalance() {
        return balance;
    }

    @Override
    protected double getPriceOfActivity(Activity activity){
        return 0.0;
    }

    @Override
    protected boolean canAfford(double amt){
        return balance>=amt;
    }

    @Override
    protected void charge(double amt){
    }

    @Override
    public String getBalanceInfo() {
        return "Premium";
    }
}