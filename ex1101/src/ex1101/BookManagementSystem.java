package ex1101;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManagementSystem {

	public static void main(String[] args) throws Exception {

		int select_num = 0;

		String bookCode = "";
		String bookName = "";
		String bookAuthor = "";
		String bookPublisher = "";
		int bookPrice = 0;

		BookDAO bookdao = new BookDAO();
		BookController bookcontroller = new BookController();
		StringBuilder sb = new StringBuilder();

		// oracle driver �ε�
		// 2. �����ͺ��̽� ����

		String menu[] = { "[1]���� ��ü�˻�", "[2]�����˻�", "[3]�����԰�", "[4]���ݼ���", "[5]��������", "[6]����" };
		String bookInMenu[] = { "�ڵ�>> ", "����>> ", "����>> ", "����>> ", "���ǻ�>> " };
		Scanner sc = new Scanner(System.in);

		System.out.println("====================== ���� ���� �ý��� =======================");
		try {
		// for + if
		while (true) {

			for (int j = 0; j < menu.length; j++) {
				System.out.print(menu[j]);
			}
			System.out.print(" >> ");

			select_num = sc.nextInt();
			if (select_num == 1) {
				System.out.println("====================== ���� ��� =======================");
				System.out.println("��ȣ\t�ڵ�\t�����̸�\t\t\t����\t\t���ǻ�\t\t����\t\t�԰�¥");
				System.out.println(bookcontroller.bookSelectAll());
			} else if (select_num == 2) {

				System.out.println("������ ������ �ڵ带 �Է����ּ���.");
				System.out.print("�ڵ��Է�>> ");
				bookCode = sc.next();
				System.out.println("====================== ���� ��� =======================");
				System.out.println("��ȣ\t�ڵ�\t�����̸�\t\t\t����\t\t���ǻ�\t\t����\t\t�԰�¥");
				
				BookVO book = bookcontroller.bookSelect(bookCode);
				System.out.println(book.getBookName());
				
			
			} else if (select_num == 3) {

				System.out.println("���������� �Է����ּ���.");

				System.out.print("�ڵ�>> ");
				bookCode = sc.next();
				System.out.print("����>> ");
				bookName = sc.next();
				System.out.print("����>> ");
				bookAuthor = sc.next();
				System.out.print("���ǻ�>> ");
				bookPublisher = sc.next();
				System.out.print("����>> ");
				bookPrice = sc.nextInt();
				
				int cnt = bookcontroller.bookInsert(new BookVO(bookCode, bookName, bookAuthor, bookPublisher, bookPrice));
				
				if (cnt > 0) {
					System.out.println("�Է¼���");
				} else {
					System.out.println("�Է½���");
				}

			} else if (select_num == 4) {

				System.out.println("������ ������ ������ �ڵ带 �Է��ϼ���.");
				System.out.print("�ڵ�>> ");
				bookCode = sc.next();
				System.out.print("������ ����>> ");
				bookPrice = sc.nextInt();

				bookcontroller.bookUpdate(bookPrice, bookCode);

			} else if (select_num == 5) {

				System.out.println("������ �����ڵ带 �Է����ּ���.");
				System.out.print("�ڵ�>> ");
				bookCode = sc.next();

				bookcontroller.bookDelete(bookCode);

			} else if (select_num == 6) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			} else {
				System.out.println("�Է¹�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		}
		}catch (Exception e) {
			System.out.println("�����߻�: "+e.getMessage());
		}
	}
}
