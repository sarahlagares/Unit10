package com.coderscampus.lesson1;

import java.util.Optional;

public class OptionalApplication {

	public static void main(String[] args) {
		Optional<String> fullName = Optional.of("Sarah Lagares");
		
		System.out.println(fullName);
		
		String sarah = fullName.get();
		
		System.out.println(sarah);
	}

}
