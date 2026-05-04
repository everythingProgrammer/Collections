package strategypattern;

public class RouteClient {

    public static void main(String args[]){
        FlexibleRouteCalculator calculator =
                new FlexibleRouteCalculator(new DrivingStrategy());

        System.out.println(calculator.calculate(10));

        calculator.setStrategy(new WalkingStrategy());

        System.out.println(calculator.calculate(10));
    }
}
