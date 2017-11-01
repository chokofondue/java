package ex1025;

import java.util.Scanner;

public class ex1025_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		System.out.println("초 : "+s);
		
		System.out.println(time(s));
	}
	
	public static String time(int s) {
		
		int h = 0;
		int m = 0;
		
		m=s/60;
		s=s%60;
		h=m/60;
		m=m%60;
		
		return h+"시"+m+"분"+s+"초";
		
	}

}
