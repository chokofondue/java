package com.ex1030;

public class Main {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		
		//���
		sp.Call();
		sp.Re();
		
		sp.Internet();
		sp.music();
		
		//����̹Ƿ� ����
		Phone p = new SmartPhone(); // ��ĳ����(����ȯ) -> ���ʿ� ���� �ۼ����� �ʿ� ����
		p.Call();
		p.Re();
		
		//�ٿ�ĳ����(����ȯ) -> ���ʿ� ���� �ۼ��� �������
		((SmartPhone)p).Internet();
		((SmartPhone)p).music();

	}

}
