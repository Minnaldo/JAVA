import java.util.Scanner;

public class 경비원_성용오류 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int S = sc.nextInt();
        int distance = 0;
        int [][] Sloc = new int [S][2];
        int [][] Hloc = new int [1][2];
        
        int [][] map = new int [M+1][N+1];
        for (int i = 0; i < S+1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(i!=S) {
                Sloc[i][0]=a;
                Sloc[i][1]=b;
                if(a==1) {
                    map[0][b]=1;
                }else if(a==2) {
                    map[M][b]=1;
                }else if(a==3) {
                    map[b][0]=1;
                }else if(a==4) {
                    map[b][N]=1;
                }
            }
            
            if(i==S) {
                Hloc[0][0]=a;
                Hloc[0][1]=b;
                if(a==1) {
                    map[0][b]=2;
                }else if(a==2) {
                    map[M][b]=2;
                }else if(a==3) {
                    map[b][0]=2;
                }else if(a==4) {
                    map[b][N]=2;
                }
            }
        }
        
        
        if(Hloc[0][0]==1) {
            for (int i = 0; i < S; i++) {
                if(Sloc[i][0]==1) {
                    distance+=Math.abs(Hloc[0][1]-Sloc[i][1]);
                }else if(Sloc[i][0]==2) {
                    int tmp = Hloc[0][1]+Sloc[0][1];
                    int tmp2 = (N-Hloc[0][1])+(N-Sloc[i][1]);
                    if(tmp>tmp2) {
                        distance+=tmp2+M;
                    }else
                        distance+=tmp+M;
                            
                }else if(Sloc[i][0]==3) {
                    distance+=Hloc[0][1]+Sloc[i][1];
                }else if(Sloc[i][0]==4) {
                    distance+=(N-Hloc[0][1])+Sloc[i][1];
                }
            }
        }else if(Hloc[0][0]==2) {
            for (int i = 0; i < S; i++) {
                if(Sloc[i][0]==1) {
                    int tmp = Hloc[0][1]+Sloc[0][1];
                    int tmp2 = (N-Hloc[0][1])+(N-Sloc[i][1]);
                    if(tmp>tmp2) {
                        distance+=tmp2+M;
                    }else
                        distance+=tmp+M;
                }else if(Sloc[i][0]==2) {
                    distance+=Math.abs(Hloc[0][1]-Sloc[i][1]);
                    
                }else if(Sloc[i][0]==3) {
                    distance+=Hloc[0][1]+(M-Sloc[i][1]);
                }else if(Sloc[i][0]==4) {
                    distance+=(N-Hloc[0][1])+(M-Sloc[i][1]);
                }
            }
            
            
        }else if(Hloc[0][0]==3) {
            for (int i = 0; i < S; i++) {
                if(Sloc[i][0]==1) {
                    distance+=Hloc[0][1]+Sloc[i][1];
                }else if(Sloc[i][0]==2) {
                    distance+=Sloc[i][1]+(M-Hloc[0][1]);
                    
                }else if(Sloc[i][0]==3) {
                    distance+=Math.abs(Hloc[0][1]-Sloc[i][1]);
                    
                }else if(Sloc[i][0]==4) {
                    int tmp = Hloc[0][1]+Sloc[0][1];
                    int tmp2 = (M-Hloc[0][1])+(M-Sloc[i][1]);
                    if(tmp>tmp2) {
                        distance+=tmp2+N;
                    }
                }
            }
        }
            
            
        else if(Hloc[0][0]==4) {
            for (int i = 0; i < S; i++) {
                if(Sloc[i][0]==1) {
                    distance+=(N-Sloc[i][1])+Hloc[0][1];
                }else if(Sloc[i][0]==2) {
                    distance+=(N-Sloc[i][1])+(M-Hloc[0][1]);
                    
                }else if(Sloc[i][0]==3) {
                    int tmp = Hloc[0][1]+Sloc[0][1];
                    int tmp2 = (M-Hloc[0][1])+(M-Sloc[i][1]);
                    if(tmp>tmp2) {
                        distance+=tmp2+N;
                    
                }else if(Sloc[i][0]==4) {
                    distance+=Math.abs(Hloc[0][1]-Sloc[i][1]);
                    }
            
                }
            }
        }
        
        System.out.println(distance);
        
        
    }
}