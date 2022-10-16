public class Main {

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int costs : arr) {
            sum += costs;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
        System.out.println("Задание 2");
        int[] arr1 = generateRandomArray();
        int min = arr1[0];
        int max = arr1[0];
        for (int costs : arr1) {
            if (costs < min) {
                min = costs;
            } else if (costs > max) {
                max = costs;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        System.out.println();
        System.out.println("Задание 3");
        int[] arr2 = generateRandomArray();
        int sum1 = 0;
        double averageCost = sum1 / 30;
        for (int costs : arr) {
            sum1 += costs;
            averageCost = sum1 / 30;
        }
        System.out.println("Средняя сумма трат за месяц составила " + averageCost + " рублей");
    }

}