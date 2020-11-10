package com.csk.reactive.callbacks;

public class CallBackDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread is running....");
		
		Runnable r = new Runnable() {
			@Override
			public void run() {
				new CallBackDemo().runningAsync(new CallBack() {

					@Override
					public void pushData(String data) {
						System.out.println("Push Data:" + data);
					}

					@Override
					public void pushComplete() {
						System.out.println("Push Completed");
					}

					@Override
					public void pushException(Exception ex) {
						System.out.println("Exception occured while pushing:" + ex.getMessage());
					}
					
				});
			}
		};
		
		Thread parallel = new Thread(r);
		parallel.start();
		
		Thread.sleep(3000);
		System.out.println("Main Thread exits");

	}
	
	public void runningAsync(CallBack callBack) {
		System.out.println("I am running on separate thread...");
		sleep(1000);
		callBack.pushData("Call Back Returned");
		callBack.pushComplete();
		
	}

	private void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
