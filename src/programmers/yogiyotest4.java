package programmers;

import java.util.Arrays;

public class yogiyotest4 {

	/*
	 * 테스트 입력값
	 * 
	 
	1,2,1 => 2 반환
	2,1,4,4 => 1반환
	6,2,3,5,6,3 => 4반환
	*
	*/

	public static void solution(String version) {
		System.out.println(version);
		if(version == null)
	        System.out.println("null이면 안돼~");
	       else{
	           String reg = "\\d+(\\.\\d+){0,2}(-SNAPSHOT)";
	           if(version.matches(reg)) {

	        	   if() {
	        		   
	        	   }
	           } else {
	        	   System.out.println("version 안맞음!");
	           }
	       }
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String version = "3.8.0";
		solution(version);
	
	
	
	
	
	}
	

	public static void errorVersionMustMatchPattern(String version) {
		
		String [] ver = version.split(".");
		int x = Integer.parseInt(ver[0]);
		int y = Integer.parseInt(ver[1]);
		int z = Integer.parseInt(ver[2]);
	}
}

