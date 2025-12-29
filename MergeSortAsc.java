import java.util.ArrayList;
class MergeSortAsc{
	public static void main(String args[]){
		int arr[] = {3,8,2,9,13,7,10,1};
		int n = arr.length;
		MergeSort(arr,0,n-1);
		for(int i:arr){
			System.out.println(i);
		}
	}

	public static void MergeSort(int[] arr,int low,int high){
		if(low<	high){
			int mid = (low+high)/2;
			MergeSort(arr,low,mid);
			MergeSort(arr,mid+1,high);
			Merge(arr,low,mid,high);
		}
	}
	public static void Merge(int arr[],int low,int mid,int high){
		int i = low;
		int j = mid+1;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(i<=mid && j<=high){
			if(arr[i] <= arr[j]){
				al.add(arr[i]);
				i++;
			}
			else{
				al.add(arr[j]);
				j++;
			}
		}
		while(i<=mid){
			al.add(arr[i]);
			i++;
		}
		while(j<=high){
			al.add(arr[j]);
			j++;
		}
		for (int k = 0; k < al.size(); k++) {
            arr[low+k] = al.get(k);
        }
	}
}