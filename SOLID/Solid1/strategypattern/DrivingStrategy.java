package strategypattern;

public class DrivingStrategy implements RouteStrategy{


    public int calculateTime(int distance){
        return 2*distance;
    }
}
