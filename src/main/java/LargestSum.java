
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        if (nums == null || nums.size() < 2) {
            return 0;
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < nums.size(); i++) {
            int current = nums.get(i);
            if (current > largest) {
                secondLargest = largest;
                largest = current;  
            } else if (current > secondLargest && current <= largest) {
                secondLargest = current;
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            return 0;
        }
        
        return largest + secondLargest;
    }
}