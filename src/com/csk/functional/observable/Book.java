package com.csk.functional.observable;

import java.util.ArrayList;

public class Book implements SubjectLibrary {

	private String name;
	private String type;
	private String author;
	private double price;
	private String inStock;
	private ArrayList<Observer> obList = new ArrayList<>();

	public Book() {
	}

	public Book(String name, String type, String author, double price, String inStock) {
		this.name = name;
		this.type = type;
		this.author = author;
		this.price = price;
		this.inStock = inStock;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getInStock() {
		return inStock;
	}

	public void setInStock(String inStock) {
		this.inStock = inStock;
		System.out.println("Availability changed. Notify Observer.");
		notifyObserver();
	}

	public ArrayList<Observer> getObList() {
		return obList;
	}

	public void setObList(ArrayList<Observer> obList) {
		this.obList = obList;
	}

	@Override
	public void registerObserver(Observer ob) {
		this.obList.add(ob);
	}

	@Override
	public void unsubscribeObserver(Observer ob) {
		this.obList.remove(ob);
	}

	@Override
	public void notifyObserver() {
		this.obList.forEach(ob -> {
			ob.update(this.inStock);
		});

	}

}
