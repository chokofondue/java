package ex1101;

public class BookVO {
	private int bookNum;
	private String bookCode;
	private String bookName;
	private String bookAuthor;
	private String bookPublisher;
	private int bookPrice;
	private String bookDate;
	
	//������
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
	//get �޼ҵ�
	public int getBookPrice() {
		return bookPrice;
	}
	
	//set �޼ҵ�
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	//get �޼ҵ�
	public int getBookNum() {
		return bookNum;
	}
	//get �޼ҵ�
	public String getBookCode() {
		return bookCode;
	}
	//get �޼ҵ�
	public String getBookName() {
		return bookName;
	}
	//get �޼ҵ�
	public String getBookAuthor() {
		return bookAuthor;
	}
	//get �޼ҵ�
	public String getBookPublisher() {
		return bookPublisher;
	}
	//get �޼ҵ�
	public String getBookDate() {
		return bookDate;
	}	
}
