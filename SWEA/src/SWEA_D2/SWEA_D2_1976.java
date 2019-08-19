//SWEA_D2_1976. 시각 덧셈
package SWEA_D2;

import java.util.Scanner;

public class SWEA_D2_1976 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int[] harr = new int[2];
			int[] marr = new int[2];
			
			int result_harr = 0;
			int result_marr = 0;
			
			for(int i = 0; i < 2; i++)
			{
				harr[i] = sc.nextInt();
				marr[i] = sc.nextInt();
			}
			
			for(int i = 0; i < 2; i++)
			{
				result_harr += harr[i];
				if(result_harr == 13)
					result_harr = 1;
				if(result_harr == 14)
					result_harr = 2;
				if(result_harr == 15)
					result_harr = 3;
				if(result_harr == 16)
					result_harr = 4;
				if(result_harr == 17)
					result_harr = 5;
				if(result_harr == 18)
					result_harr = 6;
				if(result_harr == 19)
					result_harr = 7;
				if(result_harr == 20)
					result_harr = 8;
				if(result_harr == 21)
					result_harr = 9;
				if(result_harr == 22)
					result_harr = 10;
				if(result_harr == 23)
					result_harr = 11;
			}
			
			for(int i = 0; i < 2; i++)
			{
				result_marr += marr[i];
				if(result_marr == 60)
				{
					result_harr++;
					result_marr = 0;
				}
				if(result_marr == 61)
				{
					result_harr++;
					result_marr = 1;
				}
				if(result_marr == 62)
				{
					result_harr++;
					result_marr = 2;
				}
				if(result_marr == 63)
				{
					result_harr++;
					result_marr = 3;
				}
				if(result_marr == 64)
				{
					result_harr++;
					result_marr = 4;
				}
				if(result_marr == 65)
				{
					result_harr++;
					result_marr = 5;
				}
				if(result_marr == 66)
				{
					result_harr++;
					result_marr = 6;
				}
				if(result_marr == 67)
				{
					result_harr++;
					result_marr = 7;
				}
				if(result_marr == 68)
				{
					result_harr++;
					result_marr = 0;
				}
				if(result_marr == 60)
				{
					result_harr++;
					result_marr = 8;
				}
				if(result_marr == 69)
				{
					result_harr++;
					result_marr = 9;
				}
				if(result_marr == 70)
				{
					result_harr++;
					result_marr = 10;
				}
				if(result_marr == 71)
				{
					result_harr++;
					result_marr = 11;
				}
				if(result_marr == 72)
				{
					result_harr++;
					result_marr = 12;
				}
				if(result_marr == 73)
				{
					result_harr++;
					result_marr = 13;
				}
				if(result_marr == 74)
				{
					result_harr++;
					result_marr = 14;
				}
				if(result_marr == 75)
				{
					result_harr++;
					result_marr = 15;
				}
				if(result_marr == 76)
				{
					result_harr++;
					result_marr = 16;
				}
				if(result_marr == 77)
				{
					result_harr++;
					result_marr = 17;
				}
				if(result_marr == 78)
				{
					result_harr++;
					result_marr = 18;
				}
				if(result_marr == 79)
				{
					result_harr++;
					result_marr = 19;
				}
				if(result_marr == 80)
				{
					result_harr++;
					result_marr = 20;
				}
				if(result_marr == 81)
				{
					result_harr++;
					result_marr = 21;
				}
				if(result_marr == 82)
				{
					result_harr++;
					result_marr = 22;
				}
				if(result_marr == 83)
				{
					result_harr++;
					result_marr = 23;
				}
				if(result_marr == 84)
				{
					result_harr++;
					result_marr = 24;
				}
				if(result_marr == 85)
				{
					result_harr++;
					result_marr = 25;
				}
				if(result_marr == 86)
				{
					result_harr++;
					result_marr = 26;
				}
				if(result_marr == 87)
				{
					result_harr++;
					result_marr = 27;
				}
				if(result_marr == 88)
				{
					result_harr++;
					result_marr = 28;
				}
				if(result_marr == 89)
				{
					result_harr++;
					result_marr = 29;
				}
				if(result_marr == 90)
				{
					result_harr++;
					result_marr = 30;
				}
				if(result_marr == 91)
				{
					result_harr++;
					result_marr = 31;
				}
				if(result_marr == 92)
				{
					result_harr++;
					result_marr = 32;
				}
				if(result_marr == 93)
				{
					result_harr++;
					result_marr = 33;
				}
				if(result_marr == 94)
				{
					result_harr++;
					result_marr = 34;
				}
				if(result_marr == 95)
				{
					result_harr++;
					result_marr = 35;
				}
				if(result_marr == 96)
				{
					result_harr++;
					result_marr = 36;
				}
				if(result_marr == 97)
				{
					result_harr++;
					result_marr = 37;
				}
				if(result_marr == 98)
				{
					result_harr++;
					result_marr = 38;
				}
				if(result_marr == 99)
				{
					result_harr++;
					result_marr = 39;
				}
				if(result_marr == 100)
				{
					result_harr++;
					result_marr = 40;
				}
				if(result_marr == 101)
				{
					result_harr++;
					result_marr = 41;
				}
				if(result_marr == 102)
				{
					result_harr++;
					result_marr = 42;
				}
				if(result_marr == 103)
				{
					result_harr++;
					result_marr = 43;
				}
				if(result_marr == 104)
				{
					result_harr++;
					result_marr = 44;
				}
				if(result_marr == 105)
				{
					result_harr++;
					result_marr = 45;
				}
				if(result_marr == 106)
				{
					result_harr++;
					result_marr = 46;
				}
				if(result_marr == 107)
				{
					result_harr++;
					result_marr = 47;
				}
				if(result_marr == 108)
				{
					result_harr++;
					result_marr = 48;
				}
				if(result_marr == 109)
				{
					result_harr++;
					result_marr = 49;
				}
				if(result_marr == 110)
				{
					result_harr++;
					result_marr = 50;
				}
				if(result_marr == 110)
				{
					result_harr++;
					result_marr = 50;
				}
				if(result_marr == 111)
				{
					result_harr++;
					result_marr = 51;
				}
				if(result_marr == 112)
				{
					result_harr++;
					result_marr = 52;
				}
				if(result_marr == 113)
				{
					result_harr++;
					result_marr = 53;
				}
				if(result_marr == 114)
				{
					result_harr++;
					result_marr = 54;
				}
				if(result_marr == 115)
				{
					result_harr++;
					result_marr = 55;
				}
				if(result_marr == 116)
				{
					result_harr++;
					result_marr = 56;
				}
				if(result_marr == 117)
				{
					result_harr++;
					result_marr = 57;
				}
				if(result_marr == 118)
				{
					result_harr++;
					result_marr = 58;
				}
			}
			
			System.out.println("#" + tc + " " + result_harr + " " + result_marr);
		}

	}

}
