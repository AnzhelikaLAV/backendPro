package homeWorks.homeWorks01.singeThread;

//Дан диапазон чисел: от 1 до 2_000_000 включительно.

//Задача: найти, сколько чисел из этого диапазона делятся нацело на 21 и при этом содержат цифру 3.

//Решить данную задачу в один поток.
//Решить данную задачу в два потока, разделив между потоками заданный диапазон чисел.
//Сравнить результаты двух решений - они должны совпадать.


public class Main {

    public static void main(String[] args) {
        int start = 1;
        int end = 2_000_000;
        int count = 0;

        for (int i = start; i <= end; i++) {
            if (i % 21 == 0 && String.valueOf(i).contains("3")) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("Количество чисел, делящихся на 21 и содержащих цифру 3: " + count);
    }
}
