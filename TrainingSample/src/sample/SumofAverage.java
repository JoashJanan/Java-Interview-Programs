package sample;

import java.util.Scanner;

public class SumofAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,sum=0,value=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limites:");
		size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{			
			//sum=sum+i;
			System.out.println("enter value for sum");
			value=sc.nextInt();
			sum=value+size;
		}
		System.out.println("your value "+sum+"average is "+sum/2);
	}

}
