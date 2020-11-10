package com.csk.functional.observable;

public class EndUser implements Observer {

	private String name;

	public EndUser(String name, SubjectLibrary subject) {
		this.name = name;
		subject.registerObserver(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(String avail) {
		System.out.println("Hey " + this.name + ".Please Hurry! Google Pixel 4a is available now:" + avail);

	}

}
