package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class typingTutor implements KeyListener {
	char currentLetter;
	 Random r = new Random();
	 JPanel panel = new JPanel();
	 JFrame frame = new JFrame();
	 JLabel label = new JLabel();
	public static void main(String[] args) {
		
		typingTutor tutor = new typingTutor();
		tutor.setup(); 
	
		 }

	 void setup(){
		 currentLetter = generateRandomLetter();
		 
		 label.setText(currentLetter + "");
		 label.setFont(label.getFont().deriveFont(28.0f));
		 label.setHorizontalAlignment(JLabel.CENTER);
         
         frame.addKeyListener(this);
       
         panel.setOpaque(true);
         frame.add(panel);
         frame.setVisible(true);
         frame.add(label);
         frame.setTitle("typing tutor");
         frame.pack();
         }

 char generateRandomLetter() {
	
		    return (char) (r.nextInt(26) + 96);
		    
		
	}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Autoimport panel;
	if (e.getKeyChar() == currentLetter) {
		System.out.println("correct");
	frame.getContentPane().setBackground(Color.green);
	
	r.nextInt();

	 currentLetter = generateRandomLetter();

	 label.setText(currentLetter + "");
	
	}
	else {
		System.out.println("incorrect");
		frame.getContentPane().setBackground(Color.red);
		currentLetter = generateRandomLetter();
		 label.setText(currentLetter + "");
		
	}
	
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
    
}
