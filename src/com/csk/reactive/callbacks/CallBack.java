package com.csk.reactive.callbacks;

public interface CallBack {

	void pushData(String data);
	
	void pushComplete();
	
	void pushException(Exception ex);
}
