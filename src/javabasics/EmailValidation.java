package javabasics;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
	public static void main(String[] args) {
	String regex="^[a-zA-Z0-9_.]+ @[a-z0-9.]$";	
	ArrayList<String> al=new ArrayList();
	al.add("soniyasable@gmail.com");
Pattern pattern=Pattern.compile(regex);

for(String email:al)
{Matcher matcher=pattern.matcher(email); 
if(matcher.matches())
{
	System.out.println("valid Email Id");
}
else
{
	
}
	}
}
}
