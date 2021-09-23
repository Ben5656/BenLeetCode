package src;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] indicies = new int[2];
        for(int x = 0; x < nums.length; x++){
            int xVal = nums[x];
            for(int y = 0; y < nums.length; y++){
                int yVal = nums[y];
                if(xVal+yVal == target){
                    if(x == y){
                        break;
                    } else {
                        indicies[0] = x;
                        indicies[1] = y;
                        return indicies;
                    }
                }
            }
        }
        return indicies;
    }
}
