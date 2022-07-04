package programmers;

public class eduwillTest {

	//java 숫자 펠린드롬
	
	public static int solution(int n, int m) {
	
		
		int res = 0;
		for(int i = n; i <=m; i++) {
			String str = Integer.toString(i);
			if(CheckN(str))
				 res++;
		}
		
		return res;
	}
	
	private static boolean CheckN(String str) {

		int strInteger = str.length();
		for (int i = 0; i < str.length() / 2; i++) {
			strInteger--;
			if(str.charAt(i) != str.charAt(strInteger))
				return false;
		}
		return true;
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n= 1;
		int m = 100;
		int result = solution(n, m);
		System.out.println("결과1 : "+ result);
	
	}
}
