import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class goorm_kakaoenterprise3 {

	//숫자카드게임
	
	
	public static void main(String[] args) throws Exception {
		
		/*
		 * 테스트 입력값
		 * 
		 
		7 4
		10 3
		
		*
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testCase = br.readLine();
		
		int n = Integer.parseInt(testCase.split(" ")[0]);
		int k = Integer.parseInt(testCase.split(" ")[1]);
		
		// 0 ~ n-1 까지의 수를 배열에 넣어준다. 
		int[] intArr = new int[n];
		int cnt = 0;
		for (int i : intArr) {
			intArr[cnt] = cnt;
			cnt++;
		}
		
		// k갯수의 카드를 몇번 뽑을 수 있는지 판별
		Combination comb = new Combination(intArr.length, k);
        comb.combination(intArr, 0, 0, 0);
        ArrayList<ArrayList<Integer>> result = comb.getResult();
        
        int res=0;
        for (int i = 0; i < result.size(); i++) {
        	int f=0;
            int t =0;
            for (int j = 0; j < result.get(i).size(); j++) {
            	f= f+result.get(i).get(j);
            }
            t = (f%n==0)?1:0;
            if(t==1) res++;
        }
        
		System.out.println(res);
		
		br.close();
	}
	
	
}

class Combination {
    private int n;
    private int r;
    private int[] now; // 현재 조합
    private ArrayList<ArrayList<Integer>> result; // 모든 조합

    public ArrayList<ArrayList<Integer>> getResult() {
        return result;
    }

    public Combination(int n, int r) {
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