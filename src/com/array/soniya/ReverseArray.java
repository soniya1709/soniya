package com.array.soniya;

import java.util.Arrays;

public class ReverseArray 
{
    public static void main(String[] args)
{
	int[] array= {1,6,3,8,9,5,4,7,2};
	Arrays.sort(array);
	System.out.println(Arrays.toString(array));
	for(int i=array.length-1;i>=0;i--)
	{
		System.out.println(array[i]);	
	
	}

	
}
}
