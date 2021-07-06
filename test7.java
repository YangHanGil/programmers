package web_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class test7 {

	public static int solution(int[] citations) {
    	int answer = 0;
    	
//    	/*
    	Arrays.sort(citations);
    	int j = 0;
    	for (int i = citations.length-1; i >= 0; i--) {
    		while(j >= citations[i]) {
				answer = j;
				return answer;
			}
    		j++;
		}
    	if(citations[citations.length-1] > citations.length) {
    		answer = citations.length;
    	}
//    	*/
    	/*
    	List<Integer> numberList = new ArrayList<Integer>();
    	for (int i = 0; i < citations.length; i++) {
			numberList.add(citations[i]);
		}
    	Collections.sort(numberList);
    	Collections.reverse(numberList);
    	for (int i = 0; i < citations.length; i++) {
			while(i >= numberList.get(i)) {
				answer = i;
				return answer;
			}
		}
    	if(numberList.get(citations.length-1) > citations.length) {
    		answer = citations.length;
    	}
    	*/
    	
		return answer;
    	
    }
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {3, 0, 6, 1, 5};
		int result = solution(numbers);
		System.out.println("결과1 : "+ result);


		int [] numbers2 = {12,11,10,9,8,1};
		int result2 = solution(numbers2);
		System.out.println("결과2 : "+ result2);


	}

}
