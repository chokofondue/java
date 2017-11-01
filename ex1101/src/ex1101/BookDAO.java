package ex1101;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BookDAO {
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	String id = "system";
	String pw = "1111";

	PreparedStatement pstmt;
	ResultSet rs;
	StringBuilder sb = new StringBuilder();
	BookVO book;
	
	private Connection getconn() throws Exception {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(url, id, pw);
		
		if (conn != null) {
			System.out.println("연결성공");
		} else {
			System.out.println("연결실패");
		}
		return conn;
	}

	public int delete(String bookCode) throws Exception {

		Connection conn;

		conn = getconn();
		pstmt = conn.prepareStatement("delete from bookinfo where bookCode = ? ");
		pstmt.setString(1, bookCode);

		int cnt = pstmt.executeUpdate();
		if (cnt > 0) {
			System.out.println("삭제가 완료되었습니다.");
		} else {
			System.out.println("삭제가 실패되었습니다.");
		}
		pstmt.close();
		conn.close();

		return cnt;

	}

	public ArrayList<BookVO> selectAll() throws Exception {

		ArrayList<BookVO> list = new ArrayList<BookVO>();

		Connection conn;

		conn = getconn();
		pstmt = conn.prepareStatement("select * from bookinfo order by bookNum");
		rs = pstmt.executeQuery();

		while (rs.next()) {
			list.add(new BookVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getInt(6), rs.getString(7)));
		}
		pstmt.close();
		conn.close();

		return list;
	}

	public int insert(BookVO bookvo) throws Exception {

		Connection conn;

		conn = getconn();
		
		pstmt = conn.prepareStatement("insert into bookinfo values(bookNum.nextval,?,?,?,?,?,sysdate)");
		pstmt.setString(1, bookvo.getBookCode());
		pstmt.setString(2, bookvo.getBookName());
		pstmt.setString(3, bookvo.getBookAuthor());
		pstmt.setString(4, bookvo.getBookPublisher());
		pstmt.setInt(5, bookvo.getBookPrice());

		int cnt = pstmt.executeUpdate();

		pstmt.close();
		conn.close();

		return cnt;
	}

	public int update(int bookPrice, String bookCode) throws Exception {

		Connection conn;

		conn = getconn();

		pstmt = conn.prepareStatement("update bookinfo set bookPrice = ? where bookCode = ?");

		pstmt.setInt(1, bookPrice);
		pstmt.setString(2, bookCode);

		int cnt = pstmt.executeUpdate();

		if (cnt > 0) {
			System.out.println("변경성공");
		} else {
			System.out.println("변경실패");
		}
		pstmt.close();
		conn.close();

		return cnt;

	}

	public BookVO select(String bookCode) throws Exception {

		Connection conn = getconn();

		pstmt = conn.prepareStatement("select * from bookinfo where bookCode = ?");
		pstmt.setString(1, bookCode);
		rs = pstmt.executeQuery();

		if (rs.next()) {
			book = new BookVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6), rs.getString(7));
/*			sb.append(rs.getInt(1));
			sb.append(rs.getString(2));
			sb.append(rs.getString(3));
			sb.append(rs.getString(4));
			sb.append(rs.getString(5));
			sb.append(rs.getInt(6));
			sb.append(rs.getString(7));		*/	
		}
		
		pstmt.close();
		conn.close();
		return book;

	}
}
