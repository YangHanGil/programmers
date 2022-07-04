import java.io.*;
import java.lang.*;
import java.util.*;

public class goorm_koreanCard4 {
	
	
    public static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		40 40
//		z????dgrktn?x??z?t?h?fki?nbef?t??hf?j?xe
		/*
15 6
a??l?ban???????
apple
cow
farmer
banana
bananas
pies

applebananapies
*/
		
		
		
/*
40 40
z????dgrktn?x??z?t?h?fki?nbef?t??hf?j?xe
iuzdtthbfkiznbefh
rktnlxiuzdtthbfki
t
nbefhtukhfdj
ktnlxiuzdtthbfkiznbe
dtth
htukhfdjg
dj
bfkiznbefh
fd
hbfk
tnlxiuzdtthbfkiznbef
znbefhtukhfdjg
ugjedgrktnlxi
thbfkiznbef
fdjgxe
e
befh
x
grktnlxiuzdtthbfkizn
e
nlxiuzdtthbfkiznbe
jedgrktnlxi
uzdtth
uk
gjedg
jgxe
htuk
g
xiuzdtthbfkizn
jedgrktnlxiuzdtthbf
zn
x
xi
gjedgrktnlxiu
uzdtth
iz
zdtthbfkiznbefht
jgxe
efhtukh

zndjfdgrktnlxiuzdtthbfkienbefhtukhfdjexe
*/
		
		
		
		String[] scanArr = scanner.nextLine().split(" ");
		int testCase = Integer.parseInt(scanArr[1])+1;
		String title = "";
		List<String> contentList =  new ArrayList<String>();
		List<String> titleList =  new ArrayList<String>();
		HashMap<Integer, String> map = new HashMap<>();
		
		for (int i = 0; i < testCase; i++) {
			if(i==0) {
				title = scanner.nextLine();
				for (int j = 0; j < title.split("\\?").length; j++) {
					String str = title.split("\\?")[j];
					if(!str.matches(""))titleList.add(str);
				}
			} else {
				String content = scanner.nextLine();
				contentList.add(content);
			}
		}

		String result = "";
		int cnt = 0;
		for (int i = 0; i < titleList.size(); i++) {
			String titleStr = titleList.get(i);
			for (String contentStr : contentList) {
				if(i == 0) {
					if(contentStr.indexOf(titleStr)==0) {
						result = contentStr;
					}
					
				} else {
					if(contentStr.indexOf(titleStr)>-1) {
						result += contentStr;
						cnt++;
					}
				}
			}
		}
		
		System.out.println(result);
		
	}

}
