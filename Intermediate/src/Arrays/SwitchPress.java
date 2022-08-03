package Arrays;

import java.util.ArrayList;

public class SwitchPress {

    public int bulbs(ArrayList<Integer> A) {

        int switchPress = 0;
        int currState = 0;
        for(int i = 0 ;i<A.size() ; i++){

            if(switchPress%2==0){
                currState = A.get(i);
            }
            else{
                currState = A.get(i)==0?1:0;
            }
            if(currState == 0){
                switchPress++;
            }

        }
        return switchPress;
    }

}
