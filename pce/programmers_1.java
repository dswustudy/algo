import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class programmers_1 {
	
	 public long solution(long n) {
	      long answer = 0;
	      
	      char[] result;
	      
	      String s = String.valueOf(n); //long형 정수값을 문자열로 변환한다.    								
	      String[] res = s.split("");
	      
	      Arrays.sort(res);
	      Collections.reverse(Arrays.asList(res));
	      String rrr = String.join("",res);
	      answer = Long.parseLong(rrr);
	            
	      return answer;
	  }
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
