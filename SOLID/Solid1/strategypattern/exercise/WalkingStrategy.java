package strategypattern.exercise;

public class WalkingStrategy implements RouteStrategy{
    @Override
    public int calculateTime(int distance) {
        return distance*10;
    }
}
