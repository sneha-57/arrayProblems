package arrayProblems;

import java.util.Arrays;

/*Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false] 
Explanation: There is only 1 extra candy.
Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.*/

public class ExtraCandies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] candies= {2,3,5,1,3};;
		int extra=3;
		int len=candies.length;
		boolean[] ans=new boolean[len];
		
		/*
		 * for (int i=0;i<len;i++) { candies[i]=candies[i]+extra; }
		 */
		System.out.println(Arrays.toString(candies));
		int target=0;
		for(int i=0;i<len;i++) {
			target=candies[i]+extra;
			//System.out.println("for i equals : "+i+" value of element : "+candies[i]);
			ans[i]=findMax(candies,target);
			//target=0;
		}
		
		System.out.println(Arrays.toString(ans));
		
		

	}
	
	static boolean findMax(int[] a, int num) {
		
		int max=num;
		boolean ans = false;
		for(int i=0;i<a.length;i++) {
			//System.out.println("value of target : "+max+" value of element : "+a[i]);
			if(max>a[i] || max==a[i]) {
			//	System.out.println("Inside if target greater than array element ");
				ans=true;
				
				}else {
					ans=false;
					break;
				}
		}
		
		return ans;
	}
	
	/*
	 * Input: candies = [2,3,5,1,3], extraCandies = 3 Output:
	 * [true,true,true,false,true]
	 */

}
