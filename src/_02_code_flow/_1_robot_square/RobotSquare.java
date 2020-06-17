package _02_code_flow._1_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2020
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {

	public static void main(String[] args) {

		// This code makes a new Robot
		Robot rob = new Robot();

		// Put the robot's pen down so it can draw
		// Use the rob.penDown(); command.
		rob.penDown();
		// SPEED. Make the robot move quickly.
		// Use the rob.setSpeed(); command.
		rob.setSpeed(30);

		// DRAW. Draw a line
		// Use the rob.move(); command
//        rob.move(100);
//        rob.turn(90);
//        rob.move(100);
//        rob.turn(90); rob.move(100);
//        rob.turn(90); rob.move(100);
//        rob.turn(90); rob.move(100);
//        
		// TURN. Turn 90 degrees
		// Use the rob.turn(); command
		// is number less then four? If it is, draw another line.
		for (int lines = 0; lines < 4; lines += 1) {
			rob.move(100);
			rob.turn(90);
		}
		// LOOP. Now put the DRAW and TURN code into a for loop to repeat 4 times.
	} // Did your Robot draw a square?

}
