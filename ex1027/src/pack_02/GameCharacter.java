package pack_02;

public class GameCharacter {
	private String id;
	private String job;
	private int lv;
	private String gender;
	
	public GameCharacter(String id, String job, int lv, String gender) {
		super();
		this.id = id;
		this.job = job;
		this.lv = lv;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getLv() {
		return lv;
	}

	public void setLv(int lv) {
		this.lv = lv;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}
