public class Main {
    public static void main(String[] args) {


        Fish f = new Fish();
        System.out.println("----------------------------------------------");
//        Fish f = new Animal(); not allowed
        Animal a = new Fish();
        System.out.println("----------------------------------------------");
//        a.movement();  however not allowed
        a.breathe();
        System.out.println("----------------------------------------------");
    }
}