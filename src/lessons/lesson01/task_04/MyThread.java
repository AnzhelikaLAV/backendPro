package lessons.lesson01.task_04;

public class MyThread extends Thread {
    @Override
    public void run() {

        for (int i = 0; i < 1_000_000; i++) {
            Main.increment();
        }
    }
}
