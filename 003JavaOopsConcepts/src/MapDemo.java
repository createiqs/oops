import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MapDemo {
	public static void main(String[] args) {
		Map<String, String> laptops = new HashMap<>();
		laptops.put("hp", "Pavillion Laptop");
		laptops.put("Apple", "MacBook");
		laptops.put("Lenovo", "Yoga");

//		Set<String> set = laptops.keySet();
//		Iterator<String> itr = set.iterator();
//		while (itr.hasNext()) {
//			String lap = itr.next();
//			laptops.put("Dell", "Lattitude");
//			System.out.println(lap + " \t" + laptops.get(lap));
//
//		}

		ConcurrentHashMap<String, String> ch = new ConcurrentHashMap<>();
		ch.put("hp", "Pavillion Laptop");
		ch.put("Apple", "MacBook");
		ch.put("Lenovo", "Yoga");
		Set<String> set = ch.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			ch.put("Dell", "Lattitude");
			String lap = itr.next();
			System.out.println(lap + " \t" + ch.get(lap));
		}
	}
}
