package lessons.lesson01.task_01;

public class Main {

    public static void main(String[] args) {
        //Два способа создания потоков Java
        //1. Наследуемся от класса Thread
        //2. Реализуем интерфейс Runnable

        MyThread1 myThread1 = new MyThread1();//создаем объект
        MyThread2 myThread2 = new MyThread2();


        //        myThread1.run();
        //        myThread2.run();
        //1. Для запуска кода в отдельном потоке мы вызываем метод старт у объекта нашего класса, который наследуется от Thread
        myThread1.start();//метод старт создает второй поток и в этом втором потоке вызывает метод run(вызывается под капотом метода старт)

        //2. Для запуска кода в отдельном потоке мы создаем объект класса Thread, передавая ему в конструктор объект нашего класса, реализующего Runnable.
        //А потом метод старт вызываем у объекта Thread
        Thread thread = new Thread(myThread2);
        thread.setDaemon(true); //не важные процессы, часы наприм. он должен завершиться тогда, когда завершаться все остальные потоки
        thread.start();


        for (int i = 0; i < 10; i++) {

            //навести на ошибку sleep, выбрать more actions и выбрать surround with try catch
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
           // System.out.println("Main thread: " + i);
            System.out.println(Thread.currentThread().getName() + " " + i);

        }
    }
}
