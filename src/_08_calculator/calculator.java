package _08_calculator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class calculator {
int num1;
int num2;
	JFrame frame = new JFrame();
	JButton a = new JButton();
	JButton s = new JButton();
	JButton m = new JButton();
	JButton d = new JButton();
	JText nu1 = new JText();
			
	public void calculatorFront() {
		frame.add(a);
		a.setText("add");
		frame.add(s);
		s.setText("subtract");
		frame.add(m);
		m.setText("multiply");
		frame.add(d);
		d.setText("divide");
		frame.setSize(200, 200);
	}
	
}
