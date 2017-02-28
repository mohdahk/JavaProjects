package com.demo.waitnotify;

public class Waiter implements Runnable {
	private Message message;
	public Waiter(Message message){
		this.message = message;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		synchronized (message) {
			
			try {
				message.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("NOtified   " +Thread.currentThread().getName());
			System.out.println(message.getMessage());
		}
		
		
	}

}
