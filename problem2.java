public class problem2 {
    class Solve {
        int[] findTwoElement(int arr[], int n) {
            int[] result = new int[2];
    
            for (int i = 0; i < n; i++) {
                int val = Math.abs(arr[i]);
                
                if (arr[val - 1] > 0) {
                    arr[val - 1] = -arr[val - 1];
                } 
                else {
                    result[0] = val; // Repeating number
                }
                
            }
    
            for (int i = 0; i < n; i++) {
                if (arr[i] > 0) {
                    result[1] = i + 1; // Missing number
                    break;
                }
            }
    
            return result;
        }
    }
}
