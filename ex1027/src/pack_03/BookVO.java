package pack_03;

public class BookVO {
	private String book_Title;
	private String book_Writer;
	private int book_Price;
	
	public BookVO() {
		
	}
	
	public BookVO(String book_Title, String book_Writer, int book_Price) {
		super();
		this.book_Title = book_Title;
		this.book_Writer = book_Writer;
		this.book_Price = book_Price;
	}

	public String getBook_Title() {
		return book_Title;
	}

	public void setBook_Title(String book_Title) {
		this.book_Title = book_Title;
	}

	public String getBook_Writer() {
		return book_Writer;
	}

	public void setBook_Writer(String book_Writer) {
		this.book_Writer = book_Writer;
	}

	public int getBook_Price() {
		return book_Price;
	}

	public void setBook_Price(int book_Price) {
		this.book_Price = book_Price;
	}	
}
