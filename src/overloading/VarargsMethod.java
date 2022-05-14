package overloading;

import java.util.Arrays;

public class VarargsMethod {

	public static void print(int i)
	{
		System.out.println("int i="+i);
	}
	
	public static void print(int i,char... c)
	{
		System.out.println("int i, char... c=" +i+ ","+c);
	}

	public static void print(int...i )
	{
		System.out.println("int...i="+i);
	}

	public static void main(String args[])
	{
		int[] j= {10,20,30};
		char[] d= {'a','d','g'};
		print(10,(d));
	     print(j);
		}
	}

