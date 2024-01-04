import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*You are given a 2D 0-indexed array of strings, access_times, with size n. For each i where 0 <= i <= n - 1, access_times[i][0] represents the name of an employee, and access_times[i][1] represents the access time of that employee. All entries in access_times are within the same day.

The access time is represented as four digits using a 24-hour time format, for example, "0800" or "2250".

An employee is said to be high-access if he has accessed the system three or more times within a one-hour period.

Times with exactly one hour of difference are not considered part of the same one-hour period. For example, "0815" and "0915" are not part of the same one-hour period.

Access times at the start and end of the day are not counted within the same one-hour period. For example, "0005" and "2350" are not part of the same one-hour period.

Return a list that contains the names of high-access employees with any order you want.

 

Example 1:

Input: access_times = [["a","0549"],["b","0457"],["a","0532"],["a","0621"],["b","0540"]]
Output: ["a"]
Explanation: "a" has three access times in the one-hour period of [05:32, 06:31] which are 05:32, 05:49, and 06:21.
But "b" does not have more than two access times at all.
So the answer is ["a"].*/

public class problem6 {
    //most optimised approach>>>>
    // class Solution {
    //     public List<String> findHighAccessEmployees(List<List<String>> access_times) {
    //         Map<String, List<String>> map = new HashMap<>();
    //         for (List<String> ls : access_times) {
    //             List<String> x = map.get(ls.get(0));
    //             if (x == null) {
    //                 x = new ArrayList<>();
    //                 map.put(ls.get(0), x);
    //             }
    //             x.add(ls.get(1));
    //         }
    
    //         List<String> result = new ArrayList<>(access_times.size());
    //         for (Map.Entry<String, List<String>> e : map.entrySet()) {
    //             List<String> x = e.getValue();
    //             int m = x.size();
    //             if (m < 3) {
    //                 continue;
    //             }
    
    //             int[] t = new int[m];
    //             for (int j = 0; j < m; ++j) {
    //                 String s = x.get(j);
    //                 t[j] = ((s.charAt(0) - '0') * 10 + s.charAt(1) - '0') * 60 + (s.charAt(2) - '0') * 10 + s.charAt(3) - '0';
    //             }
    //             Arrays.sort(t);
    
    //             for (int a = 0, b = 2; b < m; ++a, ++b) {
    //                 if ((t[b] - t[a]) < 60) {
    //                     result.add(e.getKey());
    //                     break;
    //                 }
    //             }
    //         }
    //         return result;
    //     }
    // }

    //most answered 

//     class Solution {
//     public List<String> findHighAccessEmployees(List<List<String>> access_times) {
//         Map<String,List<Integer>> map=new HashMap<>();
//         for(List<String> a:access_times){
//             if(!map.containsKey(a.get(0))){
//                 map.put(a.get(0),new ArrayList<>());
//             }
//             char[] s=a.get(1).toCharArray();
//             int h=(s[0]-'0')*10+s[1]-'0';
//             int m=(s[2]-'0')*10+s[3]-'0';
//             map.get(a.get(0)).add(h*60+m);
//         }
//         List<String> ans=new ArrayList<>();
//         for(String key:map.keySet()){
//             List<Integer> val=map.get(key);
//             Collections.sort(val);
//             for(int i=0;i<val.size()-2;i++){
//                 if(val.get(i+2)-val.get(i)<=59){
//                     ans.add(key);
//                     break;
//                 }
//             }
//         }
//         return ans;
//     }
// }
}
