package java_test;

import java.util.Random;

public class Question3_1 {

	public static void main(String[] args) {
		Random random = new Random();
		int randomNum = 0;
		String result = "";

		randomNum = random.nextInt(10)+11;
		
		if(randomNum%2 == 0) {
			result = "Â¦¼ö";
		} else {
			result = "È¦¼ö";
		}
		System.out.println("³­¼ö " + randomNum);
		System.out.println(result + "ÀÔ´Ï´Ù.");	
	}
}
