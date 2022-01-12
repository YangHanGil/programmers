

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class goorm_kakaoenterprise {

	//근묵자흑 문제
	public static void main(String[] args) throws Exception {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		
		String questions = br.readLine();
		String[] splitQ = questions.split(" ");
		
		//각각 N과 K에 삽입
		int n = Integer.parseInt(splitQ[0]); //수열의길이
		int k = Integer.parseInt(splitQ[1]); //2부터 마지막 수
		
		int res=1;
		res += Math.ceil((double)(n-k)/(k-1));
		
		System.out.println(res);
		br.close();
	}
	
}
