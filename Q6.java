package arrayProblems;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {56,54,34,26,65,57};
		int target=80;
		
		int[] answer=new int[2];
		answer=twoSum(arr,target);
		
		System.out.println(Arrays.toString(answer));

	}
	public static int[] twoSum(int[] nums, int target) {
		int[] res=new int[2];
		int sum=0;
		for(int i=0; i<nums.length;i++) {
			for(int j=0; j<nums.length;j++) {
				sum=0;
				if(i==j) {
					//System.out.println("exiting the loop as i and j are equal : "+i+" & : "+j);
					continue;
				}else {
					sum=nums[i]+nums[j];
					if(sum==target) {
						System.out.println("value of i : "+i+" value of j :"+j);
						res[0]=i;
						res[1]=j;
						return res;
					}
						
				}
				
			}
			
					
		}
		return res;
		
	}
}
