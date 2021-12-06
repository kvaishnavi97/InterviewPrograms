package io.programs;

class Printer implements Runnable {
	static int counter = 1;
	int remainder;
	static Object lock = new Object();

	public Printer(int remainder) {
		this.remainder = remainder;
	}

	public void printer() {
		System.out.println(Thread.currentThread().getName() + " " + counter++);
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			synchronized (lock) {
				while (counter % 2 != remainder)
					try {
						lock.wait();
					} catch (Exception e) {
						e.printStackTrace();
					}
				printer();
				lock.notifyAll();

			}
		}

	}
}

public class PrintingOddAndEvenNumber {

	public static void main(String[] args) {

		Printer evenObject = new Printer(0);
		Printer oddObject = new Printer(1);

		Thread evenThread = new Thread(evenObject,"Even Thread");
		Thread oddThread = new Thread(oddObject,"Odd Thread");

		evenThread.start();
		oddThread.start();
	}
}
