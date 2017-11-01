package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StidemtSelect {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "system";
		String pw = "1111";

	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,id,pw);
			
			if(conn != null) {
				System.out.println("연결성공");
			} else {
				System.out.println("연결실패");
			}
			
			Statement stmt = conn.createStatement();
			PreparedStatement pstmt = conn.prepareStatement("select * from student_score");
			
			ResultSet rs = pstmt.executeQuery();
			System.out.println("번호\t이름\t학번\t\t학과\tjava\tiot\tandroid\tdb\t총점\t평균\t날짜");
			
			StringBuilder sb = new StringBuilder();
			while(rs.next()) {
				sb.append(rs.getInt(1) + "\t");
				sb.append(rs.getString(2)+ "\t");
				sb.append(rs.getString(3)+ "\t");
				sb.append(rs.getString(4)+ "\t");
				sb.append(rs.getInt(5)+ "\t");
				sb.append(rs.getInt(6)+ "\t");
				sb.append(rs.getInt(7)+ "\t");
				sb.append(rs.getInt(8)+ "\t");
				sb.append(rs.getInt(9)+ "\t");
				sb.append(rs.getInt(10)+ "\t");
				sb.append(rs.getString(11)+ "\t\n");
				
				
				
				/*System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2)+ "\t");
				System.out.print(rs.getString(3)+ "\t");
				System.out.print(rs.getString(4)+ "\t");
				System.out.print(rs.getInt(5)+ "\t");
				System.out.print(rs.getInt(6)+ "\t");
				System.out.print(rs.getInt(7)+ "\t");
				System.out.print(rs.getInt(8)+ "\t");
				System.out.print(rs.getInt(9)+ "\t");
				System.out.print(rs.getInt(10)+ "\t");
				System.out.print(rs.getString(11)+ "\t");
				System.out.println();*/
			}
			
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
