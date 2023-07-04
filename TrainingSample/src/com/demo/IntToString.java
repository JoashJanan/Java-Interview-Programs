package com.demo;

import java.util.Scanner;

public class IntToString {
	
	
	public String StrPrint(int a)
	{
		String val = null;
		
		return val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntToString obj =new IntToString();
		
		Scanner sc =new Scanner(System.in);
		int value =sc.nextInt();
		int s = 0;
		for(int i=1;i<value;i++)
		{
			 s=sc.nextInt();
		}
		obj.StrPrint(s);

	}

}
