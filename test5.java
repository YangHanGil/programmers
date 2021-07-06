package web_test;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class test5 {

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        int cnt=0;
		

        for (int i = 0; i < commands.length; i++) {
    		List<Integer> res = new ArrayList();
    		int start = commands[i][0]-1;
    		int end = commands[i][1]-1;
        	for (int j = 0; j < array.length; j++) {
				if(j >= start && j <= end) {
		        	res.add(cnt, array[j]);
		        	Collections.sort(res);
		        	cnt++;
				}
			}
			cnt = 0;
			int result = commands[i][2]-1;
			answer[i] = res.get(result);
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array = {1, 5, 2, 6, 3, 7, 4, 9, 8};
		int[][] commands = {{2, 7, 4}, {3, 4, 1}, {2, 9, 3}};
		int[] result = solution(array, commands);
		System.out.println("결과1 : "+ Arrays.toString(result));




	}

}
