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

		// oracle driver 로드
		// 2. 데이터베이스 연결

		String menu[] = { "[1]도서 전체검색", "[2]도서검색", "[3]도서입고", "[4]가격수정", "[5]도서삭제", "[6]종료" };
		String bookInMenu[] = { "코드>> ", "제목>> ", "가격>> ", "저자>> ", "출판사>> " };
		Scanner sc = new Scanner(System.in);

		System.out.println("====================== 도서 관리 시스템 =======================");
		try {
		// for + if
		while (true) {

			for (int j = 0; j < menu.length; j++) {
				System.out.print(menu[j]);
			}
			System.out.print(" >> ");

			select_num = sc.nextInt();
			if (select_num == 1) {
				System.out.println("====================== 도서 목록 =======================");
				System.out.println("번호\t코드\t도서이름\t\t\t저자\t\t출판사\t\t가격\t\t입고날짜");
				System.out.println(bookcontroller.bookSelectAll());
			} else if (select_num == 2) {

				System.out.println("선택할 도서의 코드를 입력해주세요.");
				System.out.print("코드입력>> ");
				bookCode = sc.next();
				System.out.println("====================== 도서 목록 =======================");
				System.out.println("번호\t코드\t도서이름\t\t\t저자\t\t출판사\t\t가격\t\t입고날짜");
				
				BookVO book = bookcontroller.bookSelect(bookCode);
				System.out.println(book.getBookName());
				
			
			} else if (select_num == 3) {

				System.out.println("도서정보를 입력해주세요.");

				System.out.print("코드>> ");
				bookCode = sc.next();
				System.out.print("제목>> ");
				bookName = sc.next();
				System.out.print("저자>> ");
				bookAuthor = sc.next();
				System.out.print("출판사>> ");
				bookPublisher = sc.next();
				System.out.print("가격>> ");
				bookPrice = sc.nextInt();
				
				int cnt = bookcontroller.bookInsert(new BookVO(bookCode, bookName, bookAuthor, bookPublisher, bookPrice));
				
				if (cnt > 0) {
					System.out.println("입력성공");
				} else {
					System.out.println("입력실패");
				}

			} else if (select_num == 4) {

				System.out.println("가격을 수정할 도서의 코드를 입력하세요.");
				System.out.print("코드>> ");
				bookCode = sc.next();
				System.out.print("변경할 가격>> ");
				bookPrice = sc.nextInt();

				bookcontroller.bookUpdate(bookPrice, bookCode);

			} else if (select_num == 5) {

				System.out.println("삭제할 도서코드를 입력해주세요.");
				System.out.print("코드>> ");
				bookCode = sc.next();

				bookcontroller.bookDelete(bookCode);

			} else if (select_num == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("입력번호가 틀렸습니다.");
			}
		}
		}catch (Exception e) {
			System.out.println("오류발생: "+e.getMessage());
		}
	}
}
