package arrayProblems;

import java.util.Arrays;

// Running Sum of 1d Array
/*Input: nums = [1,2,3,4]
Output: [1,3,6,10]*/
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {1,2,3,4};
		int[] arrayOfSum= new int[nums.length];
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<=i;j++) {
				sum=sum+nums[j];
				
			}
			arrayOfSum[i]=sum;
			sum=0;
		}

		System.out.println(Arrays.toString(arrayOfSum));
	}

}
