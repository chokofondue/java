package ex02;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	static Random random = new Random();

	static int randomNum_01 = 0;
	static int randomNum_02 = 0;

	public static void main(String[] args) {
		// 1. �������� �ΰ��� �̾� ��� ex>3+5=
		// 2. ���� �Է�
		// 3. ���� -> ��������, ���� -> �����ڵ�
		// 4. 3���̻� Ʋ���� ����

		ArrayList<String> err = new ArrayList<String>();
		err.add("����...");
		err.add("�� Ʋ�ȳ׿�.");
		err.add("Ʋ�ȳ׿�.");

		plusGame(err, 9, 3, new plusGame()); // �����޼���, ���� ���̵�, ��ȸ
		//minusGame(err, 9, 3, new minGame());

	}

	private static void minusGame(ArrayList<String> err, int max, int cnt, minGame mg) {
		int answerCount = 0;

		while (true) {
			mg.plusGame_randomNum(max);
			System.out.print(mg.sum());
			int answer = sc.nextInt();

			if (mg.answer(answer)) {
				System.out.println("�����Դϴ�.");
				answerCount++;
			} else {
				cnt--;
				System.out.println(err.get(cnt));
				if (cnt == 0) {
					System.out.println("����� : " + answerCount);
					break;
				}
			}
		}

	}

	private static void plusGame(ArrayList<String> err, int max, int cnt, plusGame pg) {

		int answerCount = 0;
		int answer = 0;
		while (true) {
			pg.plusGame_randomNum(max);
			System.out.print(pg.sum());
			
			try {
				answer = new Scanner(System.in).nextInt();
				if (pg.answer(answer)) {
					System.out.println("�����Դϴ�.");
					answerCount++;
				} else {
					cnt--;
					System.out.println(err.get(cnt));
					if (cnt == 0) {
						System.out.println("����� : " + answerCount);
						break;
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			

			
		}
	}

}
