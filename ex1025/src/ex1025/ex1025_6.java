package ex1025;

import java.util.Random;

public class ex1025_6 {

	public static void main(String[] args) {
		
		int num1 = new Random().nextInt(5)+1;
		int num2 = new Random().nextInt(5)+1;
		
		System.out.println("ù��° ��"+num1);
		System.out.println("�ι�° ��"+num2);
		
		System.out.println(sum(num1, num2));

	}

	public static int sum(int num1, int num2) {
		
	
		if(num1 != num2) {
			return num1+num2;
		}else {
			num1 = new Random().nextInt(5)+1;
			num2 = new Random().nextInt(5)+1;
		}
		
		return num1+num2;
	}
	
}
