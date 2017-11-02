package Question5;

public class Main {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.phoneNumber = "010-1234-5678";
		sp.usimID = "ID1234";
		
		sp.call();
		sp.message();
		sp.picture();
		sp.music();
		sp.kakaoTalk();
		sp.wifi();
		
		CameraPhone cp = new CameraPhone();
		cp.phoneNumber = "010-9876-5432";
	
		cp.call();
		cp.message();
		cp.picture();
		cp.music();
		
		MobilePhone mp = new MobilePhone();
		mp.phoneNumber = "010-4567-8945";
		mp.call();
		mp.message();
		

	}

}
