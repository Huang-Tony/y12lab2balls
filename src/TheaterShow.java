import java.util.ArrayList;
import java.util.List;

public class TheaterShow extends Activity{
    public static class Star{
        private String actorName;
        private String characterName;

        public Star(String actorName, String characterName) {
            this.actorName = actorName;
            this.characterName = characterName;
        }

        public String getActorName() {
            return actorName;
        }

        public String getCharacterName() {
            return characterName;
        }

        @Override
        public String toString(){
            return actorName+" as "+characterName;
        }
    }

    private List<Star> stars;

    public TheaterShow(String name, String description, double cost, int capacity) {
        super(name, description, cost, capacity);
        this.stars=new ArrayList<>();
    }

    public void addStar(Star s){
        stars.add(s);
    }

    public List<Star> getStars() {
        return new ArrayList<>(stars);
    }

    @Override
    protected String getExtraInfo(){
        if(stars.size()==0){
            return "Theater Show, No Stars";
        }
        String output="Theater Show, Stars: ";
        for(int i=0;i<stars.size();i++){
            if(i>0 && i!=stars.size()-1){
                output+=",";
                output+=stars.get(i);
            }
            output+=stars.get(i);
        }
        return output;
    }
}