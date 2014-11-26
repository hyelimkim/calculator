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

//import java.awt.*; //이걸 쓰기보다 여러줄 적는게 나을 수 있다. 그 이유는 이름이 같은 클래스가 있을 경우 알아차리질 못함.

public class CarFrame extends Frame implements WindowListener {

public CarFrame(){
	
//	this.addWindowListener(new MyWindowListener()); //1번방법
//	this.addWindowListener(new MyWindowListener2()); //2번 방법 this.은 모두 생략가능하다.
	
//	addWindowListener(this);//3번째 방법
	addWindowListener(new WindowAdapter() { //4번 방법
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});	
	
	this.setSize(400,600); //this. 생략ㄱ가능
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
		Panel panel = new Panel(); //패널은 투명한녀석.아무것도 업슴
		
		MyListener listener = new MyListener(); //리스너 한개만 만들어서 함.
		
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
//		panel.add(new Button("btn5")); //패널은 디폴트가 flow 임. 그래서 btn들이 옆으로 나열됨.
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
//		this.add(new Button("BTN5"), BorderLayout.CENTER); //this. 은 생략가능
//	
	
		panel.setBackground(Color.PINK); //상수의 이름은 대문자로 쓴다.
		
		this.add(panel, BorderLayout.NORTH);
//		setLayout(new FlowLayout());
//		setLayout(null); //소문자로 시작하면 메소드
		setTitle("Car Frame");
		setSize(300, 200);
		setVisible(true);

	}

	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) { //이벤트 헨들러
			
			
			Button btn = (Button)e.getSource();
			btn.setBackground(Color.RED);
			
				
			
		}
		
	}
} */
