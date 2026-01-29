public class StandardPSG extends Passenger{
    private double balance;

    public StandardPSG(String name, int number, double balance) {
        super(name, number);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    protected double getPriceOfActivity(Activity activity){
        return activity.getCost();
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
        return "Standard Balance: "+balance;
    }
}