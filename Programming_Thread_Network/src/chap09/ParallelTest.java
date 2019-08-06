package chap09;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ParallelTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("일길동", "이길동", "삼길동", "사길동",  "오길동",
				 "육길동", "칠길동", "팔길동", "구길동", "십길동", "십일길동", "십이길동", "십삼길동",
				 "십사길동", "십오길동");
		
		
		Stream<String> stream = list.stream();
		stream.forEach(ParallelTest::print);
		
		
		//여러개의 쓰레드가 확 돌려버리는것
		//fork 쓰레드??
		Stream<String> parall = list.parallelStream();
		parall.forEach(ParallelTest::print);
		
		
		List<Integer> listi = Arrays.asList(100,200,300,400,500,600,700,800,900);
		Stream<Integer> stream22 = listi.stream();
		stream22.forEach(ParallelTest::print);
		
		Stream<Integer> parallelStream = listi.stream();
		parallelStream.forEach(ParallelTest::print);
		
		
		
//		stream.forEach(name->System.out.println(name));
		parallelStream.forEach(name->System.out.println(name));
		
	}
	
	public static void print(Integer str)
	{
		System.out.println(str + " : " + Thread.currentThread());
	}
	
	public static void print(String str)
	{
		System.out.println(str + " : " + Thread.currentThread());
	}
}
