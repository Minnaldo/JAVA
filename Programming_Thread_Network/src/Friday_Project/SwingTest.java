package Friday_Project;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.EventHandler;
import javax.swing.*;

public class SwingTest {
    private JList<String> list;
    private JTextField tf;
    private JButton button;
    private JFrame f;
    DefaultListModel<String> model;
    SwingTest(){
        createGUI();
        setData();
        setEvent();
    }
    private void setEvent() {
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                // TODO Auto-generated method stub
                super.windowClosing(e);
                System.exit(0);
            }
        });
//        button.addActionListener(new ActionListener() {
//            
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // TODO Auto-generated method stub
//                String str = tf.getText();
//                model.addElement(str);
//                tf.setText("");
//            }
//        });
        button.addActionListener(e->{
            String str =tf.getText();
            model.addElement(str);
            tf.setText("");
        });
    }
    private void createGUI() {
        f = new JFrame();
        f.setTitle("MyFirst Swing");
        f.setSize(300,400);
        button = new JButton("버튼");
        tf = new JTextField();
        tf.setColumns(20);
        JPanel p = new JPanel();
        p.add(tf);
        p.add(button);
        list = new JList<String>();
        f.add(list,BorderLayout.CENTER);
        f.add(p,BorderLayout.SOUTH);
        f.setLocation(500, 500);
        
        f.setVisible(true);
    }
    private void setData() {
        model = new DefaultListModel<>();
        model.addElement("hello");
        list.setModel(model);
    }
    void go() {
        
    }
    
    public static void main(String[] args) {
        new SwingTest().go();
    }
    
}