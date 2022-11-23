package StringPattern.ZAlgo;

public class ZAlgo {


    /*
        Both gives correct ans
     */

    public static void zalgo(String s){

        int n = s.length();

        int l = 0; /* already info segment*/
        int r = 0; /* segment where we have common years */

        int z[] = new int[s.length()];

        for(int i = 1; i<n; i++){

            if(i>r){    // No info
                // brute force
                int j = i;
                int k = 0;
                while(j<s.length() && s.charAt(j) == s.charAt(k) ){
                    k++;
                    j++;
                }
                z[i] = k; // its like k+1 ,
                l = i;
                r = j-1;
            }else{

                if(z[i-l]<r-i+1){ // if happy years at prefix num < common years remaining ... blind copy
                    // z[i-l]  - happy years for prefix number
                    // r-i-1   - gives remaining years

                    z[i] = z[i-l];

                }else{

                    // else start bruteforce
                    int j = r+1;
                    int k = r-i+1;
                    //
                    while(j<s.length() && s.charAt(j) == s.charAt(k) ){
                        k++;
                        j++;
                    }
                    z[i] = k;
                    l = i;
                    r = j-1;

                }
            }
        }


        for(int y:z){
            System.out.print(y+" ");
        }

    }
    /*
        Z algo with optimization

     */
    public static void selfzalgo(String s){

        int n = s.length();

        int l = 0; /* already info segment*/
        int r = 0; /* segment where we have common years */

        int z[] = new int[s.length()];

        for(int i = 1; i<n; i++){

            if(i>r){    // No info
                // brute force
                int j = i;
                int k = 0;
                while(j<s.length() && s.charAt(j) == s.charAt(k) ){
                    k++;
                    j++;
                }
                z[i] = k; // its like k+1 ,
                l = i;
                r = j-1;
            }else{
//                if(i == 17){
//                    System.out.println("z[i-l] "+z[i-l] +" , r-i+1"+(r-i+1));
//                }
                if(z[i-l]< r-i+1){ // if happy years at prefix num < common years remaining ... blind copy
                    // z[i-l]  - happy years for prefix number
                    // r-i-1   - gives remaining years


                    z[i] = z[i-l];

                }else{

                    // else start bruteforce
                    int j = r+1;
//                    int k = r-i+1;  // This was in psuedocode , This also works
                    int k = j-i; // because we want to start from where comparision is not done already
                    //
                    while(j<s.length() && s.charAt(j) == s.charAt(k) ){
                        k++;
                        j++;
                    }
                    z[i] = k;
                    l = i;
                    r = j-1;

                }
            }
        }


        for(int y:z){
            System.out.print(y+" ");
        }

    }

    public static void main(String[] args) {
//        zalgo("xxyzxxyzwxxyzxxyzx");
        zalgo("xxyzxxyzwwxxyzxxyzx");
        System.out.println();
        selfzalgo("xxyzxxyzwwxxyzxxyzx");
    }


}
