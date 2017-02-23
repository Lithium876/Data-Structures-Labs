/*ALGORITHM       : INSERTION SORT
 *BIG O RUN TIME  : O(n^2) - QUADRATIC **/
public class insertion_sort {

	public static void main(String[] args) {
		insertion_sort IS = new insertion_sort();
	
		int integer_array[] = {50, 70, 20, 30, 80, 25, 43, 19};
		String string_array[] = {"Paul", "James", "Bob", "Lilly", "Anna", "Queen", "Chris"};
		
		System.out.print("Original Integer List:  ");
		for(int l=-0;l<integer_array.length;l++){
			System.out.print(integer_array[l]+" ");
		}
		System.out.println();
		
		IS.IntegerInsertionSort(integer_array, integer_array.length);
		
		System.out.print("\nOriginal String List:   ");
		for(int l=-0;l<string_array.length;l++){
			System.out.print(string_array[l]+", ");
		}
		System.out.println();
		
		IS.StringInsertionSort(string_array, string_array.length);
	}
	
	public void IntegerInsertionSort(int Arr[], int Size){
		int Index, Cnt2, Temp;
		for(Index=1;Index<Size;Index++){
			Temp = Arr[Index];
			Cnt2 = Index;
			while(Cnt2>0 && Temp<=Arr[Cnt2-1]){
				Arr[Cnt2] = Arr[Cnt2-1];
				Cnt2--;
			}
			Arr[Cnt2] = Temp;
			
			System.out.print("\tPass "+Index+":\t\t");
			for(int l=-0;l<Size;l++){
				System.out.print(Arr[l]+" ");
			}
			System.out.println();
		}
	}
	
	public void StringInsertionSort(String Arr[], int Size){
		int Index, Cnt2;
		String Temp;
		for(Index=1;Index<Size;Index++){
			Temp = Arr[Index];
			Cnt2 = Index;
			while(Cnt2>0){
				if(Temp.compareTo(Arr[Cnt2-1]) > 0){
					break;
				}
				Arr[Cnt2] = Arr[Cnt2-1];
				Cnt2--;
			}
			Arr[Cnt2] = Temp;
			
			System.out.print("\tPass "+Index+":\t\t");
			for(int l=-0;l<Size;l++){
				System.out.print(Arr[l]+", ");
			}
			System.out.println();
		}
	}
}
