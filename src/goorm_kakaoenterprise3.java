

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;

public class goorm_kakaoenterprise3 {

	//����ī�����
	public static void main(String[] args) throws Exception {
		
		/*
		 * �׽�Ʈ �Է°�
		 * 
		 
		7 4
		10 3
		
		*
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testCase = br.readLine();
		
		int n = Integer.parseInt(testCase.split(" ")[0]);
		int k = Integer.parseInt(testCase.split(" ")[0]);
		
		// 0 ~ n-1 ������ ���� �迭�� �־��ش�. 
		int[] intArr = new int[n];
		int cnt = 0;
		for (int i : intArr) {
			intArr[cnt] = cnt;
			cnt++;
		}
		
		// k������ ī�带 ��� ���� �� �ִ��� �Ǻ�
		
		
		
		// ���� k������ ī�带 n���� ���� 0�� �Ǵ��� �Ǻ�
		
		
		
		br.close();
	}
	
}
