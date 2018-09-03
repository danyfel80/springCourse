package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
	}

	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: " + fortuneService.getFortune();
	}
	
	// init method
	public void doInit() {
		System.out.println("TrackCoach: start up method");
	}
	
	// destroy method
	public void doDestroy() {
		System.out.println("TrackCoach: clean up method");
	}

}
