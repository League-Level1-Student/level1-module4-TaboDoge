package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckle_clicker implements ActionListener {
	JButton right = new JButton();
	JButton left = new JButton();

public static void main(String[] args) {
	chuckle_clicker chuckleClicker = new chuckle_clicker();
	chuckleClicker.makeButtons();
}
public void makeButtons() {
	JOptionPane.showMessageDialog(null, "Make buttons");
	JFrame frame = new JFrame();
	frame.setVisible(true);
	JPanel panel = new JPanel();
	frame.add(panel);
		panel.add(right);
	right.setText("punchline");
	left.setText("joke");
	panel.add(left);
	frame.pack();
	left.addActionListener(this);
	right.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource() == left) {
		JOptionPane.showMessageDialog(null, "What is red and is a bucket, a red bucket");
	}
	if(e.getSource() == right) {
		JOptionPane.showMessageDialog(null, "hi");
	}

}
}
