package edu.ssafy.chap01;

import java.util.Scanner;

public class GameTest02 {
	public static void main(String[] args) {

		System.out.println(">> ���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ������.");
		System.out.println("1. 5�� 3��");
		System.out.println("2. 3�� 2��");
		System.out.println("3. 1�� 1��");
		System.out.print("��ȣ�� �Է��ϼ���. ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		// ��ǻ�Ϳ� ������� �¼��� ���
		int com = 0, user = 0;
		switch (input) {
		case 1:
			for (int i = 0; i < 5; i++) {
				if (com >= 3 || user >= 3)
					break;

				System.out.print("���������� �� �ϳ� �Է�:");
				String usr_string = sc.next();
				int user_num = 0;	// ����ڰ� �� �� �Ǵ�
				switch (usr_string) {
				case "����":
					user_num = 1;
					break;
				case "�ָ�":
					user_num = 2;
					break;
				case "��":
					user_num = 3;
					break;
				}
				int com_num = (int) (Math.random() * 3) + 1;
								
				// ���������� üũ
				switch(user_num) {
				case 1:	// ��� ����
					switch(com_num)
					{
					case 1: System.out.println("���º�!!!");
					break;
					case 2: System.out.println("�����ϴ�!!!");
					com++;
					break;
					case 3: System.out.println("�̰���ϴ�!!!");
					user++;
					break;
					}
					break;
				case 2:	// ��� ����
					switch(com_num)
					{
					case 1: System.out.println("�����ϴ�!!!");
					com++;
					break;
					case 2: System.out.println("���º�!!!");
					break;
					case 3: System.out.println("�̰���ϴ�!!!");
					user++;
					break;
					}
					break;
				case 3:	// ��� ��
					switch(com_num)
					{
					case 1: System.out.println("�����ϴ�!!!");
					com++;
					break;
					case 2: System.out.println("�̰���ϴ�!!!");
					user++;
					break;
					case 3: System.out.println("���º�!!!");
					break;
					}
					break;
				}
			}

			break;
		case 2:
			for (int i = 0; i < 3; i++) {
				if (com >= 2 || user >= 2)
					break;

				System.out.print("���������� �� �ϳ� �Է�:");
				String usr_string = sc.next();
				int user_num = 0;	// ����ڰ� �� �� �Ǵ�
				switch (usr_string) {
				case "����":
					user_num = 1;
					break;
				case "�ָ�":
					user_num = 2;
					break;
				case "��":
					user_num = 3;
					break;
				}
				int com_num = (int) (Math.random() * 3) + 1;

				// ���������� üũ
				switch (user_num) {
				case 1: // ��� ����
					switch (com_num) {
					case 1:
						System.out.println("���º�!!!");
						break;
					case 2:
						System.out.println("�����ϴ�!!!");
						com++;
						break;
					case 3:
						System.out.println("�̰���ϴ�!!!");
						user++;
						break;
					}
					break;
				case 2: // ��� ����
					switch (com_num) {
					case 1:
						System.out.println("�����ϴ�!!!");
						com++;
						break;
					case 2:
						System.out.println("���º�!!!");
						break;
					case 3:
						System.out.println("�̰���ϴ�!!!");
						user++;
						break;
					}
					break;
				case 3: // ��� ��
					switch (com_num) {
					case 1:
						System.out.println("�����ϴ�!!!");
						com++;
						break;
					case 2:
						System.out.println("�̰���ϴ�!!!");
						user++;
						break;
					case 3:
						System.out.println("���º�!!!");
						break;
					}
					break;
				}
			}
			break;
		case 3:
			System.out.print("���������� �� �ϳ� �Է�:");
			String usr_string = sc.next();
			int user_num = 0; // ����ڰ� �� �� �Ǵ�
			switch (usr_string) {
			case "����":
				user_num = 1;
				break;
			case "�ָ�":
				user_num = 2;
				break;
			case "��":
				user_num = 3;
				break;
			}
			int com_num = (int) (Math.random() * 3) + 1;

			// ���������� üũ
			switch (user_num) {
			case 1: // ��� ����
				switch (com_num) {
				case 1:
					System.out.println("���º�!!!");
					break;
				case 2:
					System.out.println("�����ϴ�!!!");
					com++;
					break;
				case 3:
					System.out.println("�̰���ϴ�!!!");
					user++;
					break;
				}
				break;
			case 2: // ��� �ָ�
				switch (com_num) {
				case 1:
					System.out.println("�����ϴ�!!!");
					com++;
					break;
				case 2:
					System.out.println("���º�!!!");
					break;
				case 3:
					System.out.println("�̰���ϴ�!!!");
					user++;
					break;
				}
				break;
			case 3: // ��� ��
				switch (com_num) {
				case 1:
					System.out.println("�����ϴ�!!!");
					com++;
					break;
				case 2:
					System.out.println("�̰���ϴ�!!!");
					user++;
					break;
				case 3:
					System.out.println("���º�!!!");
					break;
				}
				break;
			}
			break;
		}

		String str = (com != user) ? ((com > user) ? "### ��ǻ�� ��!!!" : "### ����� ��!!!") : "### ���º�!!!";
		System.out.println(str);
	}
}
