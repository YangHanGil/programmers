import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class goorm_kakaoenterprise5 {

	//물류센터
	
	
	public static void main(String[] args) throws Exception {
		
		/*
		 * 테스트 입력값
		 * 
		 
		5
		0 1 2
		1 2 1
		1 3 7
		3 4 5
		
		22
		
		*
		*/
		
		// 한곳에서 출발할때 가장 최소의 수를 구해야함.
		
		int n = 10;
		Combinationsss comb = new Combinationsss(n);
		Map<String, int[]> map;
		map = comb.combination(n);
		
		int[] h = map.get("H");
		int[] r = map.get("R");
		int[] m = map.get("M");
		
		int x = 0;
		int y = 0;
		int res = 0;
		x = Math.abs(m[0]-h[0]);
		y = Math.abs(m[1]-h[1]);
		System.out.println(h[0]+"/"+r[0] + " " + h[1]+"/"+r[1]);
		System.out.println(x + " " + y);
		if(h[0]==r[0]||h[1]==r[1]) {
			res = x+y+1;
		} else {
			res = x+y-1;
		}
		System.out.println(res);
	}
	
	
}

class Combinationsss {
	
	
	private int n;
	String[] testCase = new String[10];

    public Combinationsss(int n) {
        this.n = n;
        this.testCase = new String[n];
    }
    
    public Map<String, int[]> combination(int n) throws IOException {
    	
    	Map<String, int[]> map = new HashMap();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < n; i++) {
			
	    	int[] strIndex = new int[2];
			String str = br.readLine();
			int strInfo=0;
			strIndex[0] = i;
			
			if(str.indexOf("H")>-1) {
				strInfo = str.indexOf("H");
				strIndex[1] = strInfo;
				map.put("H", strIndex);
				
			} 
			if(str.indexOf("R")>-1) {
				strInfo = str.indexOf("R");
				strIndex[1] = strInfo;
				map.put("R", strIndex);
				
			} 
			if (str.indexOf("M")>-1) {
				strInfo = str.indexOf("M");
				strIndex[1] = strInfo;
				map.put("M", strIndex);
			}
		}
			
    	return map;
    }
}
