package com.array.soniya;

public class Sortarray {
	public static int[] sort(int[] array)
	{
		int[] arr=new int[array.length-1];
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++)
			{
			  if(array[i]>array[j])
			  {
				  int temp=0;
				  temp=array[i];
				  array[i]=array[j];
				  array[j]=temp;
				  
				 
			  }
			  
			}
			System.out.println(array[i]);
		}
		return arr;
		
		
	}
public static void main(String[] args) {
	int[] array= {1,3,5,2,5,4,6};
	
	sort(array);
}
}
