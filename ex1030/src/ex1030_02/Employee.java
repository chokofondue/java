package ex1030_02;

public abstract class Employee {
	protected String num;
	protected String name;
	protected int Pay;
	
	//������
	public Employee(String num, String name, int Pay) {
		super();
		this.num = num;
		this.name = name;
		this.Pay = Pay;
	}
	
	public abstract double getmonthPay();
	
	public String toString() {
		//println() �޼ҵ忡 ��ü ���۷��� �Է� �� ȣ��
		
		StringBuilder builder = new StringBuilder();
		builder.append(num);
		builder.append(" : ");
		builder.append(name);
		builder.append(" : ");
		builder.append(getmonthPay());
		builder.append("��");
		
		return builder.toString();
		//return num + " : " + 'name + " : " + Pay + "��";
	}
}
