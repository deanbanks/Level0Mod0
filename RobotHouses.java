import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class RobotHouses {
	public static void main(String[] args) {
		Robot bob =new Robot(50,500);
		bob.setSpeed(10);
		bob.penDown();
		bob.setWindowColor(Color.BLACK);
		
		for (int i = 0; i < 10; i++) {
		int amaan=new Random().nextInt(400)+100;
	 bob.setRandomPenColor();
		
		
		bob.move(amaan);
		if(amaan<300){
		bob.turn(45);
		bob.move(25);
		bob.turn(90);
		bob.move(25);
		bob.turn(45);
		}
		else{
			bob.turn(90);
	        bob.move(50);
	        bob.turn(90);	
		}
        
        bob.move(amaan);
        bob.turn(-90);
       bob.setPenColor(Color.GREEN);
        bob.move(50);
        bob.turn(-90);
        
	}
}
}