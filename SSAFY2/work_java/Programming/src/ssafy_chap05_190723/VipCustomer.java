package ssafy_chap05_190723;

/** 상속 extends */	//Customer를 상속받은 VipCustomer 클래스
public class VipCustomer extends Customer {
//		String num;
//		String name;
//		int age;
		String service;
		int age = 20;
		
		public VipCustomer(String num, String name, int age, String service) {
			super(num, name, age);	//생성자 호출로 인해
//			super.num = num;		//아래 부분 생략이 가능하고 쉽게 사용가능하다.
//			super.name = name;
//			super.age = age;			
			this.service = service;
		}

		public VipCustomer() {
			System.out.println("VipCustomer Constructor");
		}

//		public을 받으면 public으로만 가능
//		protected를 받으면 protected, public 가능
//		private ,,  접근이 안된다.
		/*toString은 Object에 있다.
		 * toSTring을 상속받았기 떄문에, 이미 String toString() {} 으로 정의되어 있다.
		 * 따라서, public int toString / public void toString 안된다.
		 * 그럼 그냥 다른 함수처럼 정의해버리면 되는데, 왜 바꾸면 안되는가?
		 * [오버로드] 이름은 toString()으로 같고 인자도 같기 때문에,, 에러가 뜬다.
		 * (int, float 으로 해도 안되는이유)
		 */
		@Override
		public String toString() {
			return "VipCustomer [num=" + num + ", name=" + name + ", age=" + age + ", service=" + service + "]";
		}
		
		
}
