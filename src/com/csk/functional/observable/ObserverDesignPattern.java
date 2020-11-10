package com.csk.functional.observable;

public class ObserverDesignPattern {

	public static void main(String[] args) {
		Book book = new Book("Theory of Relativity", "AstroPhysics", "Albert Einstein", 1200, "Soldout");
		
		EndUser saiKrishna = new EndUser("Sai Krishna", book);
		EndUser lella = new EndUser("Lella", book);
		
		book.setInStock("Instock");

	}

}
