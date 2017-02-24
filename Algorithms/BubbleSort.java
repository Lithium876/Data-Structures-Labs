/*ALGORITHM       : BUBBLE SORT
 *BIG O RUN TIME  : O(n^2) - QUADRATIC **/
public class bubble_sort {

	public static void main(String[] args) {
		bubble_sort BUB_S = new bubble_sort();
		
		int integer_array[] = {50, 70, 20, 30, 80, 25, 43, 19};
		String string_array[] = {"Paul", "James", "Bob", "Lilly", "Anna", "Queen", "Chris"};
		
		System.out.print("Original Integer List:  ");
		for(int l=-0;l<integer_array.length;l++){
			System.out.print(integer_array[l]+" ");
		}
		System.out.println();
		
		BUB_S.IntegerBubbleSort(integer_array, integer_array.length);
		
		System.out.print("\nOriginal String List:   ");
		for(int l=-0;l<string_array.length;l++){
			System.out.print(string_array[l]+", ");
		}
		System.out.println();
		
		BUB_S.StringBubbleSort(string_array, string_array.length);

	}
	
	public void IntegerBubbleSort(int Arr[], int Size){
		int Index, Temp, Cnt2, SwapMade;
		SwapMade = 1;
		for(Index=0;Index<Size;Index++){
			if(SwapMade==1){
				SwapMade=0;
				for(Cnt2=Size-1;Cnt2>Index;Cnt2--){
					if(Arr[Cnt2]<Arr[Cnt2-1]){
						Temp = Arr[Cnt2-1];
						Arr[Cnt2-1] = Arr[Cnt2];
						Arr[Cnt2] = Temp;
						SwapMade = 1;
					}
				}
			}else{
				break;
			}
		
			System.out.print("\tPass "+(Index+1)+":\t\t");
			for(int l=-0;l<Size;l++){
				System.out.print(Arr[l]+" ");
			}
			System.out.println();
		}
	}
	
	public void StringBubbleSort(String Arr[], int Size){
		int Index, Cnt2, SwapMade;
		String Temp;
		
		SwapMade = 1;
		for(Index=0;Index<Size;Index++){
			if(SwapMade==1){
				SwapMade=0;
				for(Cnt2=Size-1;Cnt2>Index;Cnt2--){
					if(Arr[Cnt2].compareTo(Arr[Cnt2-1])<0){
						Temp = Arr[Cnt2-1];
						Arr[Cnt2-1] = Arr[Cnt2];
						Arr[Cnt2] = Temp;
						SwapMade = 1;
					}
				}
			}else{
				break;
			}
		
			System.out.print("\tPass "+(Index+1)+":\t\t");
			for(int l=-0;l<Size;l++){
				System.out.print(Arr[l]+" ");
			}
			System.out.println();
		}
	}
}
