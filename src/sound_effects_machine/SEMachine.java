package sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SEMachine implements ActionListener {
	JButton B1 = new JButton();
	JButton B2 = new JButton();
	JButton B3 = new JButton();
	
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	
	public void run() {
		frame.add(panel);
		panel.add(B1); panel.add(B2); panel.add(B3);
		frame.setVisible(true);
		B1.setText("HA! Gotee!");
		B2.setText("Bruh");
		B3.setText("Distorted Sad Violin");
		frame.setTitle("MEME SOUND EFFECTS");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		B1.addActionListener(this);
		B2.addActionListener(this);
		B3.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton BPressed = (JButton) e.getSource();
		if(BPressed == B1) {
			playSound("11.wav");
		}
		if(BPressed == B2) {
			playSound("22.wav");
		}
		if(BPressed == B3) {
			playSound("33.wav");
		}
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
}
