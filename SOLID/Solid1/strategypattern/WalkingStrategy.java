package strategypattern;

public class WalkingStrategy implements RouteStrategy {
    public int calculateTime(int distance) {
        return 10 * distance;
    }
}
