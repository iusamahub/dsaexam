package beans;

public class Sorting {

	public void BubbleSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			boolean flag=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					flag=true;
				}
			}
			if(!flag) {
				break;
			}
		}
	}

	public void SelectionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
	}
	
}






