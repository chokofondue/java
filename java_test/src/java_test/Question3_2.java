package java_test;

import java.util.Random;

public class Question3_2 {

	public static void main(String[] args) {
		Random random = new Random();
		int randomNum = 0;
		

		randomNum = random.nextInt(10)+11;

		System.out.println("³­¼ö " + randomNum);
		System.out.println(discriminate(randomNum) + "ÀÔ´Ï´Ù.");
		
	}
	
	private static String discriminate(int randomNum) {
		String result = "";
		
		if(randomNum%2 == 0) {
			result = "Â¦¼ö";
		} else {
			result = "È¦¼ö";
		}
		return result;
	}

}
