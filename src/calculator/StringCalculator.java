package calculator;

import static org.junit.Assert.assertNotNull;

public class StringCalculator {

		public int add(String text) {
			if(text==null || text.isEmpty()) {
				return 0;
			}
			else {
				return Integer.parseInt(text);
			}
		}
}
