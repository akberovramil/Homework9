public class Main {
    public static void main(String[] args) {
        //Задание 1
        int[] accountingBook = generateRandomArray();
        int total = 0;


        for (int i = 0; i <= accountingBook.length - 1; i++) {
            total = total + accountingBook[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");
        //Задание 2
        int maxValue = 1;
        int minValue = 202_000;
        for (int i = 0; i < accountingBook.length - 1; i++) {

            if (accountingBook[i] > maxValue) {
                maxValue = accountingBook[i];
            }
        }
        for (int i1 = 0; i1 < accountingBook.length - 1; i1++) {
            if (minValue > accountingBook[i1]) {
                minValue = accountingBook[i1];
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + minValue + " рублей. Максимальная сумма трат за день составила " + maxValue + " рублей");
        //Задание 3
        double averageNumber = 0;
        averageNumber = (double) total / 30;
        System.out.printf("Средняя сумма трат за день составила %.2f рублей", averageNumber);
        System.out.println(" ");
        //Задание 4
        char[] reserveFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reserveFullName.length - 1; i >= 0; i--) {

            System.out.print(reserveFullName[i]);
        }

    }

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}

