package pokemon;

public class pokemon {
	private String name;
	private String type;
	private int hp;
	private int damage;
	private int defensive;
	private int speed;
	private boolean state;
	
	public pokemon(String name, String type, int hp, int damage, int defensive, int speed, boolean state) {
		super();
		this.name = name;
		this.type = type;
		this.hp = hp;
		this.damage = damage;
		this.defensive = defensive;
		this.speed = speed;
		this.state = state;
	}

	public int attach() {
		return damage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getDefensive() {
		return defensive;
	}

	public void setDefensive(int defensive) {
		this.defensive = defensive;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
}
