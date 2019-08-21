package SWEA_D3;

import java.util.ArrayList;
import java.util.Scanner;

public class SWEA_D3_1240_단순2진암호코드 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
        int T=sc.nextInt();
 
        String arr_n[]=new String[10];
        arr_n[0]="0001101";
        arr_n[1]="0011001";
        arr_n[2]="0010011";
        arr_n[3]="0111101";
        arr_n[4]="0100011";
        arr_n[5]="0110001";
        arr_n[6]="0101111";
        arr_n[7]="0111011";
        arr_n[8]="0110111";
        arr_n[9]="0001011";
        for(int t=1;t<=10;t++) {
 
            int n=sc.nextInt();
            int m=sc.nextInt();
            sc.nextLine();
            String str="";
            int check_end=0;
            int check_start=0;
            int odd_sum=0;
            int even_sum=0;
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++) {
                String temp=sc.nextLine();
                for(int j=0;j<temp.length();j++) {
                    if(temp.charAt(j)-'0'==1) {
                        str=temp;
                        check_end=j+1;
                        check_start=j-55;
                    }
                }
            }
            str=str.substring(check_start, check_end);
            for(int i=0;i<56;i=i+7) {
                String temp = null;
                //              System.out.println(i);
                if(i!=49) {
                    temp=str.substring(i,i+7);
                }
                else {
                    temp=str.substring(i);
                }
                for(int j=0;j<10;j++) {
                    if(temp.equals(arr_n[j])) {
                        list.add(j);
                        break;
                    }
                }
            }
            for(int j=0;j<list.size()-1;j++) {
                if(j%2==0)  odd_sum+=list.get(j);
                else even_sum+=list.get(j);
            }
            int result=odd_sum*3+even_sum+list.get(7);
            if(result%10==0) {
                result=odd_sum+even_sum+list.get(7);
                System.out.println("#"+t+" "+result);
            }else {
                System.out.println("#"+t+" "+0);
            }
 
 
        }
 
 
    }
 
 
}