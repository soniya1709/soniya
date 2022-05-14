package com.array.soniya;

import java.util.Arrays;

public class Uniquearrayelement {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,5,2,3,4};
	

	for(int i=0;i<=arr.length-1;i++)
	{
	int count=0;
		for(int j=i+1;j<=arr.length-1;j++)
		{
			if(arr[i]==arr[j])
			{
				count++;
				
			}
		}
		for(int k=i-1;k>=0;k--)
		{
			if(arr[i]==arr[k])
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(arr[i]);
		}
	}
	
	
}
}