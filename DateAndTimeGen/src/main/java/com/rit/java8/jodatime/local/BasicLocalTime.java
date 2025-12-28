package com.rit.java8.jodatime.local;

import java.time.LocalDate;
import java.time.LocalTime;

public class BasicLocalTime {

	public static void main(String[] args) {

		// give local time in 24Hr format HH:MM:SS.MS
		LocalTime timeNow = LocalTime.now();
		System.out.println(timeNow);

		int hh = timeNow.getHour();
		int mm = timeNow.getMinute();
		int ss = timeNow.getSecond();
		int ms = timeNow.getNano();

		System.out.printf("Time now: %d:%d:%d", hh, mm, ss);

		// get local Date in format YYYY-MM-DD
		LocalDate todaysDate = LocalDate.now();

		int DD = todaysDate.getDayOfMonth();
		int MM = todaysDate.getMonthValue();
		int YYYY = todaysDate.getYear();

		System.out.printf("\nDate & time Now - %d-%d-%d %d:%d:%d", DD, MM, YYYY, hh, mm, ms);

	}

}
