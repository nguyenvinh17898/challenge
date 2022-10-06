package com.vinhnguyen.challenge;

public class main {

	public static void main(String[] args) {
		Range validAgesForHighSchool = Range.of(16, 18);

		System.out.println(validAgesForHighSchool.contains(5));
	}

}
