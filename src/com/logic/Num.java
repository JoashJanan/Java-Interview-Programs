package com.logic;
import java.util.*;
public class Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6, 2, 3, 4, 43, 6, 7, 5, 6, 34, 4};
        int[] uniqueArr = new int[arr.length];
        int counter = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                uniqueArr[counter] = arr[i];
                counter++;
            }
        }
        uniqueArr[counter] = arr[arr.length - 1];
        System.out.println("Array with Unique Elements : ");
        for (int i = 0; i <= counter; i++) {
            System.out.println(uniqueArr[i]);
        }

	}

}
