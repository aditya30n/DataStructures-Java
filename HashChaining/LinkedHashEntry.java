package HashChaining;

public class LinkedHashEntry {

	int key;
	int value;
	LinkedHashEntry next;
	
	LinkedHashEntry(int k, int v){
		key = k;
		value = v;
		next = null;
	}
	
	public int getKey(){
		return key;
	}
	
	public int getValue(){
		return value;
	}
	public void setValue(int v){
	value = v;
	}
	
	public LinkedHashEntry getNext(){
		return next;
	}
	
	public void setNext(LinkedHashEntry n){
		next= n;
	}
	
}
