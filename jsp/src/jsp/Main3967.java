package jsp;



import java.util.Arrays;
import java.util.Scanner;

public class Main3967 {
	
	static char[][] map;
	static int[] nums;
	static boolean[] is_use;
	static boolean is_ok;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		map = new char[5][9];
		nums = new int[12];
		is_use = new boolean[13];
		//sc.nextLine();
		for(int i=0;i<5;i++)
		{
			String tmp = sc.nextLine();
			for(int j=0;j<9;j++)
			{
				map[i][j] = tmp.charAt(j);
				if(i==0 && j==4) {
					if(map[i][j] == 'x') nums[0]=0;
					else nums[0]=map[i][j]-'A'+1;
				}
				if(i==1 && j==1) {
					if(map[i][j] == 'x') nums[1]=0;
					else nums[1]=map[i][j]-'A'+1;
				}
				if(i==1 && j==3) {
					if(map[i][j] == 'x') nums[2]=0;
					else nums[2]=map[i][j]-'A'+1;
				}
				if(i==1 && j==5) {
					if(map[i][j] == 'x') nums[3]=0;
					else nums[3]=map[i][j]-'A'+1;
				}
				if(i==1 && j==7) {
					if(map[i][j] == 'x') nums[4]=0;
					else nums[4]=map[i][j]-'A'+1;
				}
				if(i==2 && j==2) {
					if(map[i][j] == 'x') nums[5]=0;
					else nums[5]=map[i][j]-'A'+1;
				}
				if(i==2 && j==6) {
					if(map[i][j] == 'x') nums[6]=0;
					else nums[6]=map[i][j]-'A'+1;
				}
				if(i==3 && j==1) {
					if(map[i][j] == 'x') nums[7]=0;
					else nums[7]=map[i][j]-'A'+1;
				}
				if(i==3 && j==3) {
					if(map[i][j] == 'x') nums[8]=0;
					else nums[8]=map[i][j]-'A'+1;
				}
				if(i==3 && j==5) {
					if(map[i][j] == 'x') nums[9]=0;
					else nums[9]=map[i][j]-'A'+1;
				}
				if(i==3 && j==7) {
					if(map[i][j] == 'x') nums[10]=0;
					else nums[10]=map[i][j]-'A'+1;
				}
				if(i==4 && j==4) {
					if(map[i][j] == 'x') nums[11]=0;
					else nums[11]=map[i][j]-'A'+1;
				}
				
			}
			
			
		}
		is_ok = true;
		setNum();
		setMap();
		/*for(int i=0;i<12;i++) System.out.print(nums[i]+" ");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<9;j++)
			{
				
				System.out.print(map[i][j]+" ");
			}System.out.println();
		}*/
		find_ans(0);
		
