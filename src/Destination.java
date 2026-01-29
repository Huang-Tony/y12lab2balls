import java.util.ArrayList;
import java.util.List;

public class Destination{
    private String name;
    private List<Activity> activities;

    public Destination(String name) {
        this.name = name;
        this.activities=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addActivity(Activity ac){
        activities.add(ac);
        ac.setDestination(this);
    }

    public List<Activity> getActivities(){
        return new ArrayList<>(activities);
    }

    public List<Activity> getOpenActivities(){
        List<Activity> output=new ArrayList<>();
        for(Activity a:activities){
            if(a.hasSpace()){
                output.add(a);
            }
        }
        return output;
    }

    @Override
    public String toString(){
        return "Destination: "+name;
    }
}