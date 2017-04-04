package com.tcs.threading;

class MyThread9 extends Thread{
	public void run(){
		for (int i = 0; i < 10; i++) {
			System.out.println("Kamal Garg");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			} 
		}
	}
}
public class ThreadDemo9 {

	public static void main(String[] args) throws InterruptedException {
		MyThread9 t = new MyThread9();
		t.start();
		t.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Rituraj Gupta");
		}

	}

}
