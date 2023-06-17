import java.util.ArrayList;

public class ContainerWithMostWater {
    public int maxArea(ArrayList<Integer> A) {

        if(A==null) return 0;
        int maxWater = 0;

        int i= 0;
        int j = A.size()-1;


        while(i<j){

            int h = Math.min(A.get(i) , A.get(j));
            int a = j-i;

            maxWater = Math.max(maxWater, (h*a));

            if(A.get(i)<A.get(j)){
                i++;
                while( j>i &&    maxWater > (A.get(j) * (j-i) )){

                    j--;
                }


            }else if(A.get(i)>A.get(j)){
                j--;
                while( i<j &&    maxWater > (A.get(i) * (j-i) )){

                    i++;
                }
            }else if(A.get(i) == A.get(j)){
                i++;
                j--;
            }
        }
        return maxWater;

    }
}
