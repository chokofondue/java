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
		String sql = "update student set gender = '��' where name = 'test99'";
		
		System.out.println("������ �̸��� �Է��ϼ���.");
		String name = "";
		int select_num = 0;
		int age = 0;
		String gender = "";
		
		System.out.print("�̸� : ");
		name = sc.next();
		System.out.println("������ �����͸� �����ϼ���.");
		System.out.println("1.����   2.����");
		select_num = sc.nextInt();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection(url,id,pw);
			
			if(conn != null) {
				System.out.println("���Ἲ��");
			} else {
				System.out.println("�������");
			}
			
			Statement stmt = conn.createStatement();
			int cnt = 0;
			PreparedStatement pstmt = null;
			if(select_num == 1) {
				System.out.print("������ ���� : ");
				age = sc.nextInt();
				pstmt = conn.prepareStatement("update student set age = ? where name = ?");
				pstmt.setInt(1, age);

			} else if(select_num == 2) {
				System.out.print("������ ���� : ");
				gender = sc.next();
				pstmt = conn.prepareStatement("update student set gender = ? where name = ?");
				pstmt.setString(1, gender);

			}
			pstmt.setString(2, name);
			cnt = pstmt.executeUpdate();

			if(cnt > 0 ) {
				System.out.println("���漺��");
			} else {
				System.out.println("�������");
			}
			pstmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
