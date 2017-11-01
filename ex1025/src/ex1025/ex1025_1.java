package ex1025;

import java.util.Scanner;

public class ex1025_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		System.out.println("입력1 >> "+num1);
		System.out.println("입력2 >> "+num2);
		
		max1(num1, num2);
			
	}
	
	public static int max1(int num1, int num2) {
		
		if(num1<num2) {
			return num2;
		}else {
			return num1;
		}
		
	}

}
