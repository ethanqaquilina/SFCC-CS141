
// Ethan Aquilina Project 1 10/09/2022

package projects;

import java.util.Random;
import java.util.Scanner;

public class Project_1 {

	public static void main(String[] args) {

		//Defined variables
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		double sum = 0;
		int rand_val = 0;
		int min;
		int max;
		double aver_val;


		//Asks for the minimum and maximum values
		System.out.println("Enter the min value.");
		min = scan.nextInt();
		System.out.println("Enter the max value.");
		max = scan.nextInt();


		//Generates random numbers within a range
		for(int i = 0;i < 20;i++) {
			rand_val = rand.nextInt();
			rand_val = Math.abs((rand_val % (max-min + 1))) + min;

			// for adding up the values you get
			sum += rand_val;

		}
		
		//Calculates average
		aver_val = sum/20;
		System.out.println("The average value after 20 rolls was " + aver_val + ".");


		scan.close();


	}

}
