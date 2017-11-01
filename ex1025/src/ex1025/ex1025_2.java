package ex1025;

import java.util.Scanner;

public class ex1025_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("¹Ø >"+num1);
		System.out.println("Áö¼ö >"+num2);
	
	}
	
	public static int a(int num1, int num2) {
		
		int result = num1;
		
		for(int i=1; i<num2; i++) {
			result=num1*result;
		}
		
		return result;
		
	}

}
