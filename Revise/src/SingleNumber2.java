import java.util.List;

public class SingleNumber2 {

    public int singleNumber(final List<Integer> A) {

        int num = 0;
        for(int i  = 0;i<32 ; i++){
            int count = 0;

            for(int j = 0;j<A.size(); j++){
                if((A.get(j) & 1<<i)>0 ){
                    count++;
                }
            }
            if(count%3!=0){
                num = num| 1<<i;
            }

        }
        return num;

    }

}
