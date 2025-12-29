class SelectionSortDes{
	public static void main(String args[]){
		int[] arr = {4,8,1,9,10,5};
		System.out.println("Before sorting ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		int min_index = 0;
		for(int i=0;i<arr.length;i++){
			min_index = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[min_index]>arr[j]){
					min_index = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index] = temp;
		}
		System.out.println();
		System.out.println("After sorting");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}