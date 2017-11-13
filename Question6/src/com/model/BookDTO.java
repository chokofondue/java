package com.model;

public class BookDTO {
	private int num;
	private String title;
	private String author;
	private String publisher;
	private int possible;
	
	public BookDTO(int num, String title, String author, String publisher, int possible) {
		super();
		this.num = num;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.possible = possible;
	}

	public int getNum() {
		return num;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getPublisher() {
		return publisher;
	}

	public int getPossible() {
		return possible;
	}
}
