package javabasics;

import java.util.Arrays;

public class RemainingElementofRangeInArray {
	public static void main(String[] args) {
		int[] array= {2,5,7,6,3,9};
		
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int[] array2=Arrays.copyOf(array, 10);
		for(int i=0;i<array2.length;i++)
		{
			if(i!=array2[i])
			{
				array2[i]=i;
			}
		}
		System.out.println(Arrays.toString(array2));
	}

}
