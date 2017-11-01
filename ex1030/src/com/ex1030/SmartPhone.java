package com.ex1030;

public class SmartPhone extends Phone {
	//다중 상속은 안됨, 횟수는 제한을 두지 않음
	
	public void music() {
		System.out.println("음악재생");
	}
	public void Internet() {
		System.out.println("인터넷");
	}
	
	public void Call() {
		System.out.println("SmartPhone 전화걸기");
	}
}
