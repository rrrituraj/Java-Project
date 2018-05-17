package com.tcs.threading;
/**
 * It demonstrate the wait and notify method functionality of thread
 * @author RITURAJ
 *
 */

public class ThreadDemo18 {
/**
 * explaining about the inter thread communication 
 * @param args
 * @throws InterruptedException
 */
	public static void main(String[] args) throws InterruptedException {
		Mythread14 t = new Mythread14();
		t.start();
		//Thread.sleep(1000); main thread would wait forever, please don't do this
		synchronized (t) {
			/**
			 * wait should be in sync block
			 */
			System.out.println("Main Thread Entering into waiting state");
			t.wait();
			System.out.println("Main Thread out of waiting state");
			System.out.println(t.total);
		}

	}

}
