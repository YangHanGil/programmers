package programmers;

public class eduwillTest3 {

	//java 숫자 펠린드롬
	
	public static int solution(String s) {
	
		char [] chs = s.toCharArray();
		int res = 0;
		if(s.length() % 2 == 1) {
			res = s.length();
		} else {
			for (int i = 1; i < chs.length; i++) {
				if (chs[0]== chs[i]) {
					res = i;
					break;
				}
				else {
					res = chs.length;
				}
			}
		}
		return res;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcabcabdabcabcabd2";
		int result = solution(s);
		System.out.println("결과1 : "+ result);
	
	}
}
