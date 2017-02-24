
public class linear_search_recursion {
	public static void main(String[] args) {
		linear_search_recursion LSR = new linear_search_recursion();
		int integer_array[] = {1,5,7,3,2,6};
		String string_array[] = {"Paul", "James", "Bob", "Lilly", "Anna"};
		int Index = 0;
		
		int int_res = LSR.IntegerLinearSearchRecursion(integer_array,integer_array.length, Index, 3);
		int str_res = LSR.StringLinearSearchRecursion(string_array, string_array.length, Index, "Bob");
		
		System.out.println("Index returned for integer array search: "+int_res);
		System.out.println("Index returned for string array search: "+str_res);
	}

	public int IntegerLinearSearchRecursion(int Int_Arr[], int Size, int Index, int SValue ){
		if(Index==Size){
			return -1;
		}
		if(Int_Arr[Index] == SValue){
			return Index;
		}else{
			Index++;
			return IntegerLinearSearchRecursion(Int_Arr, Size, Index, SValue );
		}
	}
	
	public int StringLinearSearchRecursion(String Str_Arr[], int Size, int Index, String SValue ){
		if(Index==Size){
			return -1;
		}
		if(Str_Arr[Index].equals(SValue)){
			return Index;
		}else{
			Index++;
			return StringLinearSearchRecursion(Str_Arr, Size, Index, SValue );
		}
	}
}
