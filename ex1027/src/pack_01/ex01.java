package pack_01;

public class ex01 {

	public static void main(String[] args) {
		ex01_01 Person_01 = new ex01_01("test01", "����", 25);
		ex01_01 Person_02 = new ex01_01("test02", "����", 20);
		
		System.out.println("�̸� : " + Person_01.getName() + "\n���� : " + Person_01.getGender() + "\n���� : " + Person_01.getAge());
		System.out.println("�̸� : " + Person_02.getName() + "\n���� : " + Person_02.getGender() + "\n���� : " + Person_02.getAge());
	}

}
