package _01_nasty_surprise;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class trickortreat implements ActionListener {
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
	trick.addActionListener(this);
	treat.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	if (trick == arg0.getSource()) {
		showPictureFromTheInternet("https://media.licdn.com/media-proxy/ext?w=800&h=800&hash=rJlor0%2B2alMm9rC9p8tTNJfIAEU%3D&ora=1%2CaFBCTXdkRmpGL2lvQUFBPQ%2CxAVta5g-0R6nlh8Tw1It6a2FowGz60oIQY_PTWn8CnL_5aaEFHbrCKaoeu7QpiwUGXNg9GUtLq3sGWO9R47vdMy6P7Mo1saycY2nbhUPZxcJ0jsf04BpYUlr5cujWLmhNXcegLgMPX_7JeTrYkY-TDFq1LqcD6XKK1wI3wKCFdnYSf5od4c0qdJ00A5dgOT1H8Zt6YtzkGli7V2_7w");
	}
	if(treat == arg0.getSource()) {
		showPictureFromTheInternet("https://www.gotokyo.org/shared/site_gotokyo/images/visual_img.jpg");
	}
	}
	




private void showPictureFromTheInternet(String imageUrl) {
    try {
        URL url = new URL(imageUrl);
        Icon icon = new ImageIcon(url);
        JLabel imageLabel = new JLabel(icon);
        JFrame frame = new JFrame();
        frame.add(imageLabel);
        frame.setVisible(true);
        frame.pack();
    } catch (MalformedURLException e) {
        e.printStackTrace();
    }
}
}

