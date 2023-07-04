package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {1,2,3};
		int[] b= {4,5,6,3};
		int Asize=a.length;
		int Bsize=b.length;
		int[] merg=new int[Asize+Bsize];
		
		for(int i=0;i<a.length;i++)
		{
			merg[i]=a[i];
		}
		
		for(int j=0;j<b.length;j++)
		{
			merg[Asize+j]=b[j];
		}
		
		
		/*-----------------*/
		List<Integer> li= new ArrayList<Integer>();
		List<Integer> Duplicate =new ArrayList<Integer>();
		for(Integer adds:merg)  // add int array items to Integer list array
		{
			li.add(adds);
		}
		
		for(int s:li)
		{
			System.out.print(s);
			if(!Duplicate.contains(s))
			{
				Duplicate.add(s);
			}

		}
		
		System.out.print(Duplicate);
		
		
		
			

	}

}
