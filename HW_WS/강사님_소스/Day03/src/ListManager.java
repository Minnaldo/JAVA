import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ListManager implements IManager {
	// singleton instance
	private static ListManager man = new ListManager();
	// singleton constructor
	private ListManager() {};
	// Employee storage
	private ArrayList<Employee> list = new ArrayList<>();
	// singleton statice method
	public static ListManager getInstance() {
		return man;
	}
	
	// 파일에 저장하는 메소드
	public void save() {
		try {
			
			FileOutputStream fos = new FileOutputStream("emp.save");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			oos.flush();
			oos.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	// 파일에서 불러오는 메소드
	public void restore() {
		try {
			FileInputStream fis = new FileInputStream("emp.save");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList<Employee> list = (ArrayList<Employee>) ois.readObject();
			if(!list.isEmpty()) {
				this.list = list;
			}
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	};
	
	
	@Override
	public void add(Employee emp) {
		boolean add = list.add(emp);
	}

	@Override
	public void modify(Employee emp) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).num == emp.num) {
				list.set(i, emp);
			}
		}
	}

	@Override
	public void delete(Employee emp) {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).num == emp.num) {
				list.remove(i);
			}
		}
	}

	@Override
	public ArrayList<Employee> searchAll() {
		// TODO Auto-generated method stub
		return list;
	}
/**
 * 근로자를 찾는 메소드
 * @param 근로자 번호
 * @return Employee 찾지못하면 MyDataNotFoundException
 */
	@Override
	public Employee search(int num) throws MyDataNotFoundException {
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).num == num) {
				return list.get(i);
			}
		}
		throw new MyDataNotFoundException();
	}

	@Override
	public void allWork() {
		// TODO Auto-generated method stub
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).work());
		}
	}

}
