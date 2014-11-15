package HashMap;

public class HashMap {

	final static int tableSize = 128;
	
	HashEntry[] table;
	
	HashMap(){
		table = new HashEntry[tableSize];
		for(int i =0; i< tableSize ; i++){
			table[i]=null;
		}
		
		
	}
	public void put(int key, int value){
		int hash=key%tableSize;
		while(table[hash]!=null && table[hash].getKey()!=key){
			hash = (hash+1)%tableSize;
		}
		table[hash]= new HashEntry(key, value);
	}
	public int get(int key){
		int hash = key% tableSize;
		while(table[hash]!=null && table[hash].getKey()!= key){
			hash = (hash+1)%tableSize;
		}
		if(table[hash]!= null){
			return table[hash].getValue();
		}
		else
			return -1;
	}
}
