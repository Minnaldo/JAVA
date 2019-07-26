
public class CarMgr {
	private Car[] cars = new Car[100]; // Car 배열 객체 생성
	private int index = 0;

	public void add(Car c) { // Car정보를 저장하기 위한 add()
		if (index < 100) {
			cars[index] = c; // c라는 객체가 한번에 cars[index]에 들어감
			index++; // 저장된 차량의 수 표시 (처음에 인덱스는 0)
		}

	}

	public Car[] search() { // 모든 Car 정보를 검색하기 위한 search()
		Car[] tmp = new Car[index];
		for(int i=0; i<index; i++) {
			tmp[i] = cars[i];
		}
		return tmp;	//메인에서 생성된 Car객체에 search()함수를 이용하여 return 되는 tmp 배열을 for문을 이용하여 toString()한다.
	}

	public Car search(String num) { // 차량번호로 검색할 수 있는 search(num)
		for(int i=0; i<index; i++) {
			if(num == cars[i].getNum()) {
				return cars[i];
			}
		}
		return null;	//못찾으면 null
	}

	public Car[] search(int price) { // 지정된 가격보다 작은 차량 정보 검색 기능 search(price)
		Car[] tmp =new Car[index];
		int idx =0; //tmp 객체만을 위한 index, 변수 idx
		for(int i=0; i<index; i++) {
			if(price > cars[i].getPrice()) {
				tmp[idx] = cars[i];
				idx++;
			}
		}
		return tmp;
	}

	public void update(String num, int price) {	//파라미터로 전달된 번호의 차량을 검색하여 가격을 수정한다.
		for(int i=0; i<index; i++) {
			if(num == cars[i].getNum()) {
				cars[i].setPrice(price);
			}
		}
	}

	public void delete(String num) { // 차량 삭제를 위한 delete(num)
		for (int i = 0; i < index; i++) {
			if (cars[i].getNum() == num) {
				cars[i] = cars[index - 1];
				index--;
			}
		}
	}

	public int size() { // 저장된 차량 수량을 구하는 size()
		return index;
	}

	public int totalPrice() { // 저장된 차량의 금액의 합을 구하는 totalPrice()
		// 여기서 int형의 sum 변수가 초기값 설정 되어 있기 때문에 Main에서 sum 선언안해줘도 된다잉
		int sum = 0;
		for (int i = 0; i < index; i++) {
			sum += cars[i].getPrice();
		}
		return sum;
	}

}
