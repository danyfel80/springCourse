package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RandomFortuneApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach = context.getBean("myBaseballCoach", Coach.class);
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getDailyFortune());
		context.close();
	}

}
