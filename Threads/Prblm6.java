package MyThreadsCodes;
/*
 * Suppose that two threads "t1" and "t2" access a shared integer "x". Thread "t1"
indefinitely increases "x" and "t2" indefinitely prints the value of "x". That is the threads
run in an infinite loop. However, thread "t1" must not increase "x" till that value of "x" is
printed by "t2" and "t2" must not print the same value of "x" more than once.
 */


class SharedX {
    int x=0;
    boolean flag = false;

    public synchronized void incrementX() throws InterruptedException {
        // Wait until t2 has printed the current value of x
        while (flag==false) {
            wait();
        }

        // Increment x and notify t2 that it can print the new value
        x++;
        flag = false;
        notify();
    }

    public synchronized void printX() throws InterruptedException {
        // Wait until t1 has incremented x
        while (flag==true) {
            wait();
        }

        // Print the value of x and notify t1 that it can increment x
        System.out.println("Value of x: " + x);
        flag = true;
        notify();
    }
}

class Thread1 extends Thread {
    SharedX x;

    public Thread1(SharedX x) {
        this.x = x;
    }

    @Override
    public void run() {
        try {
            while (true) {
                x.incrementX();
                sleep(1000);  // Simulate some work
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread2 extends Thread {
    SharedX x;

    public Thread2(SharedX x) {
        this.x = x;
    }

    @Override
    public void run() {
        try {
            while (true) {
                x.printX();
                sleep(1000);  // Simulate some work
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Prblm6 {
    public static void main(String[] args) {
        SharedX ob = new SharedX();

        Thread1 t1 = new Thread1(ob);
        Thread2 t2 = new Thread2(ob);

        t1.start();
        t2.start();
    }
}


/*
 * output:
Value of x: 0
Value of x: 1
Value of x: 2
Value of x: 3
Value of x: 4
Value of x: 5
Value of x: 6
Value of x: 7
Value of x: 8
Value of x: 9
Value of x: 10
Value of x: 11
Value of x: 12
Value of x: 13
Value of x: 14
Value of x: 15
Value of x: 16
Value of x: 17

 */
