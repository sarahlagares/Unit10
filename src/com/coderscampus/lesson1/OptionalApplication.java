package com.coderscampus.lesson1;

import java.math.BigDecimal;
import java.util.Optional;

public class OptionalApplication {

	public static void main(String[] args) {
		//lesson 1
//		Optional<String> fullName = Optional.of("Sarah Lagares");
//		System.out.println(fullName);
//		String sarah = fullName.get();
//		System.out.println(sarah);
		
		//lesson 2+
		Recipe cookies = new Recipe();
		cookies.setName("Chocolate Chip Cookies");
		cookies.setInstructions("1. Preheat oven\n2. Put dough on baking sheets\n3. Bake dough for 15 minutes\n");
	    cookies.setPriceOpt(new BigDecimal(9.99));
		System.out.println(cookies);
		System.out.println("---------------");
		
		Recipe pastry = new Recipe();
		pastry.setName("Croissants");
		pastry.setInstructions("1. Preheat oven\n2. Roll each peice of dough and place on baking sheets\n3. Bake dough for 11 minutes\n");
		System.out.println(pastry);
	}

}