		//setMap();
		//System.out.println(map[0][6]);
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<9;j++)
			{
				
				System.out.print(map[i][j]);
			}System.out.println();
		}
	}
	
	static void find_ans(int now)
	{
		if(!is_26()) return;
		if(!is_ok) return;
		if( now == 12)
		{
			if(!setNum()) return;
			setMap();
			/*for(int i=0;i<5;i++)
			{
				for(int j=0;j<9;j++)
				{
					
					System.out.print(map[i][j]+" ");
				}System.out.println();
			}*/
			is_ok=false;
			return;
		}
		if(nums[now] != 0) {
			find_ans(now+1);
			return;
		}
		//setvisited();
		for(int i=1;i<13;i++)
		{
			setvisited();
			if(!is_use[i])
			{
				int tmparr[] = new int[13];
				System.arraycopy(nums, 0, tmparr, 0, 12);
				nums[now]=i;		
				if(!setNum()) {
					System.arraycopy(tmparr, 0, nums, 0, 12);
					continue;
				}
				setvisited();
				if(is_26())
				{
					find_ans(now+1);
				}
				System.arraycopy(tmparr, 0, nums, 0, 12);
				setvisited();
			}
		}
		return;
	}
	
	
	static void setvisited()
	{
		for(int i=0;i<13;i++) is_use[i]=false;
		for(int i=0;i<12;i++)
		{
			is_use[nums[i]]=true;
		}
	}
	
	static boolean is_26()
	{
		int cnt = 0, is_zero=0, tmp=0;
		if(nums[0] == 0) {cnt++; is_zero=0;}
		if(nums[2] == 0) {cnt++; is_zero=2;}
		if(nums[5] == 0) {cnt++; is_zero=5;}
		if(nums[7] == 0) {cnt++; is_zero=7;}
		if(cnt == 0)
		{
			tmp = 26 - nums[0] - nums[2] - nums[5] - nums[7];
			/*if(nums[is_zero] != 0 && nums[is_zero] != tmp) {
				is_ok = false;
				return;
			}*/
			if(tmp != 0) return false;
		}
		
		cnt = 0; is_zero=0;
		if(nums[0] == 0) {cnt++; is_zero=0;}
		if(nums[3] == 0) {cnt++; is_zero=3;}
		if(nums[6] == 0) {cnt++; is_zero=6;}
		if(nums[10] == 0) {cnt++; is_zero=10;}
		if(cnt == 0)
		{
			tmp = 26 - nums[0] - nums[3] - nums[6] - nums[10];
			/*if(nums[is_zero] != 0 && nums[is_zero] != tmp) {
				is_ok = false;
				return;
			}*/
			if(tmp != 0) return false;
		}
		
		cnt = 0; is_zero=0;
		if(nums[1] == 0) {cnt++; is_zero=1;}
		if(nums[5] == 0) {cnt++; is_zero=5;}
		if(nums[8] == 0) {cnt++; is_zero=8;}
		if(nums[11] == 0) {cnt++; is_zero=11;}
		if(cnt == 0)
		{
			tmp = 26 - nums[1] - nums[5] - nums[8] - nums[11];
			/*if(nums[is_zero] != 0 && nums[is_zero] != tmp) {
				is_ok = false;
				return;
			}*/
			if(tmp != 0) return false;
		}
		cnt = 0; is_zero=0;
		if(nums[4] == 0) {cnt++; is_zero=4;}
		if(nums[6] == 0) {cnt++; is_zero=6;}
		if(nums[9] == 0) {cnt++; is_zero=9;}
		if(nums[11] == 0) {cnt++; is_zero=11;}
		if(cnt == 0)
		{
			tmp = 26 - nums[4] - nums[6] - nums[9] - nums[11];
			/*if(nums[is_zero] != 0 && nums[is_zero] != tmp) {
				is_ok = false;
				return;
			}*/
			if(tmp != 0) return false;
		}
		cnt = 0; is_zero=0;
		for(int i=1;i<=4;i++) if(nums[i]==0) {cnt++; is_zero=i;}
		tmp = 26;
		if(cnt == 0)
		{
			for(int i=1;i<5;i++) tmp-=nums[i];
			/*if(nums[is_zero] != 0 && nums[is_zero] != tmp) {
				is_ok = false;
				return;
			}*/
			if(tmp != 0) return false;
		}
		cnt = 0; is_zero=0;
		for(int i=7;i<=10;i++) if(nums[i]==0) {cnt++; is_zero=i;}
		tmp = 26;
		if(cnt == 0)
		{
			for(int i=7;i<11;i++) tmp-=nums[i];
			/*if(nums[is_zero] != 0 && nums[is_zero] != tmp) {
				is_ok = false;
				return;
			}*/
			if(tmp != 0) return false;
		}
		
		
		return true;
	}
	
	static boolean setNum()
	{
		setvisited();
		int cnt = 0, is_zero=0, tmp=0;
		if(nums[0] == 0) {cnt++; is_zero=0;}
		if(nums[2] == 0) {cnt++; is_zero=2;}
		if(nums[5] == 0) {cnt++; is_zero=5;}
		if(nums[7] == 0) {cnt++; is_zero=7;}
		if(cnt == 1)
		{
			tmp = 26 - nums[0] - nums[2] - nums[5] - nums[7];
			/*if(nums[is_zero] != 0 && nums[is_zero] != tmp) {
				is_ok = false;
				return;
			}*/
			if(tmp > 12 || tmp < 0) return false;
			if(is_use[tmp]) return false;
			is_use[tmp] = true;
			nums[is_zero] = tmp;
		}
		
		cnt = 0; is_zero=0;
		if(nums[0] == 0) {cnt++; is_zero=0;}
		if(nums[3] == 0) {cnt++; is_zero=3;}
		if(nums[6] == 0) {cnt++; is_zero=6;}
		if(nums[10] == 0) {cnt++; is_zero=10;}
		if(cnt == 1)
		{
			tmp = 26 - nums[0] - nums[3] - nums[6] - nums[10];
			/*if(nums[is_zero] != 0 && nums[is_zero] != tmp) {
				is_ok = false;
				return;
			}*/
			if(tmp > 12 || tmp < 0 || is_use[tmp]) return false;
			if(is_use[tmp]) return false;
			is_use[tmp] = true;
			nums[is_zero] = tmp;
		}
		
		cnt = 0; is_zero=0;
		if(nums[1] == 0) {cnt++; is_zero=1;}
		if(nums[5] == 0) {cnt++; is_zero=5;}
		if(nums[8] == 0) {cnt++; is_zero=8;}
		if(nums[11] == 0) {cnt++; is_zero=11;}
		if(cnt == 1)
		{
			tmp = 26 - nums[1] - nums[5] - nums[8] - nums[11];
			/*if(nums[is_zero] != 0 && nums[is_zero] != tmp) {
				is_ok = false;
				return;
			}*/
			if(tmp > 12 || tmp < 0 || is_use[tmp]) return false;
			if(is_use[tmp]) return false;
			is_use[tmp] = true;
			nums[is_zero] = tmp;
		}
		cnt = 0; is_zero=0;
		if(nums[4] == 0) {cnt++; is_zero=4;}
		if(nums[6] == 0) {cnt++; is_zero=6;}
		if(nums[9] == 0) {cnt++; is_zero=9;}
		if(nums[11] == 0) {cnt++; is_zero=11;}
		if(cnt == 1)
		{
			tmp = 26 - nums[4] - nums[6] - nums[9] - nums[11];
			/*if(nums[is_zero] != 0 && nums[is_zero] != tmp) {
				is_ok = false;
				return;
			}*/
			if(tmp > 12 || tmp < 0 || is_use[tmp]) return false;
			if(is_use[tmp]) return false;
			is_use[tmp] = true;
			nums[is_zero] = tmp;
		}
		cnt = 0; is_zero=0;
		for(int i=1;i<=4;i++) if(nums[i]==0) {cnt++; is_zero=i;}
		tmp = 26;
		if(cnt == 1)
		{
			for(int i=1;i<5;i++) tmp-=nums[i];
			/*if(nums[is_zero] != 0 && nums[is_zero] != tmp) {
				is_ok = false;
				return;
			}*/
			if(tmp > 12 || tmp < 0 || is_use[tmp]) return false;
			if(is_use[tmp]) return false;
			is_use[tmp] = true;
			nums[is_zero] = tmp;
		}
		cnt = 0; is_zero=0;
		for(int i=7;i<=10;i++) if(nums[i]==0) {cnt++; is_zero=i;}
		tmp = 26;
		if(cnt == 1)
		{
			for(int i=7;i<11;i++) tmp-=nums[i];
			/*if(nums[is_zero] != 0 && nums[is_zero] != tmp) {
				is_ok = false;
				return;
			}*/
			if(tmp > 12 || tmp < 0 || is_use[tmp]) return false;
			if(is_use[tmp]) return false;
			is_use[tmp] = true;
			nums[is_zero] = tmp;
		}
		return true;
		
	}
	
	static void setMap()
	{
		map[0][4] = (char) (nums[0]+'A'-1);
		map[1][1] = (char) (nums[1]+'A'-1);
		map[1][3] = (char) (nums[2]+'A'-1);
		map[1][5] = (char) (nums[3]+'A'-1);
		map[1][7] = (char) (nums[4]+'A'-1);
		map[2][2] = (char) (nums[5]+'A'-1);
		map[2][6] = (char) (nums[6]+'A'-1);
		map[3][1] = (char) (nums[7]+'A'-1);
		map[3][3] = (char) (nums[8]+'A'-1);
		map[3][5] = (char) (nums[9]+'A'-1);
		map[3][7] = (char) (nums[10]+'A'-1);
		map[4][4] = (char) (nums[11]+'A'-1);
	}
	

}
