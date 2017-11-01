package java_test;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		System.out.println(decreaseNumber(num));
	}

	private static String decreaseNumber(int num) {
		StringBuilder a = new StringBuilder();
		
		for (int i = num; i > 0; i-=2) {
			a.append(i);
			a.append(" ");
		}
		return a.toString();
	}

}
