package ex1101_IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Memo {

	public static void main(String[] args) {
		// [1]파일생성 [2]불러오기 [3]삭제

		// [1]파일생성 = 파일명 입력 -> 파일내용 입력 -> ~경로에 파일저장 완료

		// [2]불러오기 = 해당경로 파일리스트 출력 -> 인덱스로 파일 선택 해당 파일 내용 출력

		// [3]삭제하기 = 해당경로 파일리스트 출력 -> 인덱스로 파일 선택 해당 파일 삭제

		String path_01 = "C:\\test\\";

		FileWriter fw = null;
		FileReader fr = null;

		Scanner sc = new Scanner(System.in);

		String fileName = "";
		String fileMeno = "";
		int selectNum = 0;
		int fileNum = 0;

		while (true) {
			System.out.print("[1]파일생성 [2]불러오기 [3]삭제");

			selectNum = sc.nextInt();
			if (selectNum == 1) {
				try {
					System.out.print("파일명 >> ");
					fileName = sc.next();

					fw = new FileWriter(new File(path_01 + fileName + ".txt"));
					System.out.print("파일내용을 입력하세요 >> ");

					fileMeno = sc.next();
					fw.write(fileMeno);

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						fw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(path_01 + fileName + ".txt" + " 경로에 파일 저장 완료!");
			} else if (selectNum == 2) {
				File fp = new File(path_01);
				String[] fileList = fp.list(); // 현재 파일경로에 저장된 파일 이름들을 배열로 반환

				try {
					System.out.println("=====파일리스트=====");

					for (int i = 0; i < fileList.length; i++) {
						System.out.println(i + 1 + ". " + fileList[i]);

					}

					System.out.println("불러올 파일 번호를 입력해주세요>> ");
					fileNum = sc.nextInt();

					fr = new FileReader(new File(path_01 + fileList[(fileNum - 1)]));

					int input = 0;
					System.out.println("======" + fileList[(fileNum - 1)] + "======");
					System.out.println("======파일 내용======");
					while ((input = fr.read()) != -1) {
						System.out.print((char) input);
					}
					System.out.println();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						fr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(fileList[(fileNum - 1)] + " 불러오기 완료!");
			} else if (selectNum == 3) {
				File fp = new File(path_01);
				String[] fileList = fp.list(); // 현재 파일경로에 저장된 파일 이름들을 배열로 반환
				File[] files = fp.listFiles();
				
				try {
					System.out.println("=====파일리스트=====");

					for (int i = 0; i < fileList.length; i++) {
						System.out.println(i + 1 + ". " + fileList[i]);
					}
					System.out.println("삭제할 파일 번호를 입력해주세요>> ");
					fileNum = sc.nextInt();
					if(files[fileNum].delete()) {
						System.out.println("파일삭제완료");
					} else {
						System.out.println("실패");
					}
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					try {
						fr.close();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
	}
}
