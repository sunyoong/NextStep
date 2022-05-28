package calculator;

import static org.junit.Assert.assertNotNull;

public class StringCalculator {

	
	
//		public int add(String text) {
//			if(text==null || text.isEmpty()) {
//				return 0;
//			}
//			else {
//				return Integer.parseInt(text);
//			}
//		}
	
		// 숫자 2개를 쉼표(,)로 구분했을 때 두 숫자의 합 반환
	  	public int add2(String text) {
	  		if(text==null || text.isEmpty()) {
	  			return 0;
	  		}
	  		else {
	  			String[] value = text.split(",");
	  			int sum = 0;
	  			for(String s : value) {
	  				sum += Integer.parseInt(s);
	  			
	  			}
	  			return sum;
	  		}
	  	}
}
