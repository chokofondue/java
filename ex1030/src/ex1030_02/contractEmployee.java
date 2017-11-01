package ex1030_02;

public class contractEmployee extends Employee {
	
	private int month;
	
	public contractEmployee(String num, String name, int Pay, int month) {
		super(num, name, Pay);
		this.month = month;
		
	}

	@Override
	public double getmonthPay() {
		
		return Pay/12.0*6;
	}

}
