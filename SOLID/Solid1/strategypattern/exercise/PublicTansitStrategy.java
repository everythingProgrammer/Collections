package strategypattern.exercise;

public class PublicTansitStrategy implements RouteStrategy{
    @Override
    public int calculateTime(int distance) {
        return distance *10;
    }
}
