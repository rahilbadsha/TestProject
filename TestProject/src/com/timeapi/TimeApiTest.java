package com.timeapi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class TimeApiTest {

	public static void main(String[] args) throws InterruptedException {
	Instant ins1=Instant.now();
		
	LocalDate dateApi= LocalDate.of(2019, 03, 31);
	System.out.println(dateApi.getEra());
	LocalDate previousMonthDaye=dateApi.minusMonths(1);
	System.out.println(previousMonthDaye);
	//ZoneId.getAvailableZoneIds().stream().forEach(System.out::println);
	
	ZoneId zoneId=ZoneId.of("Asia/Bangkok");
	ZonedDateTime uctTimeZone= ZonedDateTime.of(LocalDate.now(),LocalTime.now(), zoneId);
	System.out.println(uctTimeZone);
	
	System.out.println(ZoneId.systemDefault());
	//Thread.sleep(5000);
	Instant ins2=Instant.now();
	System.out.println(ins2.getEpochSecond()-ins1.getEpochSecond());
	
	LocalDate date2= LocalDate.parse("Saturday, Jul 14, 2018 14:31:06 PM", DateTimeFormatter.ofPattern("EEEE, MMM dd, yyyy HH:mm:ss a"));
	System.out.println(date2);
	Map<String, Integer>productPriceMap=new HashMap<>();
	productPriceMap.getOrDefault("Fish", 1);
	
	var productPrice = new HashMap<String, Double>();
	
	var t=67;
	System.out.println(t);

	}

}
