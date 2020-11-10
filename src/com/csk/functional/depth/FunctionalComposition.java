package com.csk.functional.depth;

import java.util.stream.Stream;

public class FunctionalComposition {
	
	public static void main(String [] args) {
		Function<Square, Integer> fun1 = s -> s.getArea();
		Function<Integer, Double> fun2 = area -> Math.sqrt(area);
		
		Function<Square, Double> get = fun2.compose(fun1);
		System.out.println(get.apply(new Square(100)));
		
		
		Stream<String> a = Stream.of("Sai", "Krishna");
		
		a.map(line -> line.split(""));
		Stream<String> b = Stream.of("CSK", "KXIP");
		
		Stream<Stream<String>> of = Stream.of(a, b)
			.map(e -> e);
	}

}
