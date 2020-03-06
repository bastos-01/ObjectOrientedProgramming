package Estudo;

import java.util.Scanner;

public class teste{
public static void main(String[] args) {

	// variable declaration
	int month, year, month_days, week_day;

	// get the year, month and day of the week the month starts
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter year: ");
	year = sc.nextInt();
	while (year < 0) {
		System.out.println("Invalid year");
		System.out.print("Enter year: ");
		year = sc.nextInt();
	}
	System.out.print("Enter month (1-12): ");
	month = sc.nextInt();
	while (month > 12 || month < 1) {
		System.out.println("Invalid month");
		System.out.print("Enter month (1-12): ");
		month = sc.nextInt();
	}
	System.out.print("Enter the day of the week (0(sunday)-6(saturday)): ");
	week_day = sc.nextInt();
	while (week_day > 6 || week_day < 0) {
		System.out.println("Invalid day");
		System.out.print("Enter the day of the week (0(sunday)-6(saturday)): ");
		week_day = sc.nextInt();
	}

	// method that returns the number of days of a certain month of a certain year
	month_days = daysOfMonth(month, year);
	System.out.println();

	// get month name based on his number (1-12) and print it along with the
	// respective year
	String monthyear_str = getMonthName(month) + " " + year;
	System.out.printf("%17s", monthyear_str);
	System.out.println();
	
	// print days of the week formated
	String[] day_name = { "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" };
	for (int i = 0; i < day_name.length; i++) {
		System.out.printf("%3s", day_name[i]);
	}
	System.out.println();

	// print table (calendar)
	printTable(week_day, month_days);
	sc.close();

}

// method that returns the number of days of a certain month of a certain year
public static int daysOfMonth(int month, int year) {
	if (month == 2) {
		if (((year % 4 == 0) && (year % 100 == 0)) || (year % 400 == 0)) {
			return 29;
		} else {
			return 28;
		}
	} else {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			return 31;
		} else {
			return 30;
		}
	}
}

// method that returns the name of the month based on his number (1-12)
public static String getMonthName(int month) {
	String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
			"October", "November", "December" };
	String month_name = months[month - 1];
	return month_name;
}

// method that creates and prints the table (calendar)
public static void printTable(int week_day, int month_days) {

	// declaration and creation of the table
	int[][] calendar;
	calendar = new int[6][7];

	// counter that fills the table with the days' number
	int counter = 1;

	// TABLE CREATION
	// for the first line, start filling from the column x, according to the user's
	// input
	for (int c = week_day; c < 7; c++) {
		calendar[0][c] = counter;
		counter++;
	}

	// for the following lines...
	for (int l = 1; l < 6; l++) {
		// for all the columns in each line, fill with a number
		for (int c = 0; c < 7; c++) {
			if (counter > month_days)
				break;
			calendar[l][c] = counter;
			counter++;
		}
	}

	// TABLE PRINTING
	// for all the lines...
	for (int l = 0; l < 6; l++) {
		// for all the columns...
		for (int c = 0; c < 7; c++) {
			if (calendar[l][c] == 0) {
				// replace all the 0's for whitespace
				System.out.print("   ");
			} else {
				// print formatted cells
				System.out.printf("%3d", calendar[l][c]);
			}
		}
		// change line when the column ends
		System.out.println();
	}
}
}

