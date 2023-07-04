package com.demo;

public class ArrayValFindPosition {
	
	
	public static int pri(int[] as, int v)
	{
		 
		 boolean found =false;
		 int val=0;
		 int finditem=0;
		for(int i=0;i<as.length;i++)
		{
		if (as[i]==v)	
		{
			found = true;
			val=i;
			finditem=as[i];
		break;
		}
		 
			
		}

		if(found==true)
		{

		System.out.println(finditem+" is found  in the possition of :"+val);	
		}
		else
		{
			System.out.println("not found");
			
		}
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
 int[] a= {1,2,3};
 int item=3;
 boolean found =false;
 int val=0;
 pri(a,item);
	/*
	 * for(int i=0;i<a.length;i++) { if (a[i]==item) { found = true; val=i; break; }
	 * 
	 * 
	 * }
	 * 
	 * if(found==true) {
	 * 
	 * System.out.println("found"+val); } else { System.out.println("not found"); }
	 */
}


	}


