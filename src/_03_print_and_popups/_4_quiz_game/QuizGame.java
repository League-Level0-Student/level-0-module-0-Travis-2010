package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero.
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER

		// 2. Ask the user a question
		String hi = JOptionPane.showInputDialog("What is around the hottest time of the day? Remember to add the p.m. or a.m.");
		if (hi.equals("3 p.m.")) {
			JOptionPane.showMessageDialog(null, "You are correct!");
            score += 1;
		} else if (hi.equals("1 p.m.")) {
			JOptionPane.showMessageDialog(null, "Sorry, but you are wrong.");
		}

		else if (hi.equals("2 p.m.")) {
			JOptionPane.showMessageDialog(null, "Sorry, but you are wrong.");
		}

		else if (hi.equals("4 p.m.")) {
			JOptionPane.showMessageDialog(null, "Sorry, but you are wrong.");
			
		} else { 
			JOptionPane.showMessageDialog(null, "Sorry, but you are wrong.");	
		}
		
		

		// 3. Use an if statement to check if their answer is correct

		// 4. if the user's answer was correct, add one to their score

		// MAKE MORE QUESTIONS. Ask more questions by repeating the above
		// Option: Subtract a point from their score for a wrong answe

		// After all the questions have been asked, tell the user their final score

		JOptionPane.showMessageDialog(null, "You earned 1 point!");
		
		
		
			}
	}
