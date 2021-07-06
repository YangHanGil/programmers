package web_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class test6 {

    public static String solution(int[] numbers) {
    	String answer = "";
    	
    	List<String> arr = new ArrayList<String>();
    	for (int i = 0; i < numbers.length; i++) {
			arr.add(i, numbers[i]+"");
		}
    	Collections.sort(arr, (a,b) -> {
    		String as = String.valueOf(a), bs = String.valueOf(b);
    		return -Integer.compare(Integer.parseInt(as+bs), Integer.parseInt(bs+as));
    	});
    	System.out.println(arr.toString());
    	
    	for (int i = 0; i < arr.size(); i++) {
        	answer += arr.get(i);
		}
    	if(answer.charAt(0) == '0') {
            return "0";
        }else {
            return answer;
        }
    }
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {3, 30, 34, 5, 9};
		String result = solution(numbers);
		System.out.println("결과1 : "+ result);




	}

}
