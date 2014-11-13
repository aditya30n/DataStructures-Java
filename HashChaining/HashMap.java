package HashChaining;

public class HashMap {
	
	final static int tableSize = 128;
	
	LinkedHashEntry[] table;
	
	HashMap(){
		table = new LinkedHashEntry[tableSize];
		for(int i=0; i<tableSize; i++)
			table[i]=null;
	}
	
	public void put(int key, int value){
		int hash= key % tableSize;
		if(table[hash] == null){
			table[hash] = new LinkedHashEntry(key, value);}
		
		else{
			LinkedHashEntry entry = table[hash];
			while(entry.next != null && entry.getKey()!= key){
				entry = entry.getNext();
			}
			
			if(entry.getKey() == key){
				entry.setValue(value);
	
			}
			else{
				entry.setNext(new LinkedHashEntry(key,value));
			}
			
			
		}
	}
	
	public int get(int key){
		int hash = key%tableSize;
		if(table[hash].getKey()==key)
			return table[hash].getValue();
		else{
			LinkedHashEntry entry = table[hash];
			while(entry != null && entry.getKey()!= key)
				entry= entry.getNext();
			if(entry.getKey()== key){
				return entry.getValue();
			}
			else return -1;
			
		}
			
			
	}
}
