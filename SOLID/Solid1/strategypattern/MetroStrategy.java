package strategypattern;

public class MetroStrategy implements RouteStrategy {
    public int calculateTime(int distance) {
        return 5 * distance;
    }
}
