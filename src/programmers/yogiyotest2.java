package programmers;

import java.util.Arrays;

public class yogiyotest2 {

	/*
	 * 테스트 입력값
	 * 
	 
	1,2,1 => 2 반환
	2,1,4,4 => 1반환
	6,2,3,5,6,3 => 4반환
	*
	*/

	public static int solution(int[] n) {
    	int answer = 0;
		
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
    	int[] a = new int[n.length];
    	for (int i = 0; i < a.length; i++) {
			a[i] = i+1;
		}
		int res = 0;
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]+" / "+a[i]);
			int b = n[i]-a[i];
			if(b!=0) {
				res += Math.abs(b);
			}
		}
		return res; 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] n= {1,2,1};
		int result = solution(n);
		System.out.println("결과1 : "+ result);
	
	
	
	
	
	}
}
