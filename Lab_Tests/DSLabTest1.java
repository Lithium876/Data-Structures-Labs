
public class labTest1 {

	public static void main(String[] args) {
		labTest1 LT1 = new labTest1();
		String fruit[] ={"apple", "mango", "pear", "pineapple", "lychee", "strawberry"};
		System.out.print("Original List:  ");
		for(int l=0;l<fruit.length;l++){
			if(l==fruit.length-1){
				System.out.print(fruit[l]);
			}else{
				System.out.print(fruit[l]+", ");
			}
		}
		System.out.println("\n");
		
		//Task 3
		String sorted[] = LT1.insertionSort(fruit, fruit.length);
		//End of Task 3
		
		//Task 5
		int str_res1 = LT1.BinarySearch(sorted, sorted.length, "pineapple");
		int str_res2 = LT1.BinarySearch(sorted, sorted.length, "grape");
		
		if(str_res1==-1){
			System.out.println("\nSorry, Your search value was not found");
		}else{
			System.out.println("\nThe index of you search value is: "+str_res1);
		}
		
		if(str_res2==-1){
			System.out.println("Sorry, Your search value was not found");
		}else{
			System.out.println("The index of you search value is: "+str_res2+"\n");
		}
		//End of Task 5

	}
	
	//TASK 3 - [7 Marks]
	public String[] insertionSort(String str_Arr[], int Size){
		labTest1 LT1 = new labTest1();
		int Index, Cnt2;
		String Temp;
		for(Index=1;Index<Size;Index++){
			Temp = str_Arr[Index];
			Cnt2 = Index;
			while(Cnt2>0){
				if(Temp.compareToIgnoreCase(str_Arr[Cnt2-1]) < 0){
					break;
				}
				str_Arr[Cnt2] = str_Arr[Cnt2-1];
				Cnt2--;
			}
			str_Arr[Cnt2] = Temp;
		}
		return str_Arr;
	}
	
	//Task 4 - [8 Marks]
	public int BinarySearch(String str_Arr[], int Size, String SValue){
		int Start, End, Mid;
		Start = 0;
		End = Size - 1;
		
		while(Start <= End){
			Mid = (Start+End)/2;
			
			if(SValue.equals(str_Arr[Mid])){
				return Mid;
			}
			if(SValue.compareToIgnoreCase(str_Arr[Mid]) > 0){
				End = Mid - 1;
			}
			if(SValue.compareToIgnoreCase(str_Arr[Mid]) < 0){
				Start = Mid + 1;
			}
		}
		return -1;
	}
}
