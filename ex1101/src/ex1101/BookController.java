package ex1101;

import java.util.ArrayList;

public class BookController {
	BookDAO bookdao = new BookDAO();
	ArrayList<BookVO> list = null;
	int cnt = 0;
	
	public ArrayList<BookVO> bookSelectAll() throws Exception {
		return bookdao.selectAll();
	}

	public int bookInsert(BookVO bookvo) throws Exception {
		return bookdao.insert(bookvo);
	}
	
	public int bookUpdate(int bookPrice, String bookCode) throws Exception {

		return bookdao.update(bookPrice, bookCode);
	}
	public int bookDelete(String bookCode) throws Exception {

		return bookdao.delete(bookCode);
	}
	public BookVO bookSelect(String bookCode) throws Exception{

		return bookdao.select(bookCode);
	}
}
