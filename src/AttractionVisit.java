public class AttractionVisit extends Activity{
    public AttractionVisit(String name, String description, double cost, int capacity) {
        super(name, description, cost, capacity);
    }

    @Override
    protected String getExtraInfo(){
        return "Attraction Visit";
    }
}