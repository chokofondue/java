package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class update {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "system";
		String pw = "1111";
		String sql = "update student set gender = '남' where name = 'test99'";
		
		System.out.println("수정할 이름을 입력하세요.");
		String name = "";
		int select_num = 0;
		int age = 0;
		String gender = "";
		
		System.out.print("이름 : ");
		name = sc.next();
		System.out.println("수정할 데이터를 선택하세요.");
		System.out.println("1.나이   2.성별");
		select_num = sc.nextInt();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,id,pw);
			
			if(conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}
			
			Statement stmt = conn.createStatement();
			int cnt = 0;
			PreparedStatement pstmt = null;
			if(select_num == 1) {
				System.out.print("수정될 나이 : ");
				age = sc.nextInt();
				pstmt = conn.prepareStatement("update student set age = ? where name = ?");
				pstmt.setInt(1, age);

			} else if(select_num == 2) {
				System.out.print("수정될 성별 : ");
				gender = sc.next();
				pstmt = conn.prepareStatement("update student set gender = ? where name = ?");
				pstmt.setString(1, gender);

			}
			pstmt.setString(2, name);
			cnt = pstmt.executeUpdate();

			if(cnt > 0 ) {
				System.out.println("변경성공");
			} else {
				System.out.println("변경실패");
			}
			pstmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
