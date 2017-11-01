package ex1025;

import java.util.Scanner;

public class ex1025_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("java점수 입력 : ");
		int java = sc.nextInt();
		
		System.out.print("web점수 입력 : ");
		int web = sc.nextInt();
		
		System.out.print("android점수 입력 : ");
		int android = sc.nextInt();
		
		System.out.println(sum(java, web));
		System.out.println(sum(java, web, android));
		
	}
	
	public static int sum(int java, int web) {
		int result=0;
		result= java+web;
		
		return result;
	}
	
	public static int sum(int java, int web, int android) {
		
		int result=0;
		result= java+web+android;

		return result;
	}

}
