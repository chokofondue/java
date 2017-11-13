package com.model;

//VO 데이터를 주고 받기 위해 묶어서 전송(객체)
public class WebDTO {
	private String email;
	private String pw;
	private String tel;
	private String address;
	private int num;
	private String send_email;
	private String receive_email;
	private String content;
	private String date;
	
	public int getNum() {
		return num;
	}

	public String getDate() {
		return date;
	}

	public WebDTO(int num, String send_email, String receive_email, String content, String date) {
		super();
		this.num = num;
		this.send_email = send_email;
		this.receive_email = receive_email;
		this.content = content;
		this.date = date;
	}

	public String getSend_email() {
		return send_email;
	}

	public String getReceive_email() {
		return receive_email;
	}

	public String getContent() {
		return content;
	}

	public WebDTO(String email, String pw, String tel, String address) {
		super();
		this.email = email;
		this.pw = pw;
		this.tel = tel;
		this.address = address;
	}
	
	public WebDTO(String email, String tel, String address) {
		super();
		this.email = email;
		this.tel = tel;
		this.address = address;
	}
	

	

	public WebDTO(String email, String pw) {
		super();
		this.email = email;
		this.pw = pw;
	}


	public String getEmail() {
		return email;
	}

	public String getPw() {
		return pw;
	}

	public String getTel() {
		return tel;
	}

	public String getAddress() {
		return address;
	}
	
}
