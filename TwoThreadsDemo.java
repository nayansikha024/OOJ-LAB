class CollegeThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("BMS College of Engineering");
                Thread.sleep(10000); // 10 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("CollegeThread interrupted");
        }
    }
}

class CSEThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("CSE");
                Thread.sleep(2000); // 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("CSEThread interrupted");
        }
    }
}

public class TwoThreadsDemo {
    public static void main(String[] args) {
        CollegeThread t1 = new CollegeThread();
        CSEThread t2 = new CSEThread();

        t1.start();  // Start first thread
        t2.start();  // Start second thread
    }
}