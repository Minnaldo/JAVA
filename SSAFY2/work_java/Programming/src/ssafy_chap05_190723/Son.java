package ssafy_chap05_190723;

public class Son extends Father{

	/* Father 클래스인 부모 클래스의 생성자가 기본 생성자 없이
	 * super클래스부터 생성되기 때문에    Father(String name) 만 있으므로,
	 * 1. super("홍길동"); 을 해주거나
	 * 2. Father 클래스 (부모클래스) 에서 기본생성자를 만들어준다.  
	 */
	
	int money;
	public Son(String name, int money) {
		super(name);		//super("홍길동");
		this.money = money;
		
	}

}