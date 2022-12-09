package com.array.soniya;

import java.util.Arrays;

public class ArrayMethods 
{
public static void main(String[] args) {
	System.out.println("inside main meyhod");
	int[] array= {1,3,2,6,4,5,8,9,12,13,24};
	int[] array1= {1,2,4,3,5,6};
	
	
	Arrays.sort(array);
	System.out.println(Arrays.toString(array));
	
	
	
	System.out.println(Arrays.binarySearch(array, 12));
	
	
	
	int removeindex=1;
	for(int i=removeindex;i<array.length-1;i++)
	{
		array[i]=array[i+1];
	}
	System.out.println(Arrays.toString(array));
	
	
	
	
	System.out.println(Arrays.equals(array,array1));

    
}
	
}
