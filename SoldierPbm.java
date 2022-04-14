package arrayProblems;

import java.util.Arrays;

public class SoldierPbm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int[] live=new int[a.length/2];
		
		for(int i=0; i<a.length;i=i+2) {
			System.out.println(a[i]+" killed :"+a[i+1]);
			a[i+1]=0;
		}
		System.out.println(Arrays.toString(a));
	}

}
