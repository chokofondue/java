package pak01;

public class Tv {
	
	String model;
	boolean power;
	int vol;
	int ch;
	StringBuilder builder = new StringBuilder();
	
	public void powerOnOff() {
		/*if(power == true) {
			power= false;
		}else if(power == false) {
			power=true;
		}
		*/
		power = !power;	
	}
	
	public int volUp() {
		return vol++;
	}
	
	public int volDown() {
		return vol--;
	}
	
	public int chUp() {
		return ch++;
	}

	public int chDown() {
		return ch--;
	}

	public String getState() {
		
		builder.append("¸ðµ¨¸í:");
		builder.append(model);
		
		builder.append("power :");
		builder.append(power);
		
		builder.append("   vol :");
		builder.append(vol);
		
		builder.append("   ch :");
		builder.append(ch);
		
		return builder.toString();
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
}
