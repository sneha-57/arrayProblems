package arrayProblems;

import java.util.Arrays;

//Shuffle the Array

/*Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].*/

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums= {2,4,6,8,3,6,9,12};
		int[] ans =new int[nums.length];
		int n=4;
		//int len=3;
		for(int i=0,j=1;i<nums.length;i++) {
			
			if(i==0) {
				ans[i]=nums[i];
				
			}else if(i%2==0) {
				ans[i]=nums[j];
				j=j+1;
			}else {
				ans[i]=nums[n];
				n=n+1;
			}
		}
		
		System.out.println(Arrays.toString(ans));
		
	}

}
