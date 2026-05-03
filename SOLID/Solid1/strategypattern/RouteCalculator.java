package strategypattern;

public class RouteCalculator {


    /*
        Bad design

            calculator knows all algorithms
            adding BikeStrategy means modifying class
     */
    public int calculateTime(String mode , int distance){
        if(mode.equals("DRIVING")){
            return distance * 2;
        }else if (mode.equals("WALKING")){
            return distance * 10;
        }
        else if(mode.equals("METRO")){
            return distance*5;
        }
        throw new IllegalArgumentException();
    }
}
