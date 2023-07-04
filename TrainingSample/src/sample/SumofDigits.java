package sample;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size,value=0,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limites:");
		size=sc.nextInt();
		
		while(size!=0)
		{
			
			sum=sum+size%10;
			System.out.print("->"+size%10);
			size=size/10;
			//System.out.println(size);
		}
		System.out.println("total :"+sum);
		/*
		 * for(int i=1;i<=size;i++) { //sum=sum+i; value=sc.nextInt(); sum=value+sum;
		 * 
		 * } System.out.println("your enter value"+sum+""+sum/2);
		 */
	}

}
