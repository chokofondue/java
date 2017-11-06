package BingoAI;

import java.util.Random;

public class BingoRandomBase {
	
	String name;
	
	BingoRandomBase(String name){
		this.name = name;
		
	}
	
	public String getName(){
		return name;
	}
	
	public int[] getNextNum(int[][] bingo) {
		int[] choiceNum = new int[2]; // row,col
		
		
		
		do{
			choiceNum[0] = new Random().nextInt(bingo.length);
			choiceNum[1] = new Random().nextInt(bingo[0].length);
			
			
			
		}while(bingo[choiceNum[0]][choiceNum[1]] == 0);
		
		
		return choiceNum;
	}
}
