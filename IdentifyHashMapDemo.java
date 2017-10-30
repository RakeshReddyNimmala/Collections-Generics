package collections;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentifyHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Map<Integer, String> m = new HashMap<Integer, String>();
				Map<Integer, String> m = new IdentityHashMap<Integer, String>();
				Integer I1 = new Integer(10);
				Integer I2 = new Integer(10);
				m.put(I1, "aspire");
				m.put(I2, "technologies");
				System.out.println(m);
			}
		}



