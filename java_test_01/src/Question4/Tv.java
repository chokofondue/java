package Question4;

public class Tv {

	public int channel;
	public String color;
	
	public void print() {
		System.out.println("Tv�� ���� ä���� : " + channel + "�̰�, Tv�� ������ " + color + " �Դϴ�.");
		
	}
	public int channelUp() {
		return ++channel;
	}
	public int channelDown() {
		return --channel;		
	}
}
