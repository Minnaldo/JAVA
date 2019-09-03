package com.ssafy.ws.adjava04;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Dispatcher {
	public Dispatcher() {
		createGUI();
		setEvent();
		go();
	}

	BookDAO bDao;
	AuthorDAO aDao;

	private void go() {
		bDao = new BookDAO();
		aDao = new AuthorDAO();
		setListData();
	}

	// JList는 model과 view를 분리시켜놨다.
	private void setListData() {
		ArrayList<Book> data = (ArrayList<Book>) bDao.listBook();
		DefaultListModel<Book> model = new DefaultListModel<>();
		for (int i = 0; i < data.size(); i++) {
			model.add(i, data.get(i));
		}
		list.setModel(model);
	}

	private void setEvent() {
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				System.exit(0);
			}
		});

		bInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(tfAuthorno.getText());
				Author a = aDao.findAuthor(num);
				Book b = new Book(tfIsbn.getText(), tfTitle.getText(), tfPublisher.getText(),
						Integer.parseInt(tfPrice.getText()), tfDescription.getText(), num, a.getName());
				bDao.insertBook(b);
				setListData();
			}
		});

		bUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int num = Integer.parseInt(tfAuthorno.getText());
				Author a = aDao.findAuthor(num);
				Book b = new Book(tfIsbn.getText(), tfTitle.getText(), tfPublisher.getText(),
						Integer.parseInt(tfPrice.getText()), tfDescription.getText(), num, a.getName());
				bDao.updateBook(b);
				setListData();
			}
		});

		bDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				bDao.deleteBook(tfIsbn.getText());
				setListData();
			}
		});

		bFind.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Book b = bDao.findBook(tfIsbn.getText());
				if (b != null) {
					DefaultListModel<Book> model = new DefaultListModel<>();
					model.add(0, b);
					list.setModel(model);
				} else {
					setListData();
				}
			}
		});

		list.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if (!e.getValueIsAdjusting()) {
					JList list = (JList) e.getSource();
					Book b = (Book) list.getSelectedValue();
					if (b != null) {
						tfIsbn.setText(b.getIsbn());
						tfTitle.setText(b.getTitle());
						tfPublisher.setText(b.getPublisher());
						tfPrice.setText(b.getPrice() + "");
						tfDescription.setText(b.getDescription());
						tfAuthorno.setText(b.getAuthorno() + "");
					}
				}
			}
		});
	}

	JFrame f;
	JPanel pUp;
	JPanel pDown;
	JTextField tfIsbn;
	JTextField tfTitle;
	JTextField tfPublisher;
	JTextField tfPrice;
	JTextField tfDescription;
	JTextField tfAuthorno;
	JButton bInsert;
	JButton bUpdate;
	JButton bDelete;
	JButton bFind;
	JList list;

	private void createGUI() {
		f = new JFrame("도서관리");
		pUp = new JPanel();
		pDown = new JPanel();
		tfIsbn = new JTextField();
		tfTitle = new JTextField();
		tfPublisher = new JTextField();
		tfPrice = new JTextField();
		tfDescription = new JTextField();
		tfAuthorno = new JTextField();
		bInsert = new JButton();
		bUpdate = new JButton();
		bDelete = new JButton();
		bFind = new JButton();
		list = new JList();

		tfIsbn.setColumns(9);
		tfTitle.setColumns(9);
		tfPublisher.setColumns(9);
		tfPrice.setColumns(9);
		tfDescription.setColumns(9);
		tfAuthorno.setColumns(9);

		pUp.add(tfIsbn);
		pUp.add(tfTitle);
		pUp.add(tfPublisher);
		pUp.add(tfPrice);
		pUp.add(tfDescription);
		pUp.add(tfAuthorno);
		f.add(pUp, BorderLayout.NORTH);

		bInsert.setText("Insert");
		bUpdate.setText("Update");
		bDelete.setText("Delete");
		bFind.setText("Find");

		pDown.add(bInsert);
		pDown.add(bUpdate);
		pDown.add(bDelete);
		pDown.add(bFind);
		f.add(pDown, BorderLayout.SOUTH);

		f.add(new JScrollPane(list), BorderLayout.CENTER);

		f.setSize(800, 600);
		f.setLocation(300, 300);
		f.setVisible(true);
	}
}