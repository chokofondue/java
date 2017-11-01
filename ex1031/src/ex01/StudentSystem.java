package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class StudentSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "system";
		String pw = "1111";
		
		String name = "";
		String stu_number = "";
		String stu_majar = "";
		int java_score = 0;
		int iot_score = 0;
		int android_score = 0;
		int db_score = 0;
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,id,pw);

			if(conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}	
			
			System.out.println("------학점 관리 프로그램--------");
			System.out.print("이름 : ");
			name = sc.next();
			System.out.print("학번 : ");
			stu_number = sc.next();
			System.out.print("학과 : ");
			stu_majar = sc.next();
			System.out.print("Java 점수 : ");
			java_score = sc.nextInt();
			System.out.print("IoT 점수 : "); 
			iot_score = sc.nextInt();
			System.out.print("Android 점수 : ");
			android_score = sc.nextInt();
			System.out.print("DB 점수 : ");
			db_score = sc.nextInt();
			int all_score = java_score + iot_score + android_score + db_score;
			int avg_score = all_score/4;
			
			Statement stmt = conn.createStatement();
			PreparedStatement pstmt = null;
			
			pstmt = conn.prepareStatement("insert into student_score values(num.nextval,?,?,?,?,?,?,?,?,?,sysdate)");
			pstmt.setString(1, name);
			pstmt.setString(2, stu_number);
			pstmt.setString(3, stu_majar);
			pstmt.setInt(4, java_score);
			pstmt.setInt(5, iot_score);
			pstmt.setInt(6, android_score);
			pstmt.setInt(7, db_score);
			pstmt.setInt(8, all_score);
			pstmt.setInt(9, avg_score);
			
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
	}

}
