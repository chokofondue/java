package ex1030_02;

public class PartTimeEmployee extends Employee {
	
	private int workDay;
	
	//��Ӱ��迡�� �θ�Ŭ������ �Ű������� �ִ� �����ڰ� ������ �ݵ�� ȣ��
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
