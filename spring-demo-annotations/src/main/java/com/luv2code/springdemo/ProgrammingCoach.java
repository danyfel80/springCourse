package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class ProgrammingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do your programming katas";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
