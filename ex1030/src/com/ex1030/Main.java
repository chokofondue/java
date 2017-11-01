package com.ex1030;

public class Main {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		
		//상속
		sp.Call();
		sp.Re();
		
		sp.Internet();
		sp.music();
		
		//상속이므로 가능
		Phone p = new SmartPhone(); // 업캐스팅(형변환) -> 앞쪽에 따로 작성해줄 필요 없음
		p.Call();
		p.Re();
		
		//다운캐스팅(형변환) -> 앞쪽에 따로 작성을 해줘야함
		((SmartPhone)p).Internet();
		((SmartPhone)p).music();

	}

}
