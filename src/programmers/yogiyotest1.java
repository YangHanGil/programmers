package programmers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class yogiyotest1 {

	/*
	 * 테스트 입력값
	 * 
	 
	정수 n이 주어졌을 때 같은 자릿수를 가진 가장 작읁 수를 반환하는 함수 솔루션을 작성하십시오. n이 1에서 십억 사이라고 가장할 수 있습니다.
	
	ex)주어진 n=125 함수는 100을 반환해야 합니다. , n=10이면 함수는 10을 반환해야 합니다. n=1일 경우 0을 반환해야 합니다.
	
	*
	*/

	public static int solution(int n) {
		
		String p = Integer.toString(n);
		String a = p.substring(0,1);
		
		if(p.length()==1) {
			System.out.println("1일떄");
			p = "0";
		} else {
			String str = "";
			for (int i = 1; i < p.length(); i++) {
				str += "0";
			}
			p = a +str;
		}
		
		int res = Integer.parseInt(p);
		
		return res; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 1111111111;
		int result = solution(n);
		System.out.println("결과1 : "+ result);
	
	
	
	
	
	}
}
