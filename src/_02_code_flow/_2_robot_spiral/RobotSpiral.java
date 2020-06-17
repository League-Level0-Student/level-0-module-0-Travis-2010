package _02_code_flow._2_robot_spiral;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */


import org.jointheleague.graphical.robot.Robot;

public class RobotSpiral {

	public static void main(String[] args) {
		
		// Create a new Robot
		Robot hi = new Robot();
		// Set your robot's pen down 
		hi.penDown();
		// SPEED. Set the robot to go at max speed (100)
		hi.setSpeed(100);
        // LOOP. Use a for loop to repeat ALL the following lines of code 50 times. 
		for(int lines = 0; lines < 50; lines +=  1 ) {
				// Change the robot pen color to random
		hi.setRandomPenColor();	
				// DRAW.    Move the robot (5*i) pixels
				//          "i" is the variable in the for loop	
		hi.move(7*lines);	
				// TURN.    Turn the robot (360/7) degrees to the right
		hi.turn(360/3);	
				// Change the robot pen width to (i)
		hi.setPenWidth(lines);
		
		}
		
		
		
		// Check the pattern against the picture in the recipe. If it matches, you are done!
		
	}
	}
