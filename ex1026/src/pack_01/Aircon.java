package pack_01;

public class Aircon {
	private boolean Power;
	private int Temperature;
	private int WindPower;
	
	public void powerOnOff() {
		Power = !Power;
	}

	public void TemperatureUp() {
		++Temperature;
	}
	public void TemperatureDown() {
		--Temperature;
	}
	public void WindPowerUp() {
		++WindPower;
	}
	public void WindPowerDown() {
		--WindPower;
	}
	
	public void setTemperture(int Tempetature) {
		this.Temperature = Tempetature;
	}
	public void setWindPower(int WindPower) {
		this.WindPower = WindPower;
	}
	//public void print()
}
