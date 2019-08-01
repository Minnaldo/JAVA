import java.util.ArrayList;
import java.util.Collection;

public interface IManager {
	
	public void add(Employee emp) ;
	
	public void modify(Employee emp);
	
	public void delete(Employee emp) ;
	
	public ArrayList<Employee> searchAll() ;
	
	public Employee search(int num) throws MyDataNotFoundException ;
	
	public void allWork() ;
	
	public void save();
	
	public void restore();
}
