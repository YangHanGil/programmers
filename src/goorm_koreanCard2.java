import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class goorm_koreanCard2 {
	 
    public static Scanner scanner = new Scanner(System.in);
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		String id = scanner.next();
		String pw1 = scanner.next();
		String pw2 = scanner.next();
		
		if(isId(id)&&isPass(pw1)&&pw1.matches(pw2)) System.out.println("pass");
		else System.out.println("fail");
		
	}
	
	public static boolean isId(String str) {
		return Pattern.matches("^([a-z0-9]*){3,20}$", str);
	}
	
	public static boolean isPass(String str) {
		return Pattern.matches("^([a-zA-Z0-9!@#$]*){8,20}$", str);
	}

}
