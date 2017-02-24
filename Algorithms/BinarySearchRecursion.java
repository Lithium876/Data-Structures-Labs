
public class binary_search_recursion {
	public static void main(String[] args) {
		binary_search_recursion BS = new binary_search_recursion();
		int integer_array[] = {2,5,6,7,8,10,20};
		String string_array[] = {"Apple", "Blueberry", "Fig", "Mango", "Orange", "Peach"};
		
		int int_res = BS.IntegerBinarySearchRecursion(integer_array, 0, integer_array.length, 8);
		int str_res = BS.StringBinarySearchRecursion(string_array, 0, string_array.length, "Blueberry");
		
		System.out.println("Index result from integer binary search: "+int_res);
		System.out.println("Index result from string binary search: "+str_res);
	}
	
	public int IntegerBinarySearchRecursion(int Int_Array[], int Start, int End, int SValue){
		if (Start < End) {
            int Mid = Start + (End - Start) / 2; 
            if (SValue < Int_Array[Mid]) {
                return IntegerBinarySearchRecursion(Int_Array, Start, Mid, SValue);
                 
            } else if (SValue > Int_Array[Mid]) {
                return IntegerBinarySearchRecursion(Int_Array, Mid+1, End , SValue);
                 
            } else {
                return Mid;  
            }
        }
        return -(Start + 1); 
	}
	
	public int StringBinarySearchRecursion(String Str_Arr[], int Start, int End, String SValue){
		if (Start < End) {
            int Mid = Start + (End - Start) / 2; 
            if (SValue.compareTo(Str_Arr[Mid]) < 0) {
                return StringBinarySearchRecursion(Str_Arr, Start, Mid, SValue);
                 
            } else if (SValue.compareTo(Str_Arr[Mid]) > 0) {
                return StringBinarySearchRecursion(Str_Arr, Mid+1, End , SValue);
                 
            } else {
                return Mid;  
            }
        }
        return -(Start + 1); 
	}
}
