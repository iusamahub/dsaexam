package Code2;

import java.util.Scanner;

public class SelectionSort {

	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int minInd=i;
			
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<arr[minInd]) {
					minInd=j;
				}
			}
			
			if(minInd==i) {
				
				return;
			}else {
				int temp=arr[i];
				arr[i]=arr[minInd];
				arr[minInd]=temp;
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
		selectionSort(arr);
		System.out.println("After Selection Sort");
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}

}
