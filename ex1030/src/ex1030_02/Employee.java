package ex1030_02;

public abstract class Employee {
	protected String num;
	protected String name;
	protected int Pay;
	
	//생성자
	public Employee(String num, String name, int Pay) {
		super();
		this.num = num;
		this.name = name;
		this.Pay = Pay;
	}
	
	public abstract double getmonthPay();
	
	public String toString() {
		//println() 메소드에 객체 래퍼런스 입력 시 호출
		
		StringBuilder builder = new StringBuilder();
		builder.append(num);
		builder.append(" : ");
		builder.append(name);
		builder.append(" : ");
		builder.append(getmonthPay());
		builder.append("원");
		
		return builder.toString();
		//return num + " : " + 'name + " : " + Pay + "원";
	}
}
