package translateText;

import javax.swing.*;
import javax.swing.text.DefaultCaret;

import java.awt.*;
import java.awt.event.*;

public class MyFreme extends JFrame{

JButton b1,b2;
JLabel l1;
JTextField t1,t2;
 JPanel p;
int i,k,n;
String a,b,text1;
JTextArea textArea;
String[] fullList3;
Mylesener mylesener=new Mylesener();



public MyFreme(String[] fullList2){
	
    super("��������� ����� ���������� ������� �� ����� ������");
    setLayout(new FlowLayout());//������������ ��������� �� ������
    fullList3=fullList2;
  
    b1=new JButton("�������������");
    l1=new  JLabel("���� � ����� D:\\test.txt");
    textArea=new JTextArea(35,50);
    textArea.setWrapStyleWord(true); 
    textArea.setLineWrap(true); 
    DefaultCaret caret = (DefaultCaret) textArea.getCaret(); 
    caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE); 
    add(l1);
 
    add(b1);//�������� ������� � ����
    setSize(700,700);//������� ����
    JScrollPane jScrollPane=new JScrollPane(textArea);
    add(jScrollPane);
    b1.addActionListener(mylesener);//���������� ���������
    setLocationRelativeTo(null);//���� �� ������ ������
    setVisible(true);//������� ������� ����
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//������� ��� ������ �������� ����
    setLocationRelativeTo(null);//���� �� ������ ������
    
 }
public class Mylesener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
        	
          
             for(String m:fullList3) {
            	 textArea.append(m); 
             }
          
         }
    }
 }
}
