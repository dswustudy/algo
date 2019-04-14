import java.util.*;

public class Solution_down {
	
	 public static long solution(long n) {
	      
	      List<Integer> list = new ArrayList<>();
	      
	      StringBuilder input_num= new StringBuilder();
	      StringBuilder out_num= new StringBuilder();
	      input_num.append(n);
	      
	      for(int i=0; i<input_num.length(); i++) {
	    	  list.add(Integer.parseInt(input_num.substring(i, i+1)));
	      }
	      
	      Collections.sort(list);
	      Collections.reverse(list);
	      
	      for(int i=0; i<list.size(); i++) {
	    	  out_num.append(list.get(i));
	      }
	      
	      return Long.valueOf(String.valueOf(out_num));
	  }

	public static void main(String[] args) {		
		//solution(3928);
		System.out.println(solution(291253));
	}

}

/*for(int i=cnt; i>0; i--) {	//버블정렬
for(int j=0;j<i-1;j++) {
	if(number[j]<number[j+1]) {
		temp=number[j];
		number[j]=number[j+1];
		number[j+1]=temp;
	}
	
}
}
*/
/*for(int i=0; i<cnt-1; i++) {//선택 정렬
min = i;
for(int j=i+1; j<cnt; j++) {
  if(number[min]>number[j]) {
	  min = j;
  }
}
temp = number[min];
number[min] = number[i];
number[i]=temp;
}*/
