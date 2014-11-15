package HashMap;

public class HashEntry {

	int key;
	int value;
	
	HashEntry(int k, int v){
		key = k;
		value = v;
	}
	
	public int getValue(){
		return value;
	}
	
	public int getKey(){
		return key;
	}
}
