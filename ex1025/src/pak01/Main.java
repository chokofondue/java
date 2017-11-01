package pak01;

public class Main {

	public static void main(String[] args) {
		int nowch=0;
		int nowvol=0;
		
		Tv samsung = new Tv(); //래퍼런스변수
		samsung.powerOnOff();
		samsung.powerOnOff();
		
		nowvol = samsung.volUp();
		nowvol = samsung.volDown();
		
		nowch = samsung.chUp();
		nowch = samsung.chDown();
		
		samsung.setModel("SD-01");
		
		System.out.println(samsung.getState());
		
		samsung.chUp();
		
		samsung.volUp();
		
		samsung.powerOnOff();
		
		System.out.println(samsung.getState());
		
	}

}
