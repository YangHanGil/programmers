package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class eduwillTest2 {

	//java 숫자 펠린드롬
	
	public static String [] solution(String [] str) {
	
		String [] res = {};
		HashMap<String, String> map = new HashMap<String, String>();
		
		for (int i = 0; i < str.length; i++) {
			String [] strList = str[i].split(" ");
			String customer = strList[0];
			for (int j = 1; j < strList.length; j++) {
				String value;
				if(map.get(customer)!=null) {
					value = map.get(customer).indexOf(strList[j])>-1? 
						map.get(customer):map.get(customer)+" "+strList[j];
				} else {
					value = strList[j];
				}
				map.put(customer, value);
//				int n = map.get(customer)==null ? 0:map.get(customer);
//				map.put(customer, (n+1));
			}
			
		}
		
		for (int i = 0; i < res.length; i++) {
			
		}

		
		System.out.println(map.toString());
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] str = {"alex pizza pasta steak", "bob noodle sandwich pasta", "choi pizza sandwich pizza", "alex pizza pasta steak"};
		String [] result = solution(str);
		System.out.println("결과1 : "+ result);
	
	}
}
