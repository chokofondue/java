package java_test;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이공계 전문기술 연수사업 연수생 모집!!");
		
		System.out.print("이름을 입력하세요 : ");
		String a = sc.next();
		
		System.out.print("나이를 입력하세요 : ");
		int b = sc.nextInt();
		
		System.out.println("전공을 선택하세요.");
		System.out.print("[1]이공계 [2]인문계 >> ");
		int c = sc.nextInt();
		
		if(b<35 && c == 1) {
			System.out.println(a + "님은 연수가능합니다.");
		} else {
			System.out.println(a + "님은 연수대상자가 아닙니다.");
		}

	}

}
