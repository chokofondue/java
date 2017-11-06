package BingoAI;

import java.util.Random;
import java.util.Scanner;

public class Controll {
	static BingoRandomBase rn = new BingoRandomBase("user1");
	static int size = 7;

	public int[][] MakeBingo() {
		int[][] bingo = new int[size][size];
		
		int cnt = 1;
		for(int i=0; i<bingo.length; i++){
			for(int j=0; j<bingo[i].length; j++){
				bingo[i][j] = cnt++;
			}
		}
		
		
		int[] s = new int[bingo.length];
		int temp;
		
		for(int j=0; j<100; j++){
			for(int i=0; i<s.length; i++){
				s[i] = new Random().nextInt(size);
			}
			
			temp = bingo[s[0]][s[1]];
			bingo[s[0]][s[1]] = bingo[s[2]][s[3]];
			bingo[s[2]][s[3]] = temp;
		}
		return bingo;
	}

	

	public int isBingo(int[][] bingo) {
		int bingoCount = 0;
		
		if (bingo[0][0] == 0){
			int cnt = 1;
			for(int j=1; j<bingo.length; j++){
				if (bingo[j][j] == 0){
					cnt++;
				}else{
					break;
				}
			}
			
			if (cnt ==  bingo.length){
				bingoCount++;
			}
		}
		
		for(int i=0; i<bingo.length; i++){
			
			if (bingo[i][0] == 0){
				int cnt = 1;
				for(int j=1; j<bingo[i].length; j++){
					if (bingo[i][j] == 0){
						cnt++;
					}else{
						break;
					}
				}
				
				if (cnt == bingo[i].length){
					bingoCount++;
				}
			}
			
			if (bingo[0][i] == 0){
				int cnt = 1;
				for(int j=1; j<bingo[0].length; j++){
					if (bingo[j][i] == 0){
						cnt++;
					}else{
						break;
					}
				}
				
				if (cnt == bingo[i].length){
					bingoCount++;
				}
			}
			
		}
		if (bingo[bingo.length-1][0] == 0){
			int cnt = 1;
			for(int j=bingo.length-2; j>=0; j--){
				if (bingo[j][bingo.length-j-1] == 0){
					cnt++;
				}else{
					break;
				}
			}
			
			if (cnt ==  bingo.length){
				bingoCount++;
			}
		}
		
		
		return bingoCount;
	}

}
