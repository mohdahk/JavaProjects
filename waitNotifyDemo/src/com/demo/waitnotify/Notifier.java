package com.demo.waitnotify;

public class Notifier implements Runnable {

	private Message message;
	
	public Notifier(Message message) {
		
		this.message = message; 	
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (message) {
			message.setMessage("Processing of message completed");
			message.notifyAll();
			
			//message.notify() // when we have only notify only one thread will be notified other will keep on waiting.
			
		}
		
	}

}
