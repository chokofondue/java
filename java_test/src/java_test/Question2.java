package java_test;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̰��� ������� ������� ������ ����!!");
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String a = sc.next();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int b = sc.nextInt();
		
		System.out.println("������ �����ϼ���.");
		System.out.print("[1]�̰��� [2]�ι��� >> ");
		int c = sc.nextInt();
		
		if(b<35 && c == 1) {
			System.out.println(a + "���� ���������մϴ�.");
		} else {
			System.out.println(a + "���� ��������ڰ� �ƴմϴ�.");
		}

	}

}
