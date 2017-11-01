package pack_04;

import java.util.ArrayList;

public class studentController {
	ArrayList<studentVO> studentlist = new ArrayList<studentVO>(); 
	
	int student_ID = 1001;

	public void add(String name, int java, int web, int android) {
		studentlist.add(new studentVO(student_ID++, name, java, web, android));
	}
	
	public float avg() {
		float avg = 0;
		for (int i = 0; i < studentlist.size(); i++) {
			avg = (studentlist.get(i).getJava() + studentlist.get(i).getWeb() + studentlist.get(i).getAndroid())/3;
		}
		return avg;
	}
	
	public String grades() {
		String grade = null;
		for(int i = 0; i < studentlist.size(); i++) {
			if(avg() >= 95) {
				grade = "a+";
			} else if(avg() >= 90) {
				grade = "a";
			} else if(avg() >= 85) {
				grade = "b+";
			} else if(avg() >= 80) {
				grade = "b";
			} else if(avg() >= 75) {
				grade = "c+";
			} else if(avg() >= 70) {
				grade = "c";
			} else if(avg() >= 65) {
				grade = "d+";
			} else if(avg() >= 60) {
				grade = "d";
			} else if(avg() <60) {
				grade = "f";
			}
		}
		return grade;
	}

	public String avg_grade() {
		float java_avg = 0;
		float web_avg = 0;
		float android_avg = 0;
		float java_sum = 0;
		for (int i = 0; i < studentlist.size(); i++) {
			java_sum += studentlist.get(i).getJava();
		}
		java_avg = java_sum/studentlist.size();
		return null;
	}

	/*public Object getAllStudent() {
		// TODO Auto-generated method stub
		return studentlist.clone();
	}
	
	public double getStuAvg(studentVO studentVO) {
		return student_ID;
		
	
	}*/
	
	
}
