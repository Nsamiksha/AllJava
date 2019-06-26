package com.bridgeit.datastructure;

public class Calender_2_D {
	
	public static void main(String[] args) {
	
	int month = Integer.parseInt(args[0]);
	int year = Integer.parseInt(args[1]);

	int[][] calendar = new int[6][7];

	int[] Days = { 0, 1, 2, 3, 4, 5, 6 };
	int[] Years = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
		Years[1] = 29;
	}

	int day = Get_Day(month, 1, year);

	for (int i = 0; i < calendar.length; i++) {
		for (int j = 0; j < calendar[i].length; j++) {
			calendar[i][j] = -1;
		}
	}

	int d1 = 1;

	for (int k = day; k < calendar[0].length; k++) {
		calendar[0][k] = d1++;
	}

	for (int i = 1; i < calendar.length; i++) {
		for (int j = 0; j < calendar[i].length; j++) {
			calendar[i][j] = d1++;
		}
	}

	System.out.println("\t" + "Sun" + "\t" + "Mon" + "\t" + "Tues" + "\t" + "Wed" + "\t" + "Thurs" + "\t" + "Fri"
			+ "\t" + "Sat");

	for (int i = 0; i < calendar.length; i++) {
		for (int j = 0; j < calendar[i].length; j++) {

			if (calendar[i][j] < 0 || calendar[i][j] > Years[month - 1]) {
System.out.print("\t");
			}

			else if (calendar[i][j] > 0) {
				System.out.print("\t" + calendar[i][j] + " ");
			}
		}
		System.out.println("\t");
	}

}

public static int Get_Day(int m, int d, int y) {
	int year = (y - (14 - m) / 12);
	int z = (year + (year / 4) - (year / 100) + (year / 400));
	int month = m + 12 * ((14 - m) / 12) - 2;
	int day = (d + z + (31 * month) / 12) % 7;
	return day;
}

}
