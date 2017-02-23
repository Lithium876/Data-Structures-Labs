/*ALGORITHM       : SELECTION SORT
 *BIG O RUN TIME  : O(n^2) - QUADRATIC **/
public class selection_sort {

	public static void main(String[] args) {
		selection_sort SS = new selection_sort();
		
		int integer_array[] = {50, 70, 20, 30, 80, 25, 43, 19};
		String string_array[] = {"Paul", "James", "Bob", "Lilly", "Anna", "Queen", "Chris"};
		
		System.out.print("Original Integer List:  ");
		for(int l=-0;l<integer_array.length;l++){
			System.out.print(integer_array[l]+" ");
		}
		System.out.println();
		
		SS.IntegerSelectionSort(integer_array, integer_array.length);
		
		System.out.print("\nOriginal String List:   ");
		for(int l=-0;l<string_array.length;l++){
			System.out.print(string_array[l]+", ");
		}
		System.out.println();
		
		SS.StringSelectionSort(string_array, string_array.length);
	}
	
	public void IntegerSelectionSort(int Arr[], int Size){
		int i, IndexSmallest, Temp;
		
		for(i = 0; i < Size-1; i++){ 
			IndexSmallest =i;
			 for(int j = i+1; j < Size; j++){ 
				 if(Arr[j]<Arr[IndexSmallest]){
					 IndexSmallest = j;
				 }
			 }
			 Temp = Arr[IndexSmallest];
			 Arr[IndexSmallest] = Arr[i];
			 Arr[i] = Temp;
			 
			 System.out.print("\tPass "+(i+1)+":\t\t");
				for(int l=-0;l<Size;l++){
					System.out.print(Arr[l]+" ");
				}
				System.out.println();
		}
	}
	
	public void StringSelectionSort(String Arr[], int Size){
		String Temp;
		int i, IndexSmallest;
		
		for(i=0;i<Size-1;i++){
			IndexSmallest = i;
			for(int j=i+1; j<Size;j++){
				if(Arr[j].compareTo(Arr[IndexSmallest])<0){
					IndexSmallest = j;
				}
			}
			Temp = Arr[i];
			Arr[i] = Arr[IndexSmallest];
			Arr[IndexSmallest] = Temp;
		
			System.out.print("\tPass "+(i+1)+":\t\t");
			for(int l=-0;l<Size;l++){
				System.out.print(Arr[l]+", ");
			}
			System.out.println();
		}
		
	}
}
