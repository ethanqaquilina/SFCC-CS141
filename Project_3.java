package projects;

import java.util.Random;
import java.util.Scanner;

public class Project_3 {

	static int min = 0;
	static int max = 0;
	static int total = 0;
	static boolean sorted;
	static boolean unsorted;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		getNumbers(scan);
		whichLists(scan);

		int[] numbers = new int[total];
		fill_array(numbers);

		if (unsorted) {
			print_array(numbers);
		}
		bubble_sort(numbers);
		System.out.println();

		if (sorted) {
			print_array(numbers);
		}

	}

	public static void bubble_sort(int[] ary) {
		int size = ary.length;
		int temp = 0;
		for (int j = 0; j < size; j++) {
			boolean swapped = false;
			for (int i = 1; i < (size - j); i++) {
				if (ary[i] < ary[i - 1]) {
					swapped = true;
					temp = ary[i];
					ary[i] = ary[i - 1];
					ary[i - 1] = temp;

				}
			}
			if (!swapped) {
				break;
			}
		}
	}

	public static void print_array(int[] ary) {
		int size = ary.length;
		for (int i = 0; i < size; i++) {
			System.out.println(ary[i]);
		}
	}

	public static void fill_array(int[] ary) {
		int size = ary.length;
		for (int i = 0; i < size; i++) {
			ary[i] = calc_random(min, max);
		}
	}

	public static int calc_random(int min, int max) {
		Random rand = new Random();
		int rand_val = Math.abs(rand.nextInt());
		rand_val = (rand_val % (max - min + 1)) + min;
		return rand_val;
	}

	public static void getNumbers(Scanner scan) {
		System.out.println("Enter min number.");
		min = scan.nextInt();
		System.out.println("Enter max number.");
		max = scan.nextInt();
		System.out.println("Enter total numbers.");
		total = scan.nextInt();
	}

	public static void whichLists(Scanner scan) {
		int choice = 0;
		System.out.println("Would you like to to see unsorted list? yes=1 no =2");
		choice = scan.nextInt();
		if (choice == 1) {
			unsorted = true;
		} else {
			unsorted = false;
		}
		System.out.println("Would you like to to see sorted list? yes=1 no=2");
		choice = scan.nextInt();
		if (choice == 1) {
			sorted = true;
		} else {
			sorted = false;
		}
	}

}
