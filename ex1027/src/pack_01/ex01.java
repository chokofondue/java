package pack_01;

public class ex01 {

	public static void main(String[] args) {
		ex01_01 Person_01 = new ex01_01("test01", "남자", 25);
		ex01_01 Person_02 = new ex01_01("test02", "여자", 20);
		
		System.out.println("이름 : " + Person_01.getName() + "\n성별 : " + Person_01.getGender() + "\n나이 : " + Person_01.getAge());
		System.out.println("이름 : " + Person_02.getName() + "\n성별 : " + Person_02.getGender() + "\n나이 : " + Person_02.getAge());
	}

}
