package lessons.lesson01.task_03;

public class Main {
    // Есть счетчик, сначала его значение равно 0.
    // Есть З потока. Каждый поток в цикле должен увеличить миллион раз значение счетчика на единицу
    // Вывести значение счетчика в консоль
    public static int counter;

//    public static synchronized void increment() { // метод может выполняться одним потоком одновременно
//        counter++;
//    }

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();

        for (int i = 0; i < 1_000_000; i++) {
            counter++;
        }

        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Значение счетчика - " + counter);
    }
}
//считывание
//изменение
//запись