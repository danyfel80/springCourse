package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private Random random = new Random();
	private String[] fortunes = new String[] { "Life is something to value", "Think of someone special in your life",
			"You work better when you're passionate about what you do" };

	@Override
	public String getFortune() {
		return fortunes[random.nextInt(fortunes.length)];
	}

}
