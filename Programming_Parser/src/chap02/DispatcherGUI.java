package chap02;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DispatcherGUI {
	int menu;
	Scanner s;
	DBManager man;

	public DispatcherGUI() throws SQLException {
		s = new Scanner(System.in);
		man = new DBManager();
	}

	private void go() {
		createGUI();
	}

	JFrame f = new JFrame();
	JPanel pUp = new JPanel();
	JPanel pDown = new JPanel();
	JButton bI = new JButton();
	JButton bU = new JButton();
	JButton bD = new JButton();
	JTextField tfName = new JTextField();
	JTextField tfAge = new JTextField();
	JTextField tfAddr = new JTextField();
	// JTextArea taList = new JTextArea();
	JList jlist = new JList();
	DefaultListModel<CustomerVD> model = new DefaultListModel<>();
	CustomerVD selected = new CustomerVD();
	private void createGUI() {
		// TODO Auto-generated method stub
		bI.setText("Insert");
		bU.setText("Update");
		bD.setText("Delete");
		tfName.setColumns(10);
		tfAge.setColumns(10);
		tfAddr.setColumns(10);

		jlist.setModel(model);

		pUp.add(tfName);
		pUp.add(tfAge);
		pUp.add(tfAddr);
		pDown.add(bI);
		pDown.add(bU);
		pDown.add(bD);
		f.add(pUp, BorderLayout.NORTH);
		f.add(pDown, BorderLayout.SOUTH);
		f.add(jlist);

		f.setSize(400, 500);
		f.setLocation(1000, 500);
		f.setVisible(true);

		ArrayList<CustomerVD> list = man.queryCustomer();
		for (CustomerVD c : list) {
			// taList.append(c.toString() + "\n");
			model.addElement(c);

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
				String name = tfName.getText();
				int age = Integer.parseInt(tfAge.getText());
				String addr = tfAddr.getText();
				man.insertCustomer(name, age, addr);
				ArrayList<CustomerVD> list = man.queryCustomer();
				// taList.setText(null);
				model.clear();
				for (CustomerVD c : list) {
					// taList.append(c.toString() + "\n");
					model.addElement(c);
					;
				}
			}
		});
		bU.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(selected != null) {
					man.updateCustomer(selected.getNum(), tfName.getText()
							, Integer.parseInt(tfAge.getText()), tfAddr.getText());
					
					model.clear();
					ArrayList<CustomerVD> list = man.queryCustomer();
					for (CustomerVD c : list) {
						// taList.append(c.toString() + "\n");
						model.addElement(c);

					}
				}
			}
		});
		bD.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(selected != null) {
					man.deleteCustomer(selected.getNum());
					
					model.clear();
					ArrayList<CustomerVD> list = man.queryCustomer();
					for (CustomerVD c : list) {
						// taList.append(c.toString() + "\n");
						model.addElement(c);

					}
				}
			}
		});
		
		
		jlist.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				if (jlist.getValueIsAdjusting()) {
					selected = (CustomerVD) jlist.getSelectedValue();
					tfName.setText(selected.getName());
					tfAge.setText(selected.getAge()+"");
					tfAddr.setText(selected.getAddr());
				}
			}
		});
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
