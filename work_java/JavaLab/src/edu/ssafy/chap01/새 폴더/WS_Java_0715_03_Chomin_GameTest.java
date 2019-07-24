package edu.ssafy.chap01;

import java.util.Scanner;

public class GameTest02 {
	public static void main(String[] args) {

		System.out.println(">> 가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승");
		System.out.println("2. 3판 2승");
		System.out.println("3. 1판 1승");
		System.out.print("번호를 입력하세요. ");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		// 컴퓨터와 사용자의 승수를 기록
		int com = 0, user = 0;
		switch (input) {
		case 1:
			for (int i = 0; i < 5; i++) {
				if (com >= 3 || user >= 3)
					break;

				System.out.print("가위바위보 중 하나 입력:");
				String usr_string = sc.next();
				int user_num = 0;	// 사용자가 낸 것 판단
				switch (usr_string) {
				case "가위":
					user_num = 1;
					break;
				case "주먹":
					user_num = 2;
					break;
				case "보":
					user_num = 3;
					break;
				}
				int com_num = (int) (Math.random() * 3) + 1;
								
				// 가위바위보 체크
				switch(user_num) {
				case 1:	// 사람 가위
					switch(com_num)
					{
					case 1: System.out.println("무승부!!!");
					break;
					case 2: System.out.println("졌습니다!!!");
					com++;
					break;
					case 3: System.out.println("이겼습니다!!!");
					user++;
					break;
					}
					break;
				case 2:	// 사람 바위
					switch(com_num)
					{
					case 1: System.out.println("졌습니다!!!");
					com++;
					break;
					case 2: System.out.println("무승부!!!");
					break;
					case 3: System.out.println("이겼습니다!!!");
					user++;
					break;
					}
					break;
				case 3:	// 사람 보
					switch(com_num)
					{
					case 1: System.out.println("졌습니다!!!");
					com++;
					break;
					case 2: System.out.println("이겼습니다!!!");
					user++;
					break;
					case 3: System.out.println("무승부!!!");
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

				System.out.print("가위바위보 중 하나 입력:");
				String usr_string = sc.next();
				int user_num = 0;	// 사용자가 낸 것 판단
				switch (usr_string) {
				case "가위":
					user_num = 1;
					break;
				case "주먹":
					user_num = 2;
					break;
				case "보":
					user_num = 3;
					break;
				}
				int com_num = (int) (Math.random() * 3) + 1;

				// 가위바위보 체크
				switch (user_num) {
				case 1: // 사람 가위
					switch (com_num) {
					case 1:
						System.out.println("무승부!!!");
						break;
					case 2:
						System.out.println("졌습니다!!!");
						com++;
						break;
					case 3:
						System.out.println("이겼습니다!!!");
						user++;
						break;
					}
					break;
				case 2: // 사람 바위
					switch (com_num) {
					case 1:
						System.out.println("졌습니다!!!");
						com++;
						break;
					case 2:
						System.out.println("무승부!!!");
						break;
					case 3:
						System.out.println("이겼습니다!!!");
						user++;
						break;
					}
					break;
				case 3: // 사람 보
					switch (com_num) {
					case 1:
						System.out.println("졌습니다!!!");
						com++;
						break;
					case 2:
						System.out.println("이겼습니다!!!");
						user++;
						break;
					case 3:
						System.out.println("무승부!!!");
						break;
					}
					break;
				}
			}
			break;
		case 3:
			System.out.print("가위바위보 중 하나 입력:");
			String usr_string = sc.next();
			int user_num = 0; // 사용자가 낸 것 판단
			switch (usr_string) {
			case "가위":
				user_num = 1;
				break;
			case "주먹":
				user_num = 2;
				break;
			case "보":
				user_num = 3;
				break;
			}
			int com_num = (int) (Math.random() * 3) + 1;

			// 가위바위보 체크
			switch (user_num) {
			case 1: // 사람 가위
				switch (com_num) {
				case 1:
					System.out.println("무승부!!!");
					break;
				case 2:
					System.out.println("졌습니다!!!");
					com++;
					break;
				case 3:
					System.out.println("이겼습니다!!!");
					user++;
					break;
				}
				break;
			case 2: // 사람 주먹
				switch (com_num) {
				case 1:
					System.out.println("졌습니다!!!");
					com++;
					break;
				case 2:
					System.out.println("무승부!!!");
					break;
				case 3:
					System.out.println("이겼습니다!!!");
					user++;
					break;
				}
				break;
			case 3: // 사람 보
				switch (com_num) {
				case 1:
					System.out.println("졌습니다!!!");
					com++;
					break;
				case 2:
					System.out.println("이겼습니다!!!");
					user++;
					break;
				case 3:
					System.out.println("무승부!!!");
					break;
				}
				break;
			}
			break;
		}

		String str = (com != user) ? ((com > user) ? "### 컴퓨터 승!!!" : "### 사용자 승!!!") : "### 무승부!!!";
		System.out.println(str);
	}
}
