import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashMap;

public class Map_Check {

	public static void main(String args[])
	{
		String x="hi";
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put(x,null);
		hm.put("hello",7);
		System.out.println(hm.values());
		ArrayList<Integer> al = (ArrayList<Integer>) hm.values();
		System.out.println(hm.get(x));
	}
}
