package lessons.lesson01.task_02;

public class Main {
    // Есть счетчик(целочисленный)
    // Задача - увеличить счетчик на единицу 1_000_000 раз в цикле
    // вывести в консоль значение счетчика

    public static int counter;


    public static void main(String[] args) {


        for (int i = 0; i < 1_000_000; i++) {
            counter++;
        }

        System.out.println("Значение счетчика - " + counter);
    }
}
