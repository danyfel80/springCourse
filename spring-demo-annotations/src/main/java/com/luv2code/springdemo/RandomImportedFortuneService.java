package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomImportedFortuneService implements FortuneService {

	@Value("${my.fortunes}")
	private String[] fortunes;

	private Random generator = new Random();

	@Override
	public String getFortune() {
		return fortunes[generator.nextInt(fortunes.length)];
	}

}
