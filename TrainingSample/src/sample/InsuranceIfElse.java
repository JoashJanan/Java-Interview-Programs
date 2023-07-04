package sample;
import java.util.*;
public class InsuranceIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char Gen,mat;
		int age;
		System.out.println("Enter matrial status:m/u");
		Scanner sc=new Scanner(System.in);
		mat=sc.next().charAt(0);
		System.out.println("Enter your gender:m/f");
		Gen=sc.next().charAt(0);
		System.out.println("Enter your age:");
		age=sc.nextInt();
		if(mat=='m')
		{
			System.out.println("driver is insured");
		}
		else if(mat=='u'&&Gen=='m'&&age>30)
		{
			System.out.println("driver is insured");
		}
		else if(mat=='u'&&Gen=='f'&& age>25)
		{
			System.out.println("driver is insured");
		}
		else
		{
			System.out.println("driver is not insured");
		}
	}

}
