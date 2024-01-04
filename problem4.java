import java.util.*;
public class problem4 {
    class Solution {
        public int countDistinct(int[] nums, int k, int p) {
            HashSet<List<Integer>> subarrays = new HashSet<>();
            
            for(int i = 0; i < nums.length; i++){
                List<Integer> sub = new ArrayList<>(200);
                int count = 0;
                for(int j = i; j < nums.length; j++){
                    if(nums[j] % p == 0){
                        if(count == k){
                            break;
                        }
                        count++;
                    }
                    sub.add(nums[j]);
                    subarrays.add(new ArrayList<Integer>(sub));
                }
    
            }
    
            return subarrays.size();
    
        }
    
    
    }
}
