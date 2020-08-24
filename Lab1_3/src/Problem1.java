import java.util.ArrayList;

public class Problem1 {

	public static void main(String[] args) {
		ArrayList<Integer> testInts = new ArrayList();
		testInts.add(4);
		testInts.add(4);
		testInts.add(1);
		testInts.add(4);
		
		System.out.println(Integers.computeSum(testInts));
	}

}
