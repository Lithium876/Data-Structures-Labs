
public class quick_sort {

	public static void main(String[] args) {
		quick_sort QS = new quick_sort();
		int integer_array[] = {50, 70, 20, 30, 80, 25, 43, 19};
		
		System.out.print("Original Integer List:  ");
		for(int l=-0;l<integer_array.length;l++){
			System.out.print(integer_array[l]+" ");
		}
		System.out.println();
		QS.IntegerQuickSort(integer_array, 0, integer_array.length-1);
	}
	
	public int IntegerPartition(int arr[], int low, int high){
		int pivot = arr[high]; 
        int i = (low-1);
        for (int j=low; j<=high-1; j++)
        {
            if (arr[j] <= pivot)
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
	}
	
	 public void IntegerQuickSort(int arr[], int low, int high)
	    {
	        if (low < high)
	        {
	            int pi = IntegerPartition(arr, low, high);
	         
	            IntegerQuickSort(arr, low, pi-1);
	            IntegerQuickSort(arr, pi+1, high);
	        }
	    }
}
