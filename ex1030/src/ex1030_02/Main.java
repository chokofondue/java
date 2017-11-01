package ex1030_02;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Employee> employee = new ArrayList<Employee>();
		employee.add(new PartTimeEmployee("E001", "test1", 5, 10));
		employee.add(new PartTimeEmployee("E002", "test2", 10, 20));
		employee.add(new contractEmployee("E003", "test3", 5000, 6));
		employee.add(new contractEmployee("E004", "test4", 3000, 400));
		
		print(employee);
		
	}

	private static void print(ArrayList<Employee> employee) {
		
		for (int i = 0; i < employee.size(); i++) {
			System.out.println(employee.get(i));
		}
		
	}

}
