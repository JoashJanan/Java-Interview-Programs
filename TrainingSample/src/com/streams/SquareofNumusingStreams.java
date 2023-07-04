package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareofNumusingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer a[]= {2,4,5,6,8,9,10,12};


List<Integer> li= Arrays.asList(a);
/*
for(int i=0;i<a.length;i++)
{
	li.add((a[i]));
}
*/
li.stream().map(n->n*n).filter(n->n>=100).forEach(System.out::println);
//System.out.println(li);
	}

}
