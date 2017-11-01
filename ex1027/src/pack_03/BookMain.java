package pack_03;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] menu = {"[1]�������", "[2]�����˻�", "[3]�����뿩", "[4]�����ݳ�", "[5]����"};
		
		ArrayList<BookVO> books = new ArrayList<BookVO>();
		ArrayList<BookVO> books_Rental = new ArrayList<BookVO>();
		
		int select_num = 0;
		
		System.out.println("================ ���� ���� ���α׷� ====================");
		
		do {
			for (int i = 0; i < menu.length; i++) {
				System.out.print(menu[i]);
			}
			System.out.println();
			System.out.print("��ȣ�� �Է��� �ּ��� >> ");
			select_num = sc.nextInt();
			if(select_num == 1) {
				System.out.println("=========�������=========");
				System.out.print("�����̸� >> ");
				String book_Title = sc.next();
				
				System.out.print("�۾��� >> ");
				String book_Writer = sc.next();
				
				System.out.print("���� >> ");
				int book_Price = sc.nextInt();
				
				books.add(new BookVO(book_Title, book_Writer, book_Price));
				System.out.println(book_Title + "�� ����� �Ǿ����ϴ�.");
			} else if(select_num == 2) {
				System.out.println("=========�����˻�=========");
				System.out.println("[1]��ü��Ϻ��� [2]�̸��˻�");
				int search_Num = sc.nextInt();
				
				if(search_Num == 1) {
					System.out.println("==========�������===========");
					if(books.isEmpty()) {
						System.out.println("���� ��ϵ� ������ �����ϴ�.");
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
						System.out.println("���� ��ϵ� ������ �����ϴ�.");
					} else {
						int i = 0;
						System.out.print("�����̸��Է� >> ");
						String search_name = sc.next();
						
						for (BookVO bookVO : books) {
							++i;
							if(bookVO.getBook_Title().equals(search_name)) {
								System.out.println("=====���� �˻��Ͻ� ����=====");
								System.out.println(i + "." + bookVO.getBook_Title() 
													+ "\t" + bookVO.getBook_Writer() 
													+ "\t" + bookVO.getBook_Price());
								
							} else {
								System.out.println("�˻��Ͻ� ������ �����ϴ�.");
							}
						}
					}					
				}				
			} else if(select_num == 3) {
				System.out.println("=========�����뿩=========");
				System.out.println();
				System.out.println("==========�������===========");
				if(books.isEmpty()) {
					System.out.println("���� ��ϵ� ������ �����ϴ�.");
				} else {
					int i = 0;
					int j = 0;
					
					for (BookVO bookVO : books) {
						System.out.println(++i + "." + bookVO.getBook_Title() 
											+ "\t" + bookVO.getBook_Writer() 
											+ "\t" + bookVO.getBook_Price());
					}			
		
					System.out.print("�뿩�� �����̸� >> ");
					String book_Rental = sc.next();
										
					for (BookVO bookVO : books) {
						
						if(bookVO.getBook_Title().equals(book_Rental)) {
							books.remove(j);
							books_Rental.add(new BookVO(books.get(j).getBook_Title()
									, books.get(j).getBook_Writer()
									, books.get(j).getBook_Price()));
							System.out.println(book_Rental + "�� ������ �뿩�Ϸ�Ǿ����ϴ�.");
						
						} else if (books.size()<j){
							System.out.println("�뿩�� ������ �������� �ʽ��ϴ�.");
						}
						j++;
					}
					j = 0;
				}					
			} else if(select_num == 4) {
				System.out.println("=========�����ݳ�=========");
			} else if(select_num == 5) {
				System.out.println("���� ���� ���α׷��� �����մϴ�.");
				return;
			} else {
				System.out.println("��ȣ�� Ȯ�� �� �ٽ� �Է��� �ּ���.");
			}
		} while (select_num != 5);
	}
}
