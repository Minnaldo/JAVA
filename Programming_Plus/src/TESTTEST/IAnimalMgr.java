package TESTTEST;

import java.util.ArrayList;

public interface IAnimalMgr {
	
	public void addAnimal(Animal a) throws DuplicateContactException ;
	public ArrayList<Animal> print();
	public Animal serach_num(String num);
	public ArrayList<Animal> search_name(String name);
	public void delete(String num);
	public void modify(String num, String name);
	public void open();
	public void close();
}
