package pack_04;

public class studentVO {
	private int Student_ID;
	private String name;
	private int java;
	private int web;
	private int android;
	
	public studentVO(int student_ID, String name, int java, int web, int android) {
		super();
		this.Student_ID = student_ID;
		this.name = name;
		this.java = java;
		this.web = web;
		this.android = android;
	}

	public int getJava() {
		return java;
	}

	public int getWeb() {
		return web;
	}

	public int getAndroid() {
		return android;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(Student_ID + "\t");
		builder.append(name + "\t");	
		builder.append(java + "\t");
		builder.append(web + "\t");
		builder.append(android + "\t");
		
		return builder.toString();
	}
}
