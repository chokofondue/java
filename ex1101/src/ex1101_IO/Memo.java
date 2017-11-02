package ex1101_IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Memo {

	public static void main(String[] args) {
		// [1]���ϻ��� [2]�ҷ����� [3]����

		// [1]���ϻ��� = ���ϸ� �Է� -> ���ϳ��� �Է� -> ~��ο� �������� �Ϸ�

		// [2]�ҷ����� = �ش��� ���ϸ���Ʈ ��� -> �ε����� ���� ���� �ش� ���� ���� ���

		// [3]�����ϱ� = �ش��� ���ϸ���Ʈ ��� -> �ε����� ���� ���� �ش� ���� ����

		String path_01 = "C:\\test\\";

		FileWriter fw = null;
		FileReader fr = null;

		Scanner sc = new Scanner(System.in);

		String fileName = "";
		String fileMeno = "";
		int selectNum = 0;
		int fileNum = 0;

		while (true) {
			System.out.print("[1]���ϻ��� [2]�ҷ����� [3]����");

			selectNum = sc.nextInt();
			if (selectNum == 1) {
				try {
					System.out.print("���ϸ� >> ");
					fileName = sc.next();

					fw = new FileWriter(new File(path_01 + fileName + ".txt"));
					System.out.print("���ϳ����� �Է��ϼ��� >> ");

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
				System.out.println(path_01 + fileName + ".txt" + " ��ο� ���� ���� �Ϸ�!");
			} else if (selectNum == 2) {
				File fp = new File(path_01);
				String[] fileList = fp.list(); // ���� ���ϰ�ο� ����� ���� �̸����� �迭�� ��ȯ

				try {
					System.out.println("=====���ϸ���Ʈ=====");

					for (int i = 0; i < fileList.length; i++) {
						System.out.println(i + 1 + ". " + fileList[i]);

					}

					System.out.println("�ҷ��� ���� ��ȣ�� �Է����ּ���>> ");
					fileNum = sc.nextInt();

					fr = new FileReader(new File(path_01 + fileList[(fileNum - 1)]));

					int input = 0;
					System.out.println("======" + fileList[(fileNum - 1)] + "======");
					System.out.println("======���� ����======");
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
				System.out.println(fileList[(fileNum - 1)] + " �ҷ����� �Ϸ�!");
			} else if (selectNum == 3) {
				File fp = new File(path_01);
				String[] fileList = fp.list(); // ���� ���ϰ�ο� ����� ���� �̸����� �迭�� ��ȯ
				File[] files = fp.listFiles();
				
				try {
					System.out.println("=====���ϸ���Ʈ=====");

					for (int i = 0; i < fileList.length; i++) {
						System.out.println(i + 1 + ". " + fileList[i]);
					}
					System.out.println("������ ���� ��ȣ�� �Է����ּ���>> ");
					fileNum = sc.nextInt();
					if(files[fileNum].delete()) {
						System.out.println("���ϻ����Ϸ�");
					} else {
						System.out.println("����");
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
