package java_test;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�����Ը� �Է��ϼ��� >> ");
		float a = sc.nextFloat();
		
		System.out.print("Ű�� �Է��ϼ��� >> ");
		float b = sc.nextFloat();
		
		float c = a/(b*b);
		
		System.out.println(c);
		
		if(c < 18.4) {
			System.out.println("����� ��ü�� �Դϴ�.");
		} else if(c > 18.4 && c < 22.9) {
			System.out.println("����� ���� �Դϴ�.");
		} else if(c > 22.9 && c < 24.9) {
			System.out.println("����� ��ü�� �Դϴ�.");
		} else if(c > 24.9 && c < 29.9) {
			System.out.println("����� �� �Դϴ�.");
		} else if(c > 30) {
			System.out.println("����� ���� �Դϴ�.");
		}

	}

}
