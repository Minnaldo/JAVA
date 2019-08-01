import java.util.Iterator;

public final class Manager {
	private static Manager man = new Manager();
	private Employee[] emps = new Employee[10];
	private int index;
	
	private Manager() {}
	
	public static Manager getInstance() {
		if(man != null) {
			return man;
		}
		return null;
	}
	
	public int add(Employee emp) {
		emps[index]= emp;
		index++;
		return index;
	}
	
	public int modify(Employee emp) {
		for (int i = 0; i < index; i++) {
			if(emps[i].num == emp.num) {
				emps[i]=emp;
				return i;
			}
		}
		return -1;
	}
	
	public int delete(Employee emp) {
		for (int i = 0; i < index; i++) {
			if(emps[i].num == emp.num) {
				emps[i] = emps[index-1];
				index--;
				return i;
			}
		}
		return -1;
	}
	public Employee[] searchAll() {
		Employee[] temp = new Employee[index];
		System.arraycopy(emps, 0, temp, 0, index);
		return temp;
	}
	public Employee search(int num) {
		for (int i = 0; i < index; i++) {
			if(emps[i].num == num) {
				return emps[i];
			}
		}
		return null;
	}
	
	public void allWork() {
		for (int i = 0; i < index; i++) {
			System.out.println(emps[i].work());
		}
	}
	
}










