package io.newproblems;

import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {

	public static void main(String[] args) {
		  LocalDate date   =LocalDate.now();
		  LocalDate birthDay=LocalDate.of(1997, 10, 9);
		  
		  int years=Period.between(birthDay, date).getYears();
		  int months=Period.between(birthDay, date).getMonths();
		  int dates=Period.between(birthDay, date).getDays();
		  
		  
		  System.out.println(years+"years"+"  "+months+"months"+"  "+dates+"Days");

	}

}
