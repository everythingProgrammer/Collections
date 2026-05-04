package strategypattern.exercise;

public class DrivingStrategy  implements RouteStrategy{

    @Override
    public int calculateTime(int distance) {
        return distance*10;
    }
}
