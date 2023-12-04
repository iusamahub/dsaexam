package Code2;

import java.util.Scanner;

public class BubbleSort {

	public static void bubbleSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		
		
	}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of an array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println("Enter a number");
			int val=sc.nextInt();
			NumberClass ob=new NumberClass(val);
			arr[i]=ob.getNo();
			
		}
		
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(" ");
		bubbleSort(arr);
		System.out.println("After Bubble Sort");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}