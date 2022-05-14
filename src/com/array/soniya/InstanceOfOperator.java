package com.array.soniya;

import java.util.Arrays;

public class InstanceOfOperator {
	public static void main(String[] args) {
		
		StudentForInstance s=new StudentForInstance(10,"soniya","pune");
	    String s1 = "pqr";
	    Object[] o= {s,s1};
	    System.out.println(Arrays.toString(o));
	    
	    System.out.println("*********************");
	    
	    for(Object n:o)
	    {
	    	if(n instanceof StudentForInstance)
	    	{
	    		System.out.println(n);
	    	}
	    }
	}

}
