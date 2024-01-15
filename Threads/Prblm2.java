/*Write multithreaded program that continuously prints the strings “ping” and
“PONG” in the console at random distances at intervals of one second. Use two
threads one for “ping” and another for “PONG”.*/

import java.util.Random;
class PingPong {
	int c;
	boolean mySwitch;

	PingPong() {
		c = 0;
		mySwitch = true;
	}

	synchronized void ping() {
		if (!mySwitch)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.print("ping");
		c += 4;
		for (int i = 0; i < new Random().nextInt(100); i++) {
			System.out.print(" "); 					// prints random no. of space
			c++; 									// increasing character c
			if (c >= 100) { 						// wraps if character c is more than 100
				System.out.println();
				c = 0;
			}
		}
		mySwitch = false;
		notify();
	}

	synchronized void pong() {
		if (mySwitch)
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.print("PONG");
		c += 4;
		for (int i = 0; i < new Random().nextInt(100); i++) {
			System.out.print(" "); 					// prints random no. of space
			c++; 									// increasing character c
			if (c >= 100) { 						// wraps if character c is more than 100
				System.out.println();
				c = 0;
			}
		}
		mySwitch = true;
		notify();
	}
}

class Ping extends Thread {
	PingPong p;

	public Ping(PingPong p) {
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			p.ping();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Pong extends Thread {
	PingPong p;

	public Pong(PingPong p) {
		this.p = p;
	}

	@Override
	public void run() {
		while (true) {
			p.pong();
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Prblm2 {
	public static void main(String[] args) {
		PingPong p = new PingPong();

		new Ping(p).start();
		new Pong(p).start();
	}
}
