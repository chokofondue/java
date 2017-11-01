package ex1030_02;

public class PartTimeEmployee extends Employee {
	
	private int workDay;
	
	//상속관계에서 부모클래스에 매개변수가 있는 생성자가 있으면 반드시 호출
	public PartTimeEmployee(String num, String name, int Pay, int workDay) {
		super(num, name, Pay);
		this.workDay = workDay;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getmonthPay() {
		return workDay * Pay;
	}

}
