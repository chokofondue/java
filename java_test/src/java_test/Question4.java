package java_test;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요 >> ");
		float a = sc.nextFloat();
		
		System.out.print("키를 입력하세요 >> ");
		float b = sc.nextFloat();
		
		float c = a/(b*b);
		
		System.out.println(c);
		
		if(c < 18.4) {
			System.out.println("당신은 저체중 입니다.");
		} else if(c > 18.4 && c < 22.9) {
			System.out.println("당신은 정상 입니다.");
		} else if(c > 22.9 && c < 24.9) {
			System.out.println("당신은 과체중 입니다.");
		} else if(c > 24.9 && c < 29.9) {
			System.out.println("당신은 비만 입니다.");
		} else if(c > 30) {
			System.out.println("당신은 고도비만 입니다.");
		}

	}

}
