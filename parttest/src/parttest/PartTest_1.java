package parttest;

import java.util.Random;
import java.util.Scanner;

public class PartTest_1 {

	public static void main(String[] args) {

		String ID = "test11";
		String PW = "pw11";
		Scanner c=new Scanner(System.in);
		
		System.out.println("========= ������ ���� =========");

		do {
			System.out.println("���̵� �Է��ϼ���>> ");
			ID = c.next();
			System.out.println("��й�ȣ�� �Է��ϼ���>> ");
			PW = c.next();
			
			if (ID.equals("test11") && PW.equals("pw11")) {
				System.out.println(ID + "�� ȯ���մϴ�!");
				break;
			} else {
				System.out.println("��ġ�ϴ� ������ �������� �ʽ��ϴ�.");
			}

		} while (true);
		GogodanStart();
	}

	public static void GogodanStart() {
		int num = 0;
		System.out.println("====== Game Start ======");
		System.out.println("[1]���ӽ���   [2]�����ϱ�   [3]����");

		do {
			num = new Scanner(System.in).nextInt();
			switch (num) {
			case 1:
				GameStart();
				break;

			case 2:
				etude();
				break;

			case 3:
				System.out.println("����Ǿ����ϴ�.");
				break;

			default:
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
				break;
			}

		} while (num != 3);

	}

	public static void GameStart() {

		System.out.println("����");
		int ran1 = 0, ran2 = 0, total = 0, input = 0, count = 0;
		Random ran = new Random();
		Scanner c = new Scanner(System.in);
		System.out.println("=====Game Start=====");
		while (true) {
			ran1 = ran.nextInt(9) + 1;
			ran2 = ran.nextInt(9) + 1;
			total = ran1 * ran2;
			System.out.print(ran1 + "*" + ran2 + "=");
			input = c.nextInt();
			if (input != total) {
				break;
			}
			count++;
		}
		System.out.println(count + "�� ������ϴ�!");
		if (count >= 15) {
			System.out.println("����� ����̱���");
		} else if (count >= 10) {
			System.out.println("������ �� �ϴ°�?");
		} else if (count >= 5) {
			System.out.println("�׷������ϳ�");
		} else {
			System.out.println("������ ������ �ؾ߰ڴ°�?");
		}
		System.out.println("=====Game Over=====");
	}

	public static void etude() {

		System.out.println("����");
		Scanner c = new Scanner(System.in);
		int num1 = 0, num2 = 0, total = 0;
		System.out.print("���۴��� �Է��ϼ���!");
		num1 = c.nextInt();
		while (true) {
			System.out.print("���������� �Է��ϼ���!");
			num2 = c.nextInt();
			if (num1 > num2) {
				System.out.println("������ ���� �ٽ� �Է��ϼ���.");
			} else {
				break;
			}
		}
		System.out.println(num1 + "�ܺ��� " + num2 + "�ܱ��� ����ϰڽ��ϴ�.");
		System.out.println("========================================================================");
		for (int i = num1; i <= num2; i++) {
			System.out.print(i + "��");
			for (int j = 1; j <= 9; j++) {
				total = j * i;
				System.out.print(i + "*" + j + "=" + total + "  ");
				if(total<10) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("==========================================================================");
	}

}
