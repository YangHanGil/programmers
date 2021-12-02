package web_test;

import java.util.Arrays;

public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {-1, 0, 1, 2, 4};
		
		int result = solution(A);
		System.out.println(result);
	}
	
	public static int solution(int[] A) {
		
		int N = 100000;
		int []arr = new int[N];
		int cnt=0;
		
		int arrKey=0;
		for (int i : arr) {
			arr[arrKey] = arrKey+1;
			arrKey++;
		}
		
		int iKey=0;
		for (int i : A) {
			
			int jKey=0;
			for (int j : arr) {
				
				if(A[iKey]==arr[jKey]) {
					arr[jKey]=0;
					cnt++;
				}
				
				jKey++;
			}
			
			iKey++;
		}
		
		Arrays.sort(arr);
		
		
		
		return arr[cnt];
    }
}
