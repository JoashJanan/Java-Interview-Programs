package com.interview;

public class RotationfoundString {
	//str1 + str1 = ABCDABCD
	//ABCDABCD =

	public static boolean rotationstr(String str1,String str2)
	{
		return(str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="ABCD";
String str2="CDAF";

if(rotationstr(str1, str2))
{
	System.out.println("rotation string is present");
}
else
{
 System.out.println("rotation not found");	
}

	}

}
