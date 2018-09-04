package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = { "Beware of the wolf in sheep's clothing", "Diligence is the mother of good luck",
			"The journey is the reward" };

	private Random generator = new Random();

	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = generator.nextInt(data.length);
		return data[index];
	}

}
