import java.util.Arrays;
import java.util.Comparator;

public class Solution_bigger_number {
	public static String solution(int[] numbers) {
        String answer = "";
        
        String[] arr = new String[numbers.length];
        for(int i=0; i<numbers.length; i++) {
        	arr[i] = (String.valueOf(numbers[i]));
        }
        
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);
            }
        });
        
        //0000 처럼 0으로만 구성되어있으면 0 return
        if (arr[0].equals("0")) return "0";
        
        //그 외의 경우 순차적으로 연결하여 answer return
        for (int i = 0; i < arr.length; i++) {
            answer+=arr[i];
        }
        
        return answer;
    }
	

	public static void main(String[] args) {
		int[] array = {6, 10, 20};
		int[] array2 = {3, 30, 34, 5, 9};
		System.out.println(solution(array2));
	}

}
