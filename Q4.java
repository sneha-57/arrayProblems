package arrayProblems;

import java.util.Arrays;

// How Many Numbers Are Smaller Than the Current Number

/*Input: nums = [6,5,4,8]
Output: [2,1,0,3]*/


public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {6,5,4,8};
		int[] res= new int[nums.length];
		
		for(int i=0;i<nums.length;i++) {
			res[i]=findSmallerThanCurrent(nums,nums[i],i);
		}
		System.out.println(Arrays.toString(res));

	}
	
	static int findSmallerThanCurrent(int[] nums,int target,int j){
		int count=0;
		int res=0;
		
			for(int i=0;i<nums.length;i++) {
				if(i!=j) {
					if(nums[i]<target) {
						count++;
					}
				}
			}
			res=count;
		
		
		return res;
		
		
	}

}
