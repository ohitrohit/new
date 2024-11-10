package run;

public class Delay {

    public void customSleep(long milliseconds) throws InterruptedException {
        long endTime = System.currentTimeMillis() + milliseconds;
        while (System.currentTimeMillis() < endTime) {
            Thread.sleep(1000); // Sleep in 1-second increments to allow for interruption.
        }
    }

    public static void main(String[] args) {
        Delay delay = new Delay(); // Create an instance of Delay
        try {
            delay.customSleep(100000); // 10 seconds delay
            System.out.println("Waited for 10 seconds");
        } catch (InterruptedException e) {
            System.out.println("Sleep was interrupted");
        }
    }
}
