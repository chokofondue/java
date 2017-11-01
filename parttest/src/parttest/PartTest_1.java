package parttest;

import java.util.Random;
import java.util.Scanner;

public class PartTest_1 {

	public static void main(String[] args) {

		String ID = "test11";
		String PW = "pw11";
		Scanner c=new Scanner(System.in);
		
		System.out.println("========= 구구단 게임 =========");

		do {
			System.out.println("아이디를 입력하세요>> ");
			ID = c.next();
			System.out.println("비밀번호를 입력하세요>> ");
			PW = c.next();
			
			if (ID.equals("test11") && PW.equals("pw11")) {
				System.out.println(ID + "님 환영합니다!");
				break;
			} else {
				System.out.println("일치하는 정보가 존재하지 않습니다.");
			}

		} while (true);
		GogodanStart();
	}

	public static void GogodanStart() {
		int num = 0;
		System.out.println("====== Game Start ======");
		System.out.println("[1]게임시작   [2]연습하기   [3]종료");

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
				System.out.println("종료되었습니다.");
				break;

			default:
				System.out.println("잘못입력하셨습니다.");
				break;
			}

		} while (num != 3);

	}

	public static void GameStart() {

		System.out.println("게임");
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
		System.out.println(count + "개 맞췄습니다!");
		if (count >= 15) {
			System.out.println("당신은 고수이군요");
		} else if (count >= 10) {
			System.out.println("구구단 좀 하는걸?");
		} else if (count >= 5) {
			System.out.println("그럭저럭하네");
		} else {
			System.out.println("구구단 공부좀 해야겠는걸?");
		}
		System.out.println("=====Game Over=====");
	}

	public static void etude() {

		System.out.println("연습");
		Scanner c = new Scanner(System.in);
		int num1 = 0, num2 = 0, total = 0;
		System.out.print("시작단을 입력하세요!");
		num1 = c.nextInt();
		while (true) {
			System.out.print("마지막단을 입력하세요!");
			num2 = c.nextInt();
			if (num1 > num2) {
				System.out.println("마지막 단을 다시 입력하세요.");
			} else {
				break;
			}
		}
		System.out.println(num1 + "단부터 " + num2 + "단까지 출력하겠습니다.");
		System.out.println("========================================================================");
		for (int i = num1; i <= num2; i++) {
			System.out.print(i + "단");
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
