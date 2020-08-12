package _01_nasty_surprise;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class trickortreat implements MouseListener {
static JButton trick = new JButton();
static JButton treat = new JButton();

static JFrame frame = new JFrame();
static JPanel panel = new JPanel();

public static void main(String[] args) {
	
trick.setText("trick");
treat.setText("treat");
panel.add(trick);
panel.add(treat);
frame.add(panel);
frame.setVisible(true);
frame.pack();
trickortreat trick = new trickortreat();
trick.buttonListener();
}
void buttonListener () {
	trick.addMouseListener(this);
	treat.addMouseListener(this);
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}

