package pack_04;

import java.util.ArrayList;
import java.util.Scanner;

public class studentMain {
	static studentController controller = new studentController();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int java, web, android = 0;
		
		
		String menu[] = {"[1]�л����", "[2]��ü��ȸ", "[3]�л��˻�"};
		
		while(true) {
			System.out.println("============�����������α׷�============");
			for(int i = 0; i < menu.length; i++) {
				System.out.print(menu[i]);
			}
			System.out.print(" >> ");
			int select_num = sc.nextInt();
			System.out.println("====================================");
			if(select_num == 1) {
				
				System.out.print("�̸� : ");
				String name = sc.next();
				
				System.out.print("Java : ");
				java = sc.nextInt();
				
				System.out.print("web : ");
				web = sc.nextInt();
				
				System.out.print("android : ");
				android = sc.nextInt();
				
				controller.add(name, java, web, android);
				
			} else if(select_num == 2) {
				//print(ArrayList<StudentVO>controller.getAllStudent());
				
				
				System.out.println("--------------------�� ü �� ȸ------------------------");
				System.out.println("�й�\t�̸�\tJava\tWeb\tAndroid\t���\t����");
				for (int i = 0; i < controller.studentlist.size(); i++) {
					System.out.println(controller.studentlist.get(i).toString() + controller.avg() + "\t" + controller.grades());	
				}
				System.out.println("----------------------------------------------------");
				System.out.print("���\t\t" + controller.avg_grade());
			} else if(select_num == 3) {
				
			}
		}
		
	/*	private static void print(ArrayList<studentVO> allStudent) {
			for(int i = 0; i<allStudent.size(); i++) {
				System.out.println(allStudent.get(i) + controller.getStuAvg(allStudent.get(i)));
			}
		}*/
	}
}
