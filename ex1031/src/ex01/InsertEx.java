package ex01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertEx {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		
		
		//1. JDBC �ε�
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "system";
		String pw = "1111";
		String sql = "insert into student values('test99', 123, '����', 142)";
		
		String name = "";
		int age = 0;
		String gender = "";
		int stu_num = 0;
		
		System.out.println("�л��� ������ �Է��ϼ���.");
		System.out.print("�̸� : ");
		name = sc.next();
		System.out.print("���� : ");
		age = sc.nextInt();
		System.out.print("���� : ");
		gender = sc.next();
		System.out.print("��ȣ : ");
		stu_num = sc.nextInt();
		
		try {			
			//oracle driver �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. �����ͺ��̽� ����
			Connection conn = DriverManager.getConnection(url,id,pw);
			
			if(conn != null) {
				System.out.println("���Ἲ��");
			} else {
				System.out.println("�������");
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
				System.out.println("���强��");
			} else {
				System.out.println("�������");
			}
			
			pstmt.close();
			conn.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//3. SQL�� ����
		
		//4.Statement, Connection ��������1

	}

}
