package com.ssafy.chap02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DispatcherGUI {
	int menu;
	Scanner s;
	DBManager man;

	public DispatcherGUI() throws SQLException {
		s = new Scanner(System.in);
		man = new DBManager();
	}

	private void go() {
		// TODO Auto-generated method stub
		createGUI();
		
		
	}

	private void createGUI() {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JPanel pUp = new JPanel();
		JPanel pDown = new JPanel();
		JButton bI = new JButton();
		bI.setText("Insert");
		JButton bU = new JButton();
		bU.setText("Update");
		JButton bD = new JButton();
		bD.setText("Delete");
		JTextField tfName = new JTextField();
		tfName.setColumns(10);
		JTextField tfAge = new JTextField();
		tfAge.setColumns(10);
		JTextField tfAddr = new JTextField();
		tfAddr.setColumns(10);
		JTextArea taList = new JTextArea();
		
		pUp.add(tfName);
		pUp.add(tfAge);
		pUp.add(tfAddr);
		
		pDown.add(bI);
		pDown.add(bU);
		pDown.add(bD);
		
		f.add(pUp, BorderLayout.NORTH);
		f.add(pDown, BorderLayout.SOUTH);
		f.add(taList);
		
		f.setSize(500, 500);
		f.setLocation(400, 400);
		f.setVisible(true);
		
		ArrayList<CustomerVO> list = man.queryCustomer();
		for (CustomerVO c : list) {
			taList.append(c.toString() + "\n");					
		}
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				super.windowClosing(e);
				System.exit(0);
			}
		});
		
		bI.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = tfName.getText();
				int age = Integer.parseInt(tfAge.getText());
				String addr = tfAddr.getText();
				man.insertCustomer(name, age, addr);
				ArrayList<CustomerVO> list = man.queryCustomer();
				for (CustomerVO c : list) {
					taList.append(c.toString() + "\n");					
				}
			}
		});
		
		bU.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	private void search() {
		// TODO Auto-generated method stub
		System.out.println("검색할 번호를 입력하세요");
		int num = s.nextInt();
		CustomerVO vo = man.queryCustomerByNum(num);
		System.out.println(vo);
	}

	private void list() {
		// TODO Auto-generated method stub
		ArrayList<CustomerVO> list = man.queryCustomer();
		for (CustomerVO vo : list) {
			System.out.println(vo);
		}
	}

	private void delete() {
		// TODO Auto-generated method stub
		System.out.println("삭제할 번호를 입력하세요");
		int num = s.nextInt();
		man.deleteCustomer(num);
	}

	private void update() {
		// TODO Auto-generated method stub
		System.out.println("업데이트할 번호를 입력하세요");
		int num = s.nextInt();
		System.out.println("업데이트할 이름을 입력하세요");
		String name = s.next();
		System.out.println("업데이트할 나이를 입력하세요");
		int age = s.nextInt();
		System.out.println("업데이트할 주소를 입력하세요");
		String addr = s.next();
		
		man.updateCustomer(num, name, age, addr);
	}

	private void insert() {
		// TODO Auto-generated method stub
		System.out.println("추가할 이름을 입력하세요");
		String name = s.next();
		System.out.println("추가할 나이를 입력하세요");
		int age = s.nextInt();
		System.out.println("추가할 주소를 입력하세요");
		String addr = s.next();
		
		man.insertCustomer(name, age, addr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new DispatcherGUI().go();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
