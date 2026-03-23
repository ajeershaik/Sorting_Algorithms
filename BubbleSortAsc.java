import java.util.*;
class BubbleSortAsc{
	public static void main(String args[]){
		int[] arr = {4,20,3,10,17,0,1,5};
		int n= arr.length;
		System.out.println("Before Sorting");
		for(int i:arr){
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("After Sorting");
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
}