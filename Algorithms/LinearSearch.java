/*ALGORITHM       : LINEAR SEARCH
 *BIG O RUN TIME  : O(n) - LINEAR */
public class linear_search {
	
	public static void main(String[] args) {
		linear_search LS = new linear_search();
		int integer_array[] = {1,5,7,3,2,6};
		String string_array[] = {"Paul", "James", "Bob", "Lilly", "Anna"};
		
		int int_res = LS.IntegerLinearSearch(integer_array,integer_array.length,7);
		int str_res = LS.StringLinearSearch(string_array, string_array.length, "James");
		
		System.out.println("Index returned for integer array search: "+int_res);
		System.out.println("Index returned for string array search: "+str_res);
	}

	public int IntegerLinearSearch(int Int_Arr[], int Size, int SValue ){
		int Index;
		for(Index=0;Index<Size;Index++){
			if(Int_Arr[Index] == SValue){
				return Index;
			}
		}
		return -1;
	}
	
	public int StringLinearSearch(String Str_Arr[], int Size, String SValue){
		int Index;
		for(Index=0;Index<Size;Index++){
			if(Str_Arr[Index].equals(SValue)){
				return Index;
			}
		}
		return -1;
	}
}
