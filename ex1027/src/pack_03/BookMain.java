package pack_03;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] menu = {"[1]도서등록", "[2]도서검색", "[3]도서대여", "[4]도서반납", "[5]종료"};
		
		ArrayList<BookVO> books = new ArrayList<BookVO>();
		ArrayList<BookVO> books_Rental = new ArrayList<BookVO>();
		
		int select_num = 0;
		
		System.out.println("================ 도서 관리 프로그램 ====================");
		
		do {
			for (int i = 0; i < menu.length; i++) {
				System.out.print(menu[i]);
			}
			System.out.println();
			System.out.print("번호를 입력해 주세요 >> ");
			select_num = sc.nextInt();
			if(select_num == 1) {
				System.out.println("=========도서등록=========");
				System.out.print("도서이름 >> ");
				String book_Title = sc.next();
				
				System.out.print("글쓴이 >> ");
				String book_Writer = sc.next();
				
				System.out.print("가격 >> ");
				int book_Price = sc.nextInt();
				
				books.add(new BookVO(book_Title, book_Writer, book_Price));
				System.out.println(book_Title + "가 등록이 되었습니다.");
			} else if(select_num == 2) {
				System.out.println("=========도서검색=========");
				System.out.println("[1]전체목록보기 [2]이름검색");
				int search_Num = sc.nextInt();
				
				if(search_Num == 1) {
					System.out.println("==========도서목록===========");
					if(books.isEmpty()) {
						System.out.println("현재 등록된 도서가 없습니다.");
					} else {
						int i = 0;
						for (BookVO bookVO : books) {
							System.out.println(++i + "." + bookVO.getBook_Title() 
												+ "\t" + bookVO.getBook_Writer() 
												+ "\t" + bookVO.getBook_Price());
						}
					}					
				} else if(search_Num == 2) {
					if(books.isEmpty()) {
						System.out.println("현재 등록된 도서가 없습니다.");
					} else {
						int i = 0;
						System.out.print("도서이름입력 >> ");
						String search_name = sc.next();
						
						for (BookVO bookVO : books) {
							++i;
							if(bookVO.getBook_Title().equals(search_name)) {
								System.out.println("=====현재 검색하신 도서=====");
								System.out.println(i + "." + bookVO.getBook_Title() 
													+ "\t" + bookVO.getBook_Writer() 
													+ "\t" + bookVO.getBook_Price());
								
							} else {
								System.out.println("검색하신 도서가 없습니다.");
							}
						}
					}					
				}				
			} else if(select_num == 3) {
				System.out.println("=========도서대여=========");
				System.out.println();
				System.out.println("==========도서목록===========");
				if(books.isEmpty()) {
					System.out.println("현재 등록된 도서가 없습니다.");
				} else {
					int i = 0;
					int j = 0;
					
					for (BookVO bookVO : books) {
						System.out.println(++i + "." + bookVO.getBook_Title() 
											+ "\t" + bookVO.getBook_Writer() 
											+ "\t" + bookVO.getBook_Price());
					}			
		
					System.out.print("대여할 도서이름 >> ");
					String book_Rental = sc.next();
										
					for (BookVO bookVO : books) {
						
						if(bookVO.getBook_Title().equals(book_Rental)) {
							books.remove(j);
							books_Rental.add(new BookVO(books.get(j).getBook_Title()
									, books.get(j).getBook_Writer()
									, books.get(j).getBook_Price()));
							System.out.println(book_Rental + "의 도서가 대여완료되었습니다.");
						
						} else if (books.size()<j){
							System.out.println("대여할 도서가 존재하지 않습니다.");
						}
						j++;
					}
					j = 0;
				}					
			} else if(select_num == 4) {
				System.out.println("=========도서반납=========");
			} else if(select_num == 5) {
				System.out.println("도서 관리 프로그램을 종료합니다.");
				return;
			} else {
				System.out.println("번호를 확인 후 다시 입력해 주세요.");
			}
		} while (select_num != 5);
	}
}
