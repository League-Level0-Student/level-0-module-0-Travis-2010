package _02_code_flow._4_flaming_ninja_star;

import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 200;		//the size of the black part of the star
		int flameSize = 130;		//the length of the flaming arms
		
		// Make a new robot, and set it's pen down.
        Robot hi = new Robot();
        hi.penDown();
		// Set the robot speed to 100
		hi.setSpeed(100);
		// Set the robot window size to 800 x 800
        hi.setWindowSize(800,800);
		// Use a for loop to repeat all of the code below ONE time (we will change this later)
        for(int numbers = 0; numbers < 1; numbers += 1) {
			   // TURN RIGHT     Turn the robot 1/8 of a circle (hint: 360 degrees will turn a full circle)
		       hi.turn(360/8);
			   // DRAW           Move the robot 64 pixels
               hi.move(64);
			   // TURN LEFT      Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			   hi.turn(-40);
			   // DRAW FLAME     Move the robot the distance in the variable flameSize
			   hi.move(flameSize);
				//               Turn the robot 170 degrees
			   hi.turn(170);
				//               Move the robot the distance in the variable flameSize (again)
			
			   hi.move(flameSize);
			   
			   // TURN RIGHT     Turn the robot 64 degrees to the right
			    hi.turn(64);
        
			
        	// DRAW          Move the robot the distance in the variable baseSize
			    hi.move(baseSize);
        
        }
		
		// TEST   Run the program. Check that your shape is the same as the first picture in the recipe. 
		//        This is one arm of the ninja star.
		
		// COLOR  Change the Robot's pen color so that the flame is a different color to the rest of the star.
		//        Run the program again. Check the second picture in the recipe.
        
		// LOOP   When you have one arm looking right, change your for loop to repeat 25 times.
		
	}

}
