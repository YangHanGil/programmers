package web_test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test3 {
	
	
    public static boolean solution(String[] phone_book) {
		System.out.println("----------------------------");
    	
    	boolean answer = true;
        
    	String number;
        for (int i = 0; i < phone_book.length; i++) {
        	number = phone_book[i];
        	for (int j = 0; j < phone_book.length; j++) {
        		if(i==j) continue;
				if(i<j && number.indexOf(phone_book[j])>-1 && number.indexOf(phone_book[j]) == 0) {
					return false;
				}
			}
        	
        	/*
			if(i>0) {
				number = phone_book[i];
				if(number.indexOf(phone_book[0])>-1 && number.indexOf(phone_book[0]) == 0) {
					System.out.println(number.indexOf(phone_book[0]));
					return false;
				}
			}
			*/
		}
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] phone_book = {"119", "97674223", "1195524421"};
		boolean result = solution(phone_book);
		System.out.println("결과 : "+result);


		String [] phone_book1 = {"123", "456", "789"};
		boolean result1 = solution(phone_book1);
		System.out.println("결과1 : "+result1);


		String [] phone_book2 = {"12", "143", "1035", "567", "88", "432432", "15312"};
		boolean result2 = solution(phone_book2);
		System.out.println("결과2 : "+result2);


	}

}
