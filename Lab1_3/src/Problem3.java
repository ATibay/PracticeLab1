import java.util.Map;
import java.util.TreeMap;

public class Problem3 {

	public static void main(String[] args) {
		Date d1 = new Date(9, 20, 2002);
		Date d2 = new Date(4,25,2020);
		Date d3 = new Date(4, 24, 2005);
		Date d4 = new Date	(1,25,2012);
		
		TreeMap<Date, String> syllabus = new TreeMap();
		syllabus.put(d1, "Java");
		syllabus.put(d2, "JavaScirpt");
		syllabus.put(d3, "Python");
		syllabus.put(d4, "C++");
		
		for(Map.Entry<Date, String> topic: syllabus.entrySet()) {
			if(topic.getKey().month == 9 && topic.getKey().year == 2002) {
				System.out.println(topic.getValue());
			}else {
				System.out.println(topic.getValue() + " does not fall in September 2002");
			}
		}

	}

}
