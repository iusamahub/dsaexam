package test;

import java.util.Arrays;
import beans.Sorting;
public class test {

	public static void main(String[] args) {
		Sorting ob=new Sorting();
		int [] arr= {3,5,1,2,34,23,7,89,89,0,4};
		System.out.println("Array Before Sort: ");
		System.out.println(Arrays.toString(arr));
		ob.BubbleSort(arr);
		System.out.println("Array After Bubble Sort: ");
		System.out.println(Arrays.toString(arr));
		ob.SelectionSort(arr);
		System.out.println("Array After Selection Sort: ");
		System.out.println(Arrays.toString(arr));
	}

}
