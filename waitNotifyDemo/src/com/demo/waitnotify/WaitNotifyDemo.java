package com.demo.waitnotify;

public class WaitNotifyDemo {
	
	public static void main(String[] args) {
	
		Message message = new Message();
		Notifier notifier = new Notifier(message);
		Waiter waiter = new Waiter(message);
		new Thread(waiter, "Waiter 1").start();
		new Thread(waiter , "Waiter 2").start();
		new Thread(notifier, "Notifier").start();	
	}
}



