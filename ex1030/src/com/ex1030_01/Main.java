package com.ex1030_01;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//Object = ��� Ŭ������ �θ�Ÿ��
		Object o = new Object();
		
		//�ڷ��� ��� �ֱ� ����
		ArrayList<Object> array = new ArrayList<Object>();
		
		array.add("���ڿ�");
		array.add(12332);
		array.add(51239);
		array.add(123.123);
		
		
		//�׳� ������ �Ұ���, �ٿ�ĳ���� �� ���� = �̹� Objectȭ �Ǿ���� ���� �Ұ���
		int num = (int)array.get(1) + (int)array.get(2); // �ٿ�ĳ���� �� ����	
		System.out.println(num);
	}

}
