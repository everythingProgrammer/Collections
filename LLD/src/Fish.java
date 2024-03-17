public class Fish extends Aquatic {
    Fish(){
        super(); // super has to be the first statement in constructor body  NECESSARILY.
        System.out.println("I'm called a fish");
    }

    private void movement(){
        System.out.println("Fishes Swim");
    }

    protected void breathe(){
        System.out.println("Fishes Breathe using Gills");
    }


}
