package com.machine;

import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		//한 묶음으로 묶기(상위 Doll클래스 생성)
		ArrayList<Doll> doll_array = new ArrayList<Doll>();
		doll_array.add(new Doll_01());
		doll_array.add(new Doll_02());
		doll_array.add(new Doll_03());
		doll_array.add(new Doll_04());
		
		randomMachine(doll_array);
		
	}

	private static void randomMachine(ArrayList<Doll> doll_array) {
		int num = new Random().nextInt(doll_array.size());
		Doll doll = doll_array.get(num);
		
		doll.pick();
		
		/*//instanceof 왼쪽 객체 타입 알아보기
		if(doll_array.get(num) instanceof Doll_01) {
			doll.pick();
		} else if(doll_array.get(num) instanceof Doll_02) {
			doll.pick();
		} else if(doll_array.get(num) instanceof Doll_03) {
			doll.pick();
		}
		*/
	}
}
