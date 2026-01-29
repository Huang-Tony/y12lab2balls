public class SeniorPSG extends Passenger{
    private double balance;

    public SeniorPSG(String name, int number, double balance) {
        super(name, number);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    protected double getPriceOfActivity(Activity activity){
        return activity.getCost()*0.9;
    }

    @Override
    protected boolean canAfford(double amt){
        return balance>=amt;
    }

    @Override
    protected void charge(double amt){
        balance-=amt;
    }

    @Override
    public String getBalanceInfo() {
        return "Senior Balance: "+balance;
    }
}