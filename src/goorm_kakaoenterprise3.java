

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;

public class goorm_kakaoenterprise3 {

	//숫자카드게임
	public static void main(String[] args) throws Exception {
		
		/*
		 * 테스트 입력값
		 * 
		 
		7 4
		10 3
		
		*
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testCase = br.readLine();
		
		int n = Integer.parseInt(testCase.split(" ")[0]);
		int k = Integer.parseInt(testCase.split(" ")[0]);
		
		// 0 ~ n-1 까지의 수를 배열에 넣어준다. 
		int[] intArr = new int[n];
		int cnt = 0;
		for (int i : intArr) {
			intArr[cnt] = cnt;
			cnt++;
		}
		
		// k갯수의 카드를 몇번 뽑을 수 있는지 판별
		
		
		
		// 뽑은 k갯수의 카드를 n으로 나눠 0이 되는지 판별
		
		
		
		br.close();
	}
	
}
