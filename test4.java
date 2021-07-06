package web_test;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class test4 {
	
	
    public static int[] solution(String[] genres, int[] plays) {
		
    	System.out.println("-----------------------------------");
    	
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < genres.length; i++) {
			String key = genres[i];
			if(!map.containsKey(key))
				map.put(key, plays[i]);
			else
				map.put(key, map.get(key)+plays[i]);
		}
		
		List<Entry<String, Integer>> list = sortString(map);
		
		HashMap<Integer, String> keyMap = new HashMap<>();
		HashMap<Integer, Integer> valMap = new HashMap<>();
		for (int i = 0; i < plays.length; i++) {
			keyMap.put(i, genres[i]);
			valMap.put(i, plays[i]);
		}
		
		List<Entry<Integer, Integer>> list2 = sortInteger(valMap);
		
		int res = 0;
		HashMap<Integer, Integer> answerMap = new HashMap<>();
		for (Entry<String, Integer> entry : list) {
			int cnt = 0;
			int j = 0;
			for (Entry<Integer, Integer> entry2 : list2) {
				Iterator<Integer> it = keyMap.keySet().iterator();
				while (it.hasNext()) {
					Integer key = it.next();
					if(entry2.getKey().equals(key) && entry.getKey().equals(keyMap.get(key))) {
						j++;
						if(cnt < 2 && j < 3) {
							answerMap.put(res, entry2.getKey());
							cnt ++;
							res ++;
						} else {
							cnt = 0;
						}
					}
				}
			}
		}

		int[] answer = new int[answerMap.size()];
		for (int i = 0; i < answerMap.size(); i++) {
			answer[i] = answerMap.get(i);
		}
		
		return answer;
    }
    
    public static List<Entry<String, Integer>> sortString (HashMap<String, Integer> map) {
		List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(map.entrySet());
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
			{
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
    	return list_entries;
    }
    
    public static List<Entry<Integer, Integer>> sortInteger (HashMap<Integer, Integer> map) {
		List<Entry<Integer, Integer>> list_entries = new ArrayList<Entry<Integer, Integer>>(map.entrySet());
		Collections.sort(list_entries, new Comparator<Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> obj1, Entry<Integer, Integer> obj2)
			{
				return obj2.getValue().compareTo(obj1.getValue());
			}
		});
    	return list_entries;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] genres = {"pop", "pop", "pop", "rap", "pop"};
		int[] plays = {45, 50, 40, 60, 70};
		int[] result = solution(genres, plays);
		System.out.println("결과1 : "+ Arrays.toString(result));

		String [] genres2 = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays2 = {500, 600, 150, 800, 2500 };
		int[] result2 = solution(genres2, plays2);
		System.out.println("결과2 : "+Arrays.toString(result2));




	}

}
