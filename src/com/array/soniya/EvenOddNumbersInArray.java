package com.array.soniya;

public class EvenOddNumbersInArray {
	public static void main(String args[])
	{
	int[] arr={2,3,4,6,8,9,12,13,16,15};
	printeven(arr);
	printodd(arr);
	}
	public static void printeven(int[] arr)
	{
	int sumeven=0;
	System.out.println("Even nubers");
	for(int i=0;i<arr.length;i++)
	{
	if(arr[i]%2==0)
	{
	System.out.println(arr[i]);
	sumeven=sumeven+arr[i];
	arr[i]++;
	}
	}
	System.out.println("Sum of even numbers=" +sumeven);
	}

	public static void printodd(int[] arr)
	{
	int sumodd=0;
	System.out.println("Odd numbers");
	for(int i=0;i<arr.length;i++)
	{
	if(arr[i]%2!=0)
	{
	System.out.println(arr[i]);
	sumodd=sumodd+arr[i];
	arr[i]++;
	}
	}
	System.out.println("Sum of odd numbers=" +sumodd);
	}
	
}
