

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;

public class goorm_kakaoenterprise2 {

	//사은품 교환하기
	public static void main(String[] args) throws Exception {
		
		/*
		 * 테스트 입력값
		 * 
		 
		4
		12 0
		10 14
		4 20
		5 2147483648
		
		*
		*
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < testCase; i++) {
			String str = br.readLine();
			String[] strArr = str.split(" ");
			long n = Long.parseLong(strArr[0]);
			long m = Long.parseLong(strArr[1]);
			
			long res = 0;
			long nSplit = n/5;
			long nmSplit = (n+m)/12;
			
			
			res = (nSplit<nmSplit) ? nSplit:nmSplit;
			
			System.out.println(res);
		}
		
		
		br.close();
	}
	
}
