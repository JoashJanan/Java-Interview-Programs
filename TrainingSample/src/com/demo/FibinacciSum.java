package com.demo;

public class FibinacciSum {
	
	
	public int fbinaSum(int a)
	{
		int sum=0;
		int n1=0,n2=1,n3=0;
		System.out.print(n1 + " "+n2);
		for(int i=2;i<a;i++)
		{
			n3=n1+n2;
			sum= sum+n3;
			System.out.print(""+n3);
			n1=n2;
			n2=n3;
			
		}
		return sum+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FibinacciSum obj= new FibinacciSum();
		int s=obj.fbinaSum(4);
		System.out.println();
		System.out.println(s);
	}

}
