package Question6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu[] = { "[1]����ó ����", "[2]����ó ���", "[3]����" };

		int selectNum = 0;

		String addr_name = "";
		String addr_phone = "";
		int addr_age = 0;

		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String id = "system";
		String pw = "1111";

		System.out.println("===== ������ ����ó ���� ���α׷� =====");

		while (true) {
			for (int i = 0; i < menu.length; i++) {
				System.out.print(menu[i]);
			}
			System.out.print(" >> ");
			selectNum = sc.nextInt();
			if (selectNum == 1) {
				System.out.println("����ó ������ �Է��ϼ���.");
				System.out.print("�̸��Է�>> ");
				addr_name = sc.next();
				System.out.print("�����Է�>> ");
				addr_age = sc.nextInt();
				System.out.print("��ȭ��ȣ�Է�>> ");
				addr_phone = sc.next();

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection(url, id, pw);

					PreparedStatement pstmt = conn.prepareStatement("insert into addrinfo values(addr_num.nextval,?,?,?)");

					pstmt.setString(1, addr_name);
					pstmt.setInt(2, addr_age);
					pstmt.setString(3, addr_phone);

					int cnt = pstmt.executeUpdate();

					pstmt.close();
					conn.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("����ó�� ����Ǿ����ϴ�.");
			} else if (selectNum == 2) {
				System.out.println("��ȣ\t�̸�\t����\t��ȭ��ȣ");

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection(url, id, pw);

					Statement stmt = conn.createStatement();
					PreparedStatement pstmt = conn.prepareStatement("select * from addrinfo order by addr_name");

					ResultSet rs = pstmt.executeQuery();

					while (rs.next()) {
						System.out.print(rs.getInt(1) + "\t");
						System.out.print(rs.getString(2) + "\t");
						System.out.print(rs.getInt(3) + "\t");
						System.out.print(rs.getString(4) + "\t");
						System.out.println();
					}

					pstmt.close();
					conn.close();

				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if(selectNum == 3 ) {
				System.out.println("����");
				break;
			} else {
				System.out.println("�ٽ� �Է��� �ּ���.");
			}
		}
	}
}
