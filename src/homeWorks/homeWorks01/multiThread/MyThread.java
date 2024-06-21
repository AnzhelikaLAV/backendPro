package homeWorks.homeWorks01.multiThread;

class MyThread extends Thread {
    private static int counter = 0; // Статический счетчик для всех потоков
    private int start;
    private int end;

    public MyThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public static synchronized void incrementCounter() {

        counter++;
    }

    public static int getCounter() {

        return counter;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 21 == 0 && String.valueOf(i).contains("3")) {
                incrementCounter(); // Увеличение счетчика синхронизировано
            }
        }
    }
}

