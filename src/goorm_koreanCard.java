import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class goorm_koreanCard {
	 
    public static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		//n 개의 배열을 선언
		// 선언된 배열의 숫자중 중복되는 수 제거

		int testCase = Integer.parseInt(scanner.nextLine());
		
		final List<Integer> n =  new ArrayList<Integer>();
		final List<Integer> s =  new ArrayList<Integer>();
		
		for (int i = 0; i < testCase; i++) {
			String str = scanner.nextLine();
			String[] strArr = str.split(" ");
			Arrays.sort(strArr);
			for (String j : strArr) {
				n.add(Integer.parseInt(j));
			}
			for (int j = 0; j < strArr.length-1; j++) {
				if(strArr[j].indexOf(strArr[j+1])>-1) {
					s.add(Integer.parseInt(strArr[j]));
				}
				
			}
			if(str.indexOf(" ")>-1)
				break;
		}
		n.removeAll(s);
		Collections.sort(n);
		for (Integer integer : n) {
			System.out.println(integer);
		}
	}

}
