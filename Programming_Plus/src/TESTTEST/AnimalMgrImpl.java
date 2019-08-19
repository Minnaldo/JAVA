package TESTTEST;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import day03.Employee;
import day03.IManager;
import day03.MyDataNotFoundException;

public class AnimalMgrImpl implements IAnimalMgr {

	private void AnmialMgrImpl() {}
	private static AnimalMgrImpl man = new AnimalMgrImpl();
	public static AnimalMgrImpl getInstance()
	{
		return man;
	}
	
	ArrayList<Animal> list = new ArrayList<>();
	
	@Override
	public void addAnimal(Animal a) throws DuplicateContactException{
		// TODO Auto-generated method stub
		list.add(a);
	}
	@Override
	public ArrayList<Animal> print() {
		// TODO Auto-generated method stub
		return list;
	}
	@Override
	public Animal serach_num(String num) {
		// TODO Auto-generated method stub
		Animal a = null;
		for (Animal animal : list) {
			if(animal.getNum().equals(num))
				a = animal;
		}
		
		return a;
	}
	@Override
	public ArrayList<Animal> search_name(String name) {
		// TODO Auto-generated method stub
		ArrayList<Animal> a = new ArrayList<Animal>();
		for (Animal animal : list) {
			if(animal.getName().contains(name))
				a.add(animal);
		}
		return a;
	}
	@Override
	public void delete(String num) {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getNum().equals(num))
				list.remove(i);
		}
		
	}
	@Override
	public void modify(String num, String name) {
		// TODO Auto-generated method stub
		for(int i = 0; i < list.size(); i++)
		{
			if(list.get(i).getNum().equals(num))
				list.get(i).setName(name);
		}
	}
	@Override
	public void open() {
		// TODO Auto-generated method stub
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(new FileInputStream("Animdal.dat"));
			list = (ArrayList<Animal>) ois.readObject();
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
		
	}
	@Override
	public void close() {
		// TODO Auto-generated method stub
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("Animal.dat"));
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
	

}
