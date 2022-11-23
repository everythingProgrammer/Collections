package StringPattern.ZAlgo;

public class ZValues {


    /*
        Tc: O(n^2)
     */
    public static void setValues(String a){

        int count[] = new int [a.length()];

        for(int i = 1 ; i<a.length(); i++){
            int curr_count = 0;
            /*
                This if can be replaced with the while loop itself
             */
            if(a.charAt(i) == a.charAt(0)){
                int k = i;
                while(k<a.length() && a.charAt(k)== a.charAt(k-i)){
                    curr_count ++;
                    k++;
                }
                count[i] = curr_count;
            }
            /*
                This else can be removed
             */
            else{
                count[i] = curr_count;
            }

        }
        for(int b:count){
            System.out.print(b+" ");
        }
    }


    /*
        Improvised previous based on class notes
        TC: O(n^2)
     */
    public static void setValues2(String a){

        int count[] = new int [a.length()];

        for(int i = 1 ; i<a.length(); i++){

            int j = i;
            int k = 0;
            while(j<a.length() && a.charAt(j) == a.charAt(k)){
                j++;
                k++;
            }
            count[i] = k;

        }
        for(int b:count){
            System.out.print(b+" ");
        }
    }







    public static void main(String[] args) {
        String a  = "xxyzxxyzwwxxyzxxyzx";
        setValues(a);
        System.out.println();
        setValues2(a);
    }

}
