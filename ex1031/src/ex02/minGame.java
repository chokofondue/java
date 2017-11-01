package ex02;

import java.util.Random;

public class minGame implements GameOper {
	private int randomNum_01;
	private int randomNum_02;
	Random random = new Random();
	
	@Override
	public boolean answer(int answer) {
		// TODO Auto-generated method stub
		return answer == randomNum_01 - randomNum_02;
	}

	@Override
	public String sum() {
		// TODO Auto-generated method stub
		return randomNum_01 + "-" + randomNum_02 + "=";
	}

	@Override
	public void plusGame_randomNum(int max) {
		// TODO Auto-generated method stub
		randomNum_01 = random.nextInt(max) + 1;
		randomNum_02 = random.nextInt(max) + 1;
	}

}
