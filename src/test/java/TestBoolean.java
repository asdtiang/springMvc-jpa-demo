import static org.junit.Assert.*;

import org.junit.Test;

public class TestBoolean {

	@Test
	public void test() {
		String s = "true";
		Boolean b = true;
		if (s.equals(b)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		String test = "\n\t \fhello \n\t" ;
		test.trim();
		System.out.println(test);
		System.out.print("start");
		test = test.trim();
		System.out.print(test);
		System.out.print("end");
		try {
			String q = null;
			System.out.println(q.equals(s));
			System.out.println("I'm nomal");
			return;
		} catch (Exception ex) {
			System.out.println("I'm exception");
			return;
		} finally {
			System.out.println("I'm finally.");
		}
	}

}
