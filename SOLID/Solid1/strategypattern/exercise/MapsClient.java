package strategypattern.exercise;

public class MapsClient {

    public static void main(String args[]){
        RouteCalculator routeCalculator = new RouteCalculator(new DrivingStrategy());
        int distance = 15;
        routeCalculator.calculateTime(distance);
        routeCalculator.setStrategy(new TrafficAwareStrategy());
        routeCalculator.calculateTime(distance);
        /*
            Similarly for rest strategies
         */

    }
}
