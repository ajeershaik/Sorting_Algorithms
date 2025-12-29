class QuickSortAsc{
	public static void main(String args[]){
		int arr[] = {3,8,2,9,13,7,10,1};
		int n = arr.length;
		quickSort(arr,0,n-1);
		for(int i:arr){
			System.out.println(i);
		}
	}
	
	public static void quickSort(int arr[],int low,int high){
		if(low<high){
			int p = partition(arr,low,high);
			quickSort(arr,low,p-1);
			quickSort(arr,p+1,high);
		}
	}
	
	public static int partition(int arr[],int low,int high){
		int i = low+1;
		int j = high;
		int pivot = arr[low];
		while(i<=j){
			while(i<=high && arr[i]<=pivot){
				i++;
			}
			while(j>low && arr[j]>pivot){
				j--;
			}
			if(i<j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[low];
		arr[low] = arr[j];
		arr[j] = temp;
		return j;
	}
}