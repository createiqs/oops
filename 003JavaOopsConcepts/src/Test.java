import java.util.ArrayList;
import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
//		System.out.println("tensada".hashCode());
//		System.out.println("friabili".hashCode());
//		System.out.println("Ea".hashCode());
//		System.out.println("FB".hashCode());
//		System.out.println("Ea".equals("FB"));
//		HashMap<String, String> hashmap = new HashMap<>();
//		hashmap.put("tensada", "anil");
//		hashmap.put("friabili", "balu");
//		hashmap.put("Ea", "anil");
//		hashmap.put("FB", "balu");
//		System.out.println(hashmap);
		
		ArrayList arrayList=new ArrayList<>();
		arrayList.add(10);
		arrayList.add(11);
		arrayList.add(12);
		arrayList.add(13);
		for(Object o: arrayList) {
			System.out.println((Integer)o *10);
		}
		
		
	}

}
