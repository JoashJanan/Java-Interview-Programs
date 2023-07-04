package com.interview;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersectinArray {

	public static void printintersection(int[] a,int[] b)
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={80,2,3,5,6};
int b[]={16,2,5,67};

Set<Integer> s = new HashSet<Integer>();

for(int i=0;i<a.length;i++)
{
	s.add(a[i]);
}
for(int i=0;i<b.length;i++)
{
	if(!s.contains(b[i]))
	{
		
		System.out.println(b[i]+" ");
	}
	
		
}

Set<Integer> unq = new HashSet<Integer>();

boolean contains = false;
for(int g=0;g<a.length;g++)
{
for(int h=0;h<b.length;h++)	
{
	if(a[g]!=b[h])
	{
		unq.add(a[g]);
		
		contains=true;
		break;
	}
}
}

if(!contains)
{
	//unq.add(a[i]);
	}
System.out.print(unq);

	}

}
