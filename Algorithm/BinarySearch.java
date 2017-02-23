/*ALGORITHM       : BINARY SEARCH
 *BIG O RUN TIME  : O(log n) - LOGARITHMIC **/
public class binary_search {

	public static void main(String[] args) {
		binary_search BS = new binary_search();
		int integer_array[] = {2,5,6,7,8,10,20};
		String string_array[] = {"Apple", "Blueberry", "Fig", "Mango", "Orange", "Peach"};
		
		int int_res = BS.IntegerBinarySearch(integer_array, integer_array.length, 8);
		int str_res = BS.StringBinarySearch(string_array, string_array.length, "Blueberry");
		
		System.out.println("Index result from integer binary search: "+int_res);
		System.out.println("Index result from string binary search: "+str_res);
	}

	public int IntegerBinarySearch(int Int_Arr[], int Size, int SValue){
		int Start, End, Mid;
		Start = 0;
		End = Size - 1;
		
		while(Start <= End){
			Mid = (Start+End)/2;
			
			if(SValue == Int_Arr[Mid]){
				return Mid;
			}
			if(SValue < Int_Arr[Mid]){
				End = Mid - 1;
			}
			if(SValue > Int_Arr[Mid]){
				Start = Mid + 1;
			}
		}
		return -1;
	}
	
	public int StringBinarySearch(String Str_Arr[], int Size, String SValue){
		int Start, End, Mid;
		Start = 0;
		End = Size - 1;
		
		while(Start <= End){
			Mid = (Start+End)/2;
			
			if(SValue.equals(Str_Arr[Mid])){
				return Mid;
			}
			if(SValue.compareTo(Str_Arr[Mid]) < 0){
				End = Mid - 1;
			}
			if(SValue.compareTo(Str_Arr[Mid]) > 0){
				Start = Mid + 1;
			}
		}
		return -1;
	}
}
