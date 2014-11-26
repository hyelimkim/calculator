package Lecture;
import java.awt.*;
import java.awt.event.*;


public class keypad extends Frame{
	
	TextField display;
	
	public keypad() {
		
		display = new TextField();
		
		add(display, BorderLayout.NORTH); //¶Ç´Â add(display, BorderLayout.NORTH)
		add(buildKeypanel(), BorderLayout.CENTER);
		
		setSize(300, 400);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
			System.exit(0);
			}
		});
		
	}

	private Panel buildKeypanel(){
		Panel panel = new Panel();
		
		panel.setLayout(new GridLayout(4,3));
		panel.add(new KeyButton("1"));
		panel.add(new KeyButton("2"));
		panel.add(new KeyButton("3"));
		panel.add(new KeyButton("4"));
		panel.add(new KeyButton("5"));
		panel.add(new KeyButton("6"));
		panel.add(new KeyButton("7"));
		panel.add(new KeyButton("8"));
		panel.add(new KeyButton("9"));
		panel.add(new KeyButton("*"));
		panel.add(new KeyButton("0"));
		panel.add(new KeyButton("#"));
		
		return panel;
		//panel.add(new Button("1"));
		
//		Button btn1 = new Button("1");
//		btn1.addActionListener(new MyActionListener());
//		panel.add(btn1);
//		return panel;
	}
	
	class KeyButton extends Button implements ActionListener {

		
		public KeyButton(String label) {
			super(label);
			addActionListener(this);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		
		if(e.getSource() instanceof Button) {
			Button btn = (Button) e.getSource();
			display.setText(display.getText()+ btn.getLabel());
		
	}
		}
		}
	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		}
	}
	
	public static void main(String[] args) {
		new keypad();
	}

}
