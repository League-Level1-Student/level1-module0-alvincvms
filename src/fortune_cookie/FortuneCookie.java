package fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	public void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		
	    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "woohoo");
		int rand = new Random().nextInt(5);
	    System.out.println("Button clicked");
	    if (rand==0) {
	    	JOptionPane.showMessageDialog(null, "1st Fortune");
	    }
	    if (rand==1) {
	    	JOptionPane.showMessageDialog(null, "2nd Fortune");
	    }
	    if (rand==2) {
	    	JOptionPane.showMessageDialog(null, "3rd Fortune");
	    }
	    if (rand==3) {
	    	JOptionPane.showMessageDialog(null, "4th Fortune");
	    }
	    if (rand==4) {
	    	JOptionPane.showMessageDialog(null, "5th Fortune");
	    }
	}
}
