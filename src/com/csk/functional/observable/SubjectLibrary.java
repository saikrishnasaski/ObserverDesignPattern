package com.csk.functional.observable;

public interface SubjectLibrary {
	
	public void registerObserver(Observer ob);
	
	public void unsubscribeObserver(Observer ob);
	
	public void notifyObserver();

}
