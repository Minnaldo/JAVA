package day03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapManager implements IManager {

	//singleton instance
	private static MapManager man = new MapManager();
	//singleton constructor
	private MapManager() {};

	//Employee storage
	private HashMap<Integer, Employee> map = new HashMap<>();

	//singleton static method		
	public static MapManager getInstance()
	{
		return man;
	}

	@Override
	public void add(Employee emp) {
		// TODO Auto-generated method stub
		map.put(emp.num, emp);
	}

	@Override
	public void modify(Employee emp) {
		// TODO Auto-generated method stub
		map.put(emp.num, emp);
	}

	@Override
	public void delete(Employee emp) {
		// TODO Auto-generated method stub
		map.remove(emp.num);
	}

	@Override
	public ArrayList<Employee> search_all() {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<>();
		Set<Integer> keySet = map.keySet();
		for(Integer i : keySet)
		{
			list.add(map.get(i));
		}
		
		return list;
	}

	@Override
	public Employee search(int num) {
		// TODO Auto-generated method stub
		return map.get(num);
	}

	@Override
	public void allWork() {
		// TODO Auto-generated method stub

	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restore() {
		// TODO Auto-generated method stub
		
	}

}
