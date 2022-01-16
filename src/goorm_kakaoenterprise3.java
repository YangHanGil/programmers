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
		long[] longArr = new long[n];
		int cnt = 0;
		for (long i : longArr) {
			longArr[cnt] = cnt;
			cnt++;
		}
		
		// k갯수의 카드를 몇번 뽑을 수 있는지 판별
		Combination comb = new Combination(longArr.length, k);
        comb.combination(longArr, 0, 0, 0);
        ArrayList<ArrayList<Long>> result = comb.getResult();
        
        long res=0;
        for (int i = 0; i < result.size(); i++) {
        	long f=0;
            long t =0;
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
    private long n;
    private long r;
    private long[] now; // 현재 조합
    private ArrayList<ArrayList<Long>> result; // 모든 조합

    public ArrayList<ArrayList<Long>> getResult() {
        return result;
    }

    public Combination(long n, int r) {
        this.n = n;
        this.r = r;
        this.now = new long[r];
        this.result = new ArrayList<ArrayList<Long>>();
    }

    public void combination(long[] arr, long depth, int index, long target) {
        if (depth == r) {
            ArrayList<Long> temp = new ArrayList<>();
            for (int i = 0; i < now.length; i++) {
                temp.add(arr[(int) now[i]]);
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