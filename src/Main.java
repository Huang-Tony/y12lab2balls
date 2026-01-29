public class Main {
    public static void main(String[] args) {
        CruiseShip ship=new CruiseShip("ship1", 5);

        Destination d1=new Destination("place1");
        Destination d2=new Destination("place1");

        Activity beach=new AttractionVisit("beach1", "balls", 75, 3);
        Activity walk=new WalkingTour("tour1", "balls", 45, 4, 3.5);
        TheaterShow show=new TheaterShow("suitsbrooklyn67", "balls", 85, 20);
        show.addStar(new TheaterShow.Star("tony1", "ballszz"));
        show.addStar(new TheaterShow.Star("tony2", "bal!z"));


        d1.addActivity(beach);
        d1.addActivity(show);
        d2.addActivity(walk);

        ship.addDestination(d1);
        ship.addDestination(d2);

        Passenger p1=new StandardPSG("balls1", 677, 2);
        Passenger p2=new SeniorPSG("balls2", 2, 15);
        Passenger p3=new PremiumPSG("balls67", 3);

        ship.addPsg(p1);
        ship.addPsg(p2);
        ship.addPsg(p3);

        p1.signUp(beach);
        p2.signUp(show);
        p3.signUp(walk);

        ship.printItinerary();
        System.out.println();
        ship.printPsgList();
        System.out.println();
        ship.printPsgDetails(p1);
        System.out.println();
        ship.availableActivities();
    }
}