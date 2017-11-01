package pack_04;

import java.util.ArrayList;
import java.util.Scanner;

public class studentMain {
	static studentController controller = new studentController();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int java, web, android = 0;
		
		
		String menu[] = {"[1]학생등록", "[2]전체조회", "[3]학생검색"};
		
		while(true) {
			System.out.println("============학점관리프로그램============");
			for(int i = 0; i < menu.length; i++) {
				System.out.print(menu[i]);
			}
			System.out.print(" >> ");
			int select_num = sc.nextInt();
			System.out.println("====================================");
			if(select_num == 1) {
				
				System.out.print("이름 : ");
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
				
				
				System.out.println("--------------------전 체 조 회------------------------");
				System.out.println("학번\t이름\tJava\tWeb\tAndroid\t평균\t학점");
				for (int i = 0; i < controller.studentlist.size(); i++) {
					System.out.println(controller.studentlist.get(i).toString() + controller.avg() + "\t" + controller.grades());	
				}
				System.out.println("----------------------------------------------------");
				System.out.print("평균\t\t" + controller.avg_grade());
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
