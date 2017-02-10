
public class selectionSort {
	
	int[] values;
	
	public static void main(String[] args) {
		int[] array = {18, 7, 6, 28, 1, 9, 4};
        selectionSort sortarr = new selectionSort();
        sortarr.values = array;
        sortarr.SelectionSort();
		
	}
	
	public void SelectionSort(){
		System.out.println("Unsorted: ");
		for(int i=0; i < values.length; i++){
            System.out.print(values[i]+ " ");
        }
		
		for(int i = 0; i < values.length-1; i++){ //0-6 
			 for(int j = i+1; j < values.length; j++){ //1 - 7
				 int smallestIndex =i;
				 System.out.println("\nIs "+values[j]+"<"+values[smallestIndex]+"?");
				 if(values[j]>values[smallestIndex]){
					 smallestIndex = j;
					 int temp = values[i];
					 values[i] = values[j];
					 values[j] = temp;
				 }
			 }
			 int pass = i+1;
			 System.out.println("\n\nPass "+pass+": ");
				for(int k=0; k < values.length; k++){
		            System.out.print(values[k]+ " ");
		        }
		}
		System.out.println("\n\nSorted: ");
		for(int i=0; i < values.length; i++){
            System.out.print(+values[i]+ " ");
        }
    }
}
