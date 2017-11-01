package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertEx {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		
		
		//1. JDBC 로드
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "system";
		String pw = "1111";
		String sql = "insert into student values('test99', 123, '여자', 142)";
		
		String name = "";
		int age = 0;
		String gender = "";
		int stu_num = 0;
		
		System.out.println("학생의 정보를 입력하세요.");
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("성별 : ");
		gender = sc.next();
		System.out.print("번호 : ");
		stu_num = sc.nextInt();
		
		try {			
			//oracle driver 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. 데이터베이스 연결
			Connection conn = DriverManager.getConnection(url,id,pw);
			
			if(conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}
			
			Statement stmt = conn.createStatement();
			PreparedStatement pstmt = conn.prepareStatement("insert into student values(?,?,?,?)");
			//int cnt= stmt.executeUpdate("insert into student " + "values('" + name +"',"+ age + ",'" + gender + "'," + stu_num + ")");
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setString(3, gender);
			pstmt.setInt(4, stu_num);
			
			int cnt = pstmt.executeUpdate();
			if(cnt > 0 ) {
				System.out.println("저장성공");
			} else {
				System.out.println("저장실패");
			}
			
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//3. SQL문 실행
		
		//4.Statement, Connection 연결해제1

	}

}
