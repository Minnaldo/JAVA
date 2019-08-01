package day03;

import java.util.ArrayList;

public interface IManager {
	
	public void add(Employee emp);
	
	
	public void modify(Employee emp);
	
	
	public void delete(Employee emp);
	
	public ArrayList<Employee> search_all();
	
	public Employee search(int num) throws MyDataNotFoundException;
	
	public void allWork();
	
	public void save();
	
	public void restore();
}
