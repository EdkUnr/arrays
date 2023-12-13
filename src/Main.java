public class Main {
    public static void main(String[] args) {
        task1(); //Задача 1
        task2(); //Задача 2
        task3(); //Задача 3
        correctFullNameTask(); //Задача 4
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int total = 0;
        for (int payment : arr) {
            total += payment;
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int payment : arr) {
            if (payment < min) {
                min = payment;
            }
            if (payment > max) {
                max = payment;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        double total = 0;
        for (int payment : arr) {
            total += payment;
        }
        double average = total / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
    }

    public static void correctFullNameTask() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.print("Исправленное полное имя: ");
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }
}
// Каждый раз борьба с загрузкой в Git.
// Очередная попытка сделать pullRequest