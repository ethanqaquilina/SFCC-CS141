package projects;

import java.util.Random;
import java.util.Scanner;

public class Project_4 {
	public static int turn_counter = 0;
	public static boolean game_over = false;
	static double distance;
	static double distanceShot;
	static double hitDist = 20;
	static double humanWins = 0;
	static double aiWins = 0;
	static boolean playAgain = true;
	static double numofGames = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int playagainChoice;

	while (playAgain) {
		numofGames++;
		distance = calc_random(100, 200);
		System.out.println(distance);

		System.out.println("You must hit the enemy artillery within " + hitDist + " meters.");

		turn_counter = 0;
		game_over = false;
		while (!game_over) {
			take_turns(scan);
		}
		
		System.out.println("Play again? yes=1 no=2");
		playagainChoice = scan.nextInt();
		if(playagainChoice == 2) {
			playAgain = false;
			if((humanWins/numofGames) > .90) {
				System.out.println("YOU DID FREAKING AMAZING! Won Above 90%!");
			} else if ((humanWins/numofGames) > .75) {
				System.out.println("Good job! Won above 75%!");
			} else {
				System.out.println("You are really bad. I feel sorry for you");
			}
		}
			
	  }
	}

	public static int calc_random(int min, int max) {
		Random rand = new Random();
		int rand_val = Math.abs(rand.nextInt());
		rand_val = (rand_val % (max - min + 1)) + min;
		return rand_val;
	}

	public static void take_turns(Scanner scan) {
		String turn = "none";
		if (turn_counter % 2 == 0) {
			turn = "Human";
		} else {
			turn = "AI";
		}
		take_a_turn(scan, turn);
		turn_counter++;
		System.out.println();
	}

	public static void take_a_turn(Scanner scan, String turn) {

		int velocity = 0;
		int angle = 0;

		if (turn == "Human") {

			System.out.println("It is the " + turn + "'s turn");
			System.out.println("Select an angle from the ground to shoot from. (in degrees)");
			angle = scan.nextInt();
			System.out.println("Select a velocity to shoot from. (meters per sec)");
			velocity = scan.nextInt();
			distanceShot = calcShot(angle, velocity);
			check_win(turn);

		} else if (turn == "AI") {
			// AI's TURN
			System.out.println("It is " + turn + " ' s turn");

			angle = calc_random(0, 90);
			velocity = calc_random(0, 100);
			System.out.println(
					"AI chose a angle of " + angle + " degrees and a velocity of " + velocity + " meters per second.");

			distanceShot = calcShot(angle, velocity);
			check_win(turn);
		}

	}

	public static void check_win(String turn) {

		double distBetween = Math.abs(distanceShot - distance);

		if (turn == "Human") {
			if (distBetween <= hitDist) {
				System.out.println("Nice Shot! You hit the enemy at " + distanceShot + " meters!");
				System.out.println("You win!");
				humanWins++;
				game_over = true;

			} else {
				System.out.println("Aw you missed the enemy at " + distanceShot + " meters!");
				game_over = false;

			}
		} else if (turn == "AI") {

			if (distBetween <= hitDist) {
				System.out.println("The AI hit you at " + distanceShot + " meters!");
				System.out.println("You lose! :(");
				aiWins++;
				game_over = true;

			} else {
				System.out.println("The ai missed at " + distanceShot + " meters! Whew!");
				game_over = false;

			}
			

		}

	}

	public static double calcShot(int angle, int v) {

		double theta;
		double pi = Math.PI;
		theta = angle * (pi / 180);

		distanceShot = Math.round((v * v * Math.sin(2 * theta)) / 9.8);
		

		return distanceShot;
	}

}
