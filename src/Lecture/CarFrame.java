package Lecture;
//import java.awt.BorderLayout;
//import java.awt.Button;
//import java.awt.Color;
//import java.awt.Component;
//import java.awt.FlowLayout;

//import java.awt.Panel;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.EventObject;
//import java.awt.event.*;
//import java.awt.event.WindowListener;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//import java.awt.*; //�̰� ���⺸�� ������ ���°� ���� �� �ִ�. �� ������ �̸��� ���� Ŭ������ ���� ��� �˾������� ����.

public class CarFrame extends Frame implements WindowListener {

public CarFrame(){
	
//	this.addWindowListener(new MyWindowListener()); //1�����
//	this.addWindowListener(new MyWindowListener2()); //2�� ��� this.�� ��� ���������ϴ�.
	
//	addWindowListener(this);//3��° ���
	addWindowListener(new WindowAdapter() { //4�� ���
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});	
	
	this.setSize(400,600); //this. ����������
	this.setVisible(true);
}
	class MyWindowListener implements WindowListener {

		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			System.exit(0);
		}

		@Override
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

	class MyWindowListener2 extends WindowAdapter {
		
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}


/*	public CarFrame() {
		Panel panel = new Panel(); //�г��� �����ѳ༮.�ƹ��͵� ����
		
		MyListener listener = new MyListener(); //������ �Ѱ��� ���� ��.
		
		Button btn1 = new Button("btn1");		
		btn1.addActionListener(listener);
		panel.add(btn1);

		Button btn2 = new Button("btn2");		
		btn2.addActionListener(listener);
		panel.add(btn2);
		
		Button btn3 = new Button("btn3");		
		btn3.addActionListener(listener);
		panel.add(btn3);

		Button btn4 = new Button("btn4");		
		btn4.addActionListener(listener);
		panel.add(btn4);	
		
		Button btn5 = new Button("btn5");		
		btn5.addActionListener(listener);
		panel.add(btn5);
		
//		panel.add(new Button("btn3"));
//		panel.add(new Button("btn4"));
//		panel.add(new Button("btn5")); //�г��� ����Ʈ�� flow ��. �׷��� btn���� ������ ������.
//		
//		Button btn1= new Button();
//		btn1.setLabel("BTN1");
//		btn1.setSize(40, 15);
//		btn1.setLocation(50, 50);
//		
//		btn1.setBounds(50,50,40,15);
//		
//		
//		this.add(new Button("BTN1"), BorderLayout.NORTH);
//		this.add(new Button("BTN2"), BorderLayout.SOUTH);
//		this.add(new Button("BTN3"), BorderLayout.WEST);
//		this.add(new Button("BTN4"), BorderLayout.EAST);
//		this.add(new Button("BTN5"), BorderLayout.CENTER); //this. �� ��������
//	
	
		panel.setBackground(Color.PINK); //����� �̸��� �빮�ڷ� ����.
		
		this.add(panel, BorderLayout.NORTH);
//		setLayout(new FlowLayout());
//		setLayout(null); //�ҹ��ڷ� �����ϸ� �޼ҵ�
		setTitle("Car Frame");
		setSize(300, 200);
		setVisible(true);

	}

	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) { //�̺�Ʈ ��鷯
			
			
			Button btn = (Button)e.getSource();
			btn.setBackground(Color.RED);
			
				
			
		}
		
	}
} */
