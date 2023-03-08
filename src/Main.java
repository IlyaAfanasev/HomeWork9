public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int max = 0;
        int min = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) ;
            {
                min = arr[i];
            }
        }
        System.out.println("Максимальная сумма трат за день составила-" + max + " рублей");
        System.out.println("Минимальная сумма трат за день составила-" + min + " рублей");
    }
}