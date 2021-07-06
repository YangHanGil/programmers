package web_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class test8 {

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        

		System.out.println("Math.ceil : "+(int) Math.ceil((double)25/(double)10));
        
        return answer;
    }
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int bridge_length = 2;
		int weight = 10;
		int [] truck_weights = {7,4,5,6};
		int result = solution(bridge_length, weight, truck_weights);
		System.out.println("결과1 : "+ result);


		int bridge_length2 = 100;
		int weight2 = 100;
		int [] truck_weights2 = {7,4,5,6};
		int result2 = solution(bridge_length2, weight2, truck_weights2);
		System.out.println("결과1 : "+ result2);


	}

}
