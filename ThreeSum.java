import java.util.ArrayList;
import java.util.HashMap;

public class ThreeSum {

    public static void main(String[] args) {
        
        int[] random = {7,2,1,1,3,4,5,4};

        int target = 18; //enter a target

        System.out.println("test");
        HashMap hmap1 = new HashMap();
        int cnt = 0;
        int max = 0;
        for(int i =0; i<random.length;i++){
            for(int j=0; j<random.length; j++){
                cnt++;
                max = (random[i]>max) ? random[i] : max; //gets rid of duplicate sum issue in hmap
                int curSum = random[i] + random[j];
                int compliment = target - curSum;
                if(hmap1.containsKey(compliment)&&compliment<=max){
                    System.out.println(" " +random[i]+" + "+random[j]+" + "+ compliment +" = "+target);
                }
                else{
                    hmap1.put(curSum, cnt);
                }
            }
        }
    }


}