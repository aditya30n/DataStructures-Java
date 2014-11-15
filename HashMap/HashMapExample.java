package HashMap;

public class HashMapExample {
public static void main(String[] args){
	HashMap hm = new HashMap();
	hm.put(125, 1000);
	hm.put(100, 2000);
	System.out.println(hm.get(100));
	System.out.println(hm.get(125));
}
}
