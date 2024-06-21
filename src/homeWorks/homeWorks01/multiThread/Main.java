package homeWorks.homeWorks01.multiThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int start = 1;
        int end = 2_000_000;
        int middlePoint = (start + end) / 2;


        MyThread thread1 = new MyThread(start, middlePoint);
        MyThread thread2 = new MyThread(middlePoint + 1, end);


        thread1.start();
        thread2.start();

        // Ожидание завершения потоков
        thread1.join();
        thread2.join();

        // Получение общего количества чисел
        int totalCount = MyThread.getCounter();
        System.out.println("Количество чисел,делящихся на 21 и содержащих цифру 3: " + totalCount);
    }
}


