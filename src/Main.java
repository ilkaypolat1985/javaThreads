public class Main {

    public static void main(String[] args) {
        Chronometer chronometerThread1 = new Chronometer("Thread1");
        Chronometer chronometerThread2 = new Chronometer("Thread2");
        Chronometer chronometerThread3 = new Chronometer("Thread3");

        chronometerThread1.start();
        chronometerThread2.start();
        chronometerThread3.start();
    }
}
