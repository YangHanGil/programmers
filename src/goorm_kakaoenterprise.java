

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class goorm_kakaoenterprise {

	//�ٹ����� ����
	public static void main(String[] args) throws Exception {
		
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		
		String questions = br.readLine();
		String[] splitQ = questions.split(" ");
		
		//���� N�� K�� ����
		int n = Integer.parseInt(splitQ[0]); //�����Ǳ���
		int k = Integer.parseInt(splitQ[1]); //2���� ������ ��
		
		int res=1;
		res += Math.ceil((double)(n-k)/(k-1));
		
		System.out.println(res);
		br.close();
	}
	
}
