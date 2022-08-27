package Strings.LearningStringBuilder;

public class Example1 {





    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();

        str.append("GFG");

        StringBuilder st2 = new StringBuilder("Somthing Written Here");
        String abc = "asdlfjls";
        System.out.println(st2.substring(0,3));
        StringBuilder st3 = new StringBuilder(abc);

        StringBuilder str3 = new StringBuilder();
        char [] chr  = { 'A','B','C','D'};
//        str3.append(chr);

        // public StringBuilder append(char[] cstr, int iset, int ilenght)

        char[] fn = {'A','b','v'};
        char[] bn = {'h','i','n','a' };
        str3.append(fn);
        str3.append(bn,0,4);
//        System.out.println(" Str 3 "+ str3 );

        str3.appendCodePoint(34);


        /*
                Not Sure of how capacity works
         */
//        StringBuilder str4 = new StringBuilder();
//        System.out.println(" Capacity "+str4.capacity());
//        str4.append("a");
//        System.out.println("new Capacity 1 "+str4.capacity());
//        str4.append("b");
//        System.out.println("new Capacity 2 "+str4.capacity());
//        str4.append("cdefghijklmnopfsdfsdfs");
//        System.out.println("new Capacity 3 "+str4.capacity());
//        str4.append("cdefghijklmnopqrstuvwxyz");
//        System.out.println("new Capacity "+str4.capacity());








    }


}
