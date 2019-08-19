package chap07_190730;

public class Generic <I>{
	I i;
	public void setI(I i) {
		this.i = i;
	}
	public I getI() {
		return i;
	}
}

/** Generic은 클래스를 만들 때, 지정하는것이 아니라
 *  클래스를 사용할 때, 타입을 결정하는 방식이다.
 * @author student
 *
 */
class Sub extends Generic<String>{
	@Override
	public void setI(String i) {
		// TODO Auto-generated method stub
		super.setI(i);
	}
	
	@Override
	public String getI() {
		// TODO Auto-generated method stub
		return super.getI();
	}
	
	
	
	
//	@Override
//	/**getI의 리턴타입은 i인데, Object로 바뀜. */
//	public Object getI() {
//		// TODO Auto-generated method stub
//		return super.getI();
//	}
}