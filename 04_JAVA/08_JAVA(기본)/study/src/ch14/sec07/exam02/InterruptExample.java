package ch14.sec07.exam02;

public class InterruptExample {
    public static void main(String[] args) {
        Thread thread = new PrintThread();
        thread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        // interrupt() 메소드 호충
        thread.interrupt();
    }
}
