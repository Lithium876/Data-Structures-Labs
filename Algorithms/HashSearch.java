/*ALGORITHM       : HASH SEARCH
 *BIG O RUN TIME  : O(1) - CONSTANT */
public class hash_search {

	public static void main(String[] args) {
		hash_search HS = new hash_search();
		
		int array[] = {1000,1001,1002,1003,1004,1005};
		
		int res = HS.HashSearch(1000, array.length, 1002);
		
		System.out.println("Index result from hash search: "+res);
	}
	
	public int HashSearch(int Size, int ArrayLength, int SValue){
		int Hashkey = SValue%Size;
		
		if(Hashkey>=0 && Hashkey<Size && Hashkey<ArrayLength){
			return Hashkey;
		}else{
			return -1;
		}
	}
}
