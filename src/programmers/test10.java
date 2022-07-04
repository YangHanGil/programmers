package programmers;

import java.util.HashMap;

public class test10 {

	
	public static int[] solution(int[] grade) {

		int[] answer = new int[grade.length];
        
		int cnt;
//		for (int i = 0; i < grade.length; i++) {
//			cnt = 1;
//			for (int j = 0; j < grade.length; j++) {
//				if(grade[i]<grade[j]) cnt ++;
//			}
//			answer[i] = cnt;
//		}
		
		int n=0;
		for (int i : grade) {
			cnt = 1;
			for (int j : grade) {
				cnt = i<j? cnt+1:cnt;
			}
			answer[n] = cnt;
			n++;
		}
		

        return answer;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {2,2,1};
		
		test10.solution(a);
		
	}

}


/*
 * 
 -- 코드를 입력하세요
SELECT 
    CASE WHEN page = 'G' THEN VAL ELSE 0 END AS 'G', 
    CASE WHEN page = 'PG' THEN VAL ELSE 0 END AS 'PG', 
    CASE WHEN page = 'PG-13' THEN VAL ELSE 0 END AS 'PG-13', 
    CASE WHEN page = 'R' THEN VAL ELSE 0 END AS 'R', 
    CASE WHEN page = 'NC-17' THEN VAL ELSE 0 END AS 'NC-17'
FROM (
    SELECT 
        MPAA_RATE AS page, 
        TITLE AS 'VAL'
    FROM VIDEOS
    WHERE MPAA_RATE = 'G'
    UNION ALL
    
    SELECT 
        MPAA_RATE AS page, 
        TITLE AS 'VAL'
    FROM VIDEOS
    WHERE MPAA_RATE = 'PG'
) z 
 * */
