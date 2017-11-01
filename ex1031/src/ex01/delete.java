package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class delete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "system";
		String pw = "1111";
		String sql = "delete from student where name = 'test99'";		
		
		String name = "";
		System.out.println("삭제할 이름을 입력하세요.");
		name = sc.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,id,pw);
			
			if(conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}
			
			Statement stmt = conn.createStatement();
			PreparedStatement pstmt = conn.prepareStatement("delete from student where name = ? ");
			pstmt.setString(1, name);
			
			int cnt = pstmt.executeUpdate();
			
			if(cnt > 0) {
				System.out.println("삭제성공");
			} else {
				System.out.println("삭제실패");
			}
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
