public class CopyConstructors {

    public static void main(String[] args) {

        Student std1 = new Student("Ankur", "A1");
        Student std2 = new Student(std1);
        System.out.println(std1.toString());
        System.out.println(std2.toString());




    }


}




