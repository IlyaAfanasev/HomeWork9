import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("     Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила-" + sum + " рублей");
    }

    public static void task2() {
        System.out.println("     Задача 2");
        int[] arr = generateRandomArray();
        int max = arr[0];
        int min = arr[0];
        for (int i :arr) {
            if (max < i) {
                max = i;
            }
            if (min > i) ;
            {
                min = i;
            }
        }
        System.out.println("Максимальная сумма трат за день составила-" + max + " рублей");
        System.out.println("Минимальная сумма трат за день составила-" + min + " рублей");
    }

    public static void task3() {
        System.out.println("     Задача 3");
        int[] arr = generateRandomArray();
        double sum = 0;
        double averageSum;
        for (int i: arr) {
            sum += i;
        }
        averageSum = sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила-%.2f рублей%n", averageSum);
    }

    public static void task4() {
        System.out.println("     Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int i = reverseFullName.length - 1;
        for (; i >= 0; i--) {
            System.out.print(reverseFullName[i]);

        }

    }
}