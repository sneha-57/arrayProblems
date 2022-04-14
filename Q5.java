package arrayProblems;

import java.util.Arrays;

//Remove Duplicates from Sorted Array
/*Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).*/
public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {0,0,1,1,1,2,2,3,3,4};
		leetcode(nums);
		/*
		 * int len=nums.length; System.out.println("old length : "+len); for(int i=0;
		 * i<nums.length;i++) { for(int j=i+1;j<nums.length;j++) {
		 * 
		 * if(nums[i]==nums[j]) {
		 * 
		 * --len;
		 * 
		 * 
		 * } } }
		 * 
		 * System.out.println("New length : "+len);
		 * System.out.println("new array : "+Arrays.toString(nums));
		 */
	}

	static int leetcode(int[] nums) {
		 int ans = 0;
		    for (int i = 0;i < nums.length-1;i++)
		    {
		    	System.out.println("nums[i] "+nums[i]);
		    	System.out.println("nums[i+1] "+nums[i+1]);
		        if (nums[i] != nums[i+1])
		        {
		            nums[++ans] = nums[i+1];
		            System.out.println("nums[++ans] "+nums[++ans]+" nums[i+1] "+nums[i+1]);
		            System.out.println("new array : "+Arrays.toString(nums));
		        }
		    }
		    System.out.println("New length : "+ans+1);
			System.out.println("new array : "+Arrays.toString(nums));
		    return ans+1;
	}
}
