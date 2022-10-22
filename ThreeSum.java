import java.util.ArrayList;
import java.util.HashMap;

public class ThreeSum {

    public static void main(String[] args) {
        
        int[] random = {1, 2, 3, 4, 5, 6, 7, 8};

        int target = 18; //enter a target

        System.out.println("test");
        HashMap hmap1 = new HashMap();
        int cnt = 0;
        for(int i =0; i<random.length;i++){
            for(int j=0; j<random.length; j++){
                cnt++;
                int curSum = random[i] + random[j];
                int compliment = target - curSum;
                if(hmap1.containsKey(compliment)){
                    System.out.println("index " +random[i]+" + index "+random[j]+" + index "+hmap1.get(compliment)+" = "+target);
                }
                else{
                    hmap1.put(curSum, cnt);
                }
            }
        }
    }


}