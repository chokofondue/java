package ex02;

import java.util.Random;

public class plusGame implements GameOper{
	private int randomNum_01;
	private int randomNum_02;
	Random random = new Random();
	
	public String sum() {
		return randomNum_01 + "+" + randomNum_02 + "=";
	}

	public void plusGame_randomNum(int max) {
		randomNum_01 = random.nextInt(max) + 1;
		randomNum_02 = random.nextInt(max) + 1;

	}
	
	public boolean answer(int answer) {
		return answer == randomNum_01 + randomNum_02;
	}
}
