package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class RemovDub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] a= {1,2,6,3,3,4,5,4,2};
 int j=0;
 Arrays.sort(a); 
 System.out.print("sorted array: ");
 for(int val:a)
 {
 System.out.print(+val);
 }
 int size=a.length;
 int[] b=new int[size];
 for(int i=0;i<a.length-1;i++)
 {
	 System.out.println(" I value: "+i);
	 System.out.println(" 1st value: "+a[i]);
	 System.out.println(" 2nd value  : "+"i="+i+"<-"+a[i+1]);
	 
	 if(a[i]!=a[i+1])
	 {
		 System.out.print("iteration array: "+a[i+1]);
		 b[j]=a[i];
		 System.out.println(" value inserted: "+b[j]);
		 System.out.println(" ________________  ");
		 j++;
	 }
 }
 
 b[j]=a[a.length-1];
 System.out.println("Last value inserted: "+b[j]);
System.out.println("No of unique values:"+j);
 for(int k=0;k<=j;k++)
 {
	 System.out.print(" "+b[k]);
 }
 
 System.out.println("------------------");
 Integer[] val= {2,4,4,5,5,7,8,9,8};
 
 Arrays.sort(val);
 
 //List<Integer> li= Arrays.asList(val);
 List<Integer> updated= new ArrayList<Integer>();
 
 for(int up:val)
 {
	 if(!updated.contains(up))
	 {
		updated.add(up) ;
	 }
 }
 
 for(int fnl : updated)
 {
	 System.out.print(" "+fnl);
 }
	}

}
