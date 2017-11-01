package com.ex1030_01;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Object = 모든 클래스의 부모타입
		Object o = new Object();
		
		//자료형 모두 넣기 가능
		ArrayList<Object> array = new ArrayList<Object>();
		
		array.add("문자열");
		array.add(12332);
		array.add(51239);
		array.add(123.123);
		
		
		//그냥 연산은 불가능, 다운캐스팅 후 연산 = 이미 Object화 되어버려 연산 불가능
		int num = (int)array.get(1) + (int)array.get(2); // 다운캐스팅 후 연산	
		System.out.println(num);
	}

}
