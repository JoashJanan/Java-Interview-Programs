package sample;
import java.util.*;
public class factorials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,fact=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the limites:");
		size=sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("your enter value "+ size +" factorial is "+fact);
	}

}
