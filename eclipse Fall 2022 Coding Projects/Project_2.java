package projects;

import java.util.Random;
import java.util.Scanner;

public class Project_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Creates Doors
		int[] doors = new int[3];
		for (int i = 0; i < 3; i++) {
			doors[i] = i;
		}
		// Shuffles Doors
		shuffle_doors(doors);
		int choice;

		// Begins Game
		System.out.println("Welcome to LETS MAKE A DEAL!!");
		choice = get_user_choice(scan);

		// Checks Choice
		check_choice(choice, doors, scan);

		scan.close();

	}

	public static void check_choice(int choice, int[] doors, Scanner scan) {
		int user_input;

// Checks if your choice was not door 1
		if (doors[0] != 0 && choice != 1) {
			System.out.println("Behind door 1 is a Booby Prize!");
			System.out.println("You have chosen door " + choice);
			if (choice == 2) {
				System.out.println("Do you wish to switch to door 3?");
				System.out.println("Enter 1 for yes, and zero otherwise");
				user_input = scan.nextInt();
				if (user_input == 1) {
					System.out.println("Your final choice is door 3");
					choice = 2;
					if (doors[choice] != 0) {
						System.out.println("Ach, you go the booby prize!");
						System.out.println("The good prize was behind door 2");
					} else {
						System.out.println("The good prize was behind door 2");
						System.out.println("Congrats! You won!");
					}
				} else {
					System.out.println("Your final choice is door 2");
					if (doors[1] != 0) {
						System.out.println("Ach, you go the booby prize!");
						System.out.println("The good prize was behind door 3");
					} else {
						System.out.println("The good prize was behind door 2");
						System.out.println("Congrats! You won!");
					}
				}
			} else {
				System.out.println("Do you wish to switch to door 2?");
				System.out.println("Enter 1 for yes, and zero otherwise");
				user_input = scan.nextInt();
				if (user_input == 1) {
					System.out.println("Your final choice is door 2");
					choice = 1;
					if (doors[choice] != 0) {
						System.out.println("Ach, you go the booby prize!");
						System.out.println("The good prize was behind door 3");
					} else {
						System.out.println("The good prize was behind door 2");
						System.out.println("Congrats! You won!");
					}
				} else {
					System.out.println("Your final choice is door 3");
					if (doors[2] != 0) {
						System.out.println("Ach, you go the booby prize!");
						System.out.println("The good prize was behind door 2");
					} else {
						System.out.println("The good prize was behind door 3");
						System.out.println("Congrats! You won!");
					}
				}
			}
// Checks if your answer was not door 2
		} else if (doors[1] != 0 && choice != 2) {
			System.out.println("Behind door 2 is a Booby Prize!");
			System.out.println("You have chosen door " + choice);
			if (choice == 1) {
				System.out.println("Do you wish to switch to door 3?");
				System.out.println("Enter 1 for yes, and zero otherwise");
				user_input = scan.nextInt();
				if (user_input == 1) {
					System.out.println("Your final choice is door 3");
					choice = 2;
					if (doors[choice] != 0) {
						System.out.println("Ach, you got the booby prize!");
						System.out.println("The good prize was behind door 1");
					} else {
						System.out.println("The good prize was behind door 3");
						System.out.println("Congrats! You won!");
					}
				} else {
					System.out.println("Your final choice is door 1");
					if (doors[0] != 0) {
						System.out.println("Ach, you got the booby prize!");
						System.out.println("The good prize was behind door 3");
					} else {
						System.out.println("The good prize was behind door 1");
						System.out.println("Congrats! You won!");
					}
				}
			} else {
				System.out.println("Do you wish to switch to door 1?");
				System.out.println("Enter 1 for yes, and zero otherwise");
				user_input = scan.nextInt();
				if (user_input == 1) {
					System.out.println("Your final choice is door 1");
					choice = 0;
					if (doors[choice] != 0) {
						System.out.println("Ach, you got the booby prize!");
						System.out.println("The good prize was behind door 1");
					} else {
						System.out.println("The good prize was behind door 3");
						System.out.println("Congrats! You won!");
					}
				} else {
					System.out.println("Your final choice is door 3");
					if (doors[2] != 0) {
						System.out.println("Ach, you got the booby prize!");
						System.out.println("The good prize was behind door 1");
					} else {
						System.out.println("The good prize was behind door 3");
						System.out.println("Congrats! You won!");
					}
				}
			}
//Checks if your answer was not door 3
		} else {
			System.out.println("Behind door 3 is a Booby Prize!");
			System.out.println("You have chosen door " + choice);
			if (choice == 2) {
				System.out.println("Do you wish to switch to door 1?");
				System.out.println("Enter 1 for yes, and zero otherwise");
				user_input = scan.nextInt();
				if (user_input == 1) {
					System.out.println("Your final choice is door 1");
					choice = 0;
					if (doors[choice] != 0) {
						System.out.println("Ach, you got the booby prize!");
						System.out.println("The good prize was behind door 2");
					} else {
						System.out.println("The good prize was behind door 1");
						System.out.println("Congrats! You won!");
					}
				} else {
					System.out.println("Your final choice is door 2");
					if (doors[1] != 0) {
						System.out.println("Ach, you got the booby prize!");
						System.out.println("The good prize was behind door 1");
					} else {
						System.out.println("The good prize was behind door 2");
						System.out.println("Congrats! You won!");
					}
				}
			} else {
				System.out.println("Do you wish to switch to door 2?");
				System.out.println("Enter 1 for yes, and zero otherwise");
				user_input = scan.nextInt();
				if (user_input == 1) {
					System.out.println("Your final choice is door 2");
					choice = 1;
					if (doors[choice] != 0) {
						System.out.println("Ach, you got the booby prize!");
						System.out.println("The good prize was behind door 1");
					} else {
						System.out.println("The good prize was behind door 2");
						System.out.println("Congrats! You won!");
					}
				} else {
					System.out.println("Your final choice is door 1");
					if (doors[0] != 0) {
						System.out.println("Ach, you got the booby prize!");
						System.out.println("The good prize was behind door 2");
					} else {
						System.out.println("The good prize was behind door 1");
						System.out.println("Congrats! You won!");
					}
				}
			}
		}

	}

	// Gets User's choice of door
	public static int get_user_choice(Scanner scan) {
		int user_input = 0;

		boolean keep_asking = true;

		while (keep_asking || user_input < 1 || user_input > 3) {

			System.out.println("Which door do you want to choose?" + " Door number 1, 2, or 3?");

			try {
				user_input = scan.nextInt();
				keep_asking = false;
			} catch (Exception e) {
				System.out.println("Invalid Input.");
			} finally {
				scan.nextLine();
			}
		}
		return user_input;
	}

	// shuffles doors
	public static void shuffle_doors(int[] deck) {
		Random rand = new Random();
		int r1, r2, temp;
		for (int i = 0; i < 3; i++) {
			r1 = Math.abs(rand.nextInt()) % 3;
			r2 = Math.abs(rand.nextInt()) % 3;
			temp = deck[r1];
			deck[r1] = deck[r2];
			deck[r2] = temp;
		}
	}

}
