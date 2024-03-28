public class Test {

	    public int[] twoSum(int[] numbers, int target) {
	        int left = 0;
	        int right = numbers.length - 1;
	        
	        while (left < right) {
	            int sum = numbers[left] + numbers[right];
	            if (sum == target) {
	                return new int[]{left + 1, right + 1}; // 1-indexed
	            } else if (sum < target) {
	                left++;
	            } else {
	                right--;
	            }
	        }
	        
	        // If no solution found
	        return new int[]{-1, -1};
	    }

	    public static void main(String[] args) {
	        Test solution = new Test();
	        int[] numbers = {2, 7, 11, 15};
	        int target = 9;
	        int[] result = solution.twoSum(numbers, target);
	        
	        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
	    }
}