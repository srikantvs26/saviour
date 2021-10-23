package com.srikantvs.java8.usecases;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		
		System.out.println("-------------Date to LocalDateTime---------------");
		
		Date date = new Date();
		LocalDateTime localDateTime2 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
		System.out.println("date : "+date);
		System.out.println("local date time : "+localDateTime2);
		
		System.out.println("-------------LocalDateTime to Date---------------");
		
		LocalDateTime localDateTime = LocalDateTime.now();
		Instant instant = LocalDateTime.now().atZone(ZoneId.of("Asia/Calcutta")).toInstant();
		Date date2 = Date.from(instant);
		System.out.println("local date time : "+localDateTime);
		System.out.println("date : "+date2);
		
	}

}
