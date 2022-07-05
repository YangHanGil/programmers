import java.io.*;
import java.lang.*;
import java.util.*;

public class goorm_koreanCard3 {
	
	/*
    n개의 배열을 선언 후
    선언 된 문자열 배열에 모음이 연달아 나올경우 첫번째 모음을 뺀 연속되는 모음 제거
    ex) abcdefg -> abcdefg 
    	aabcdiieou -> abcdi 
	*/
	
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(reader.readLine().trim());
		String input, output;
		for(int i = 0 ; i < n ; i ++)
		{
			input = reader.readLine().trim();
			
			output = goorm_koreanCard3.stringBeautify(input);
			
			writer.write(output + "\n");
		}

		writer.flush();
		writer.close();
		reader.close();
	}
	
	public static String stringBeautify(String input)
	{
		HashMap<String, Integer> map = new HashMap<>();
		map.put("a", 1);
		map.put("e", 1);
		map.put("i", 1);
		map.put("o", 1);
		map.put("u", 1);
		
		final List<String> n =  new ArrayList<String>();
		
		String str = "";
		String[] strArr = input.split("");
		int cnt=0;
		for (int j = 0; j < strArr.length; j++) {//o
			cnt = (map.get(strArr[j])!=null) ? cnt+1 : 0;
			if(j==0)
				str = strArr[j];
			else if(cnt<2)
				str += strArr[j];
			
		}
		
		
		return str;
	}

}
