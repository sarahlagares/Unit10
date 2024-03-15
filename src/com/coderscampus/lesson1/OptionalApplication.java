package com.coderscampus.lesson1;

import java.util.Optional;

public class OptionalApplication {

	public static void main(String[] args) {
		//lesson 1
		Optional<String> fullName = Optional.of("Sarah Lagares");
		System.out.println(fullName);
		String sarah = fullName.get();
		System.out.println(sarah);
		
		//lesson 2+
		Recipe cookies = new Recipe();
		cookies.setName("Chocolate Chip Cookies");
		cookies.setInstructions("1. Preheat oven\n2. Put dough on baking sheets\n3. Cook dough for 15 minutes");
	
		System.out.println(cookies);
	}

}
