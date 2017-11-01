package ex1101;

public class BookVO {
	private int bookNum;
	private String bookCode;
	private String bookName;
	private String bookAuthor;
	private String bookPublisher;
	private int bookPrice;
	private String bookDate;
	
	//생성자
	public BookVO(int bookNum, String bookCode, String bookName, String bookAuthor, String bookPublisher,
			int bookPrice, String bookDate) {
		super();
		this.bookNum = bookNum;
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
		this.bookPrice = bookPrice;
		this.bookDate = bookDate;
	}
	public BookVO(String bookCode, String bookName, String bookAuthor, String bookPublisher,
			int bookPrice) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPublisher = bookPublisher;
		this.bookPrice = bookPrice;
	}
	//get 메소드
	public int getBookPrice() {
		return bookPrice;
	}
	
	//set 메소드
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	//get 메소드
	public int getBookNum() {
		return bookNum;
	}
	//get 메소드
	public String getBookCode() {
		return bookCode;
	}
	//get 메소드
	public String getBookName() {
		return bookName;
	}
	//get 메소드
	public String getBookAuthor() {
		return bookAuthor;
	}
	//get 메소드
	public String getBookPublisher() {
		return bookPublisher;
	}
	//get 메소드
	public String getBookDate() {
		return bookDate;
	}	
}
