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
		// 1. 랜덤숫자 두개를 뽑아 출력 ex>3+5=
		// 2. 답을 입력
		// 3. 정답 -> 다음문제, 오답 -> 에러코드
		// 4. 3번이상 틀리면 종료

		ArrayList<String> err = new ArrayList<String>();
		err.add("에휴...");
		err.add("또 틀렸네요.");
		err.add("틀렸네요.");

		plusGame(err, 9, 3, new plusGame()); // 에러메세지, 문제 난이도, 기회
		//minusGame(err, 9, 3, new minGame());

	}

	private static void minusGame(ArrayList<String> err, int max, int cnt, minGame mg) {
		int answerCount = 0;

		while (true) {
			mg.plusGame_randomNum(max);
			System.out.print(mg.sum());
			int answer = sc.nextInt();

			if (mg.answer(answer)) {
				System.out.println("정답입니다.");
				answerCount++;
			} else {
				cnt--;
				System.out.println(err.get(cnt));
				if (cnt == 0) {
					System.out.println("정답수 : " + answerCount);
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
					System.out.println("정답입니다.");
					answerCount++;
				} else {
					cnt--;
					System.out.println(err.get(cnt));
					if (cnt == 0) {
						System.out.println("정답수 : " + answerCount);
						break;
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("잘못 입력하셨습니다.");
			}
			

			
		}
	}

}
