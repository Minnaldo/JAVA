package chap07_190730;

import java.io.File;

public class FileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(args[0]);
		if(args.length != 1)
		{
			System.out.println("using : java FileInfo input filename plz");
			System.exit(0);
		}
//		System.out.println(args[0]);
		File f = new File(args[0]);
		int 
		if(f.exists())
		{
			System.out.println("파일이름 : " + f.getName());
			System.out.println("파일경로 : " + f.getPath());
			System.out.println("현재경로 : " + f.getAbsolutePath());
			System.out.println("쓰기여부 : " + f.canWrite());
			System.out.println("읽기여부 : " + f.canRead());
			System.out.println("파일길이 : " + f.length());
		}
		else
		{
			System.out.println(args[0] + " 파일은 논존재하지 않는다.");
		}
	}

}
