package strategypattern.exercise;

public class TrafficAwareStrategy implements RouteStrategy{

    private DrivingStrategy drivingStrategy;

    public TrafficAwareStrategy(){
        drivingStrategy = new DrivingStrategy();

    }

    @Override
    public int calculateTime(int distance) {
        int normalDriveTime = drivingStrategy.calculateTime(distance);
        return normalDriveTime+12;
    }
}

/*
Improvement 3: Constructor injection in composed strategy
Current:

drivingStrategy = new DrivingStrategy();

This hardcodes dependency.

Bad for testing/extensibility.

Better:

public TrafficAwareStrategy(RouteStrategy baseStrategy)

Then:

this.baseStrategy = baseStrategy;

This keeps it flexible.

Now traffic can wrap any driving strategy.

Cleaner.
 */
