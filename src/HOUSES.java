import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class HOUSES {
	static Robot R=new Robot();
	public static void main(String[] args) {
		
		
		R.moveTo(30, 500);
	for(int i=0;i<10;i++) {
		
		drawhouse(JOptionPane.showInputDialog("size:"),Color.BLACK);
	}
	}
		static void drawhouse (String h,Color c) {
			int height = 0;
			if(h.equals("small")) {
				height = 60;
			}
			else if(h.equals("medium")) {
				height = 120;
			}
			else if(h.equals("large")) {
				height = 250;
			}
			else height = 100;
			
			R.setSpeed(100);
		R.setAngle(0);
		R.setPenColor(c);
		R.penDown();
		R.setPenWidth(5);
		R.move(height);
        if(h.equals("large")) {
        	drawFlatRoof();
        }
        else {
        	drawPointyRoof();
        }
		R.setAngle(180);
		R.move(height);
		R.setAngle(90);
		R.setPenColor(Color.GREEN);
		R.move(30);
		R.penUp();
		
	


		
	}
		static void drawPointyRoof() {
			R.setAngle(45);
			R.move(20);
			R.setAngle(135);
			R.move(20);
		}
		static void drawFlatRoof() {
			R.setAngle(90);
			R.move(30);
		}
	
}
