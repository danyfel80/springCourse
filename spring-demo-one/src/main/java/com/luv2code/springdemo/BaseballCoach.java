package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	// dependency field
	private FortuneService fortuneService;

	public BaseballCoach() {
	}

	// constructor with dependency
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// use dependency/helper
		return fortuneService.getFortune();
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
