import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public class goorm_kakaoenterprise6 {

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
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testCase = br.readLine();
		
		int m = Integer.parseInt(testCase.split(" ")[0]);
		int n = Integer.parseInt(testCase.split(" ")[1]);
		
		int res=0;
		if(m>3&&n>2) {
			res = (n*2)+((m-2)*3);
		} else {
			res = m*n;
		}
		
		System.out.println(res);
		
	}
	
	
}

class Combinationss {
	
	
	private int n;
    private int r;
    private int[] now; // 현재 조합
    private ArrayList<ArrayList<Integer>> result; // 모든 조합

    public ArrayList<ArrayList<Integer>> getResult() {
        return result;
    }

    public Combinationss(int n, int r) {
        this.n = n;
        this.r = r;
        this.now = new int[r];
        this.result = new ArrayList<ArrayList<Integer>>();
    }
    
    public void combination(int[] arr, int depth, int index, int target) {
        if (depth == r) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < now.length; i++) {
                temp.add(arr[now[i]]);
            }
            result.add(temp);
            return;
        }
        if (target == n) return;
        now[index] = target;
        combination(arr, depth + 1, index + 1, target + 1);
        combination(arr, depth, index, target + 1);
    }
}