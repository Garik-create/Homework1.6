
public class Main {
    public static void main(String[] args) {


        // task 1
        int sumInMonths = 0;
        for (int i = 0; i < arr.length; i++) {
            sumInMonths += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\nСумма трат за месяц составила " + sumInMonths + " рублей.");
// task 2
        int minSumInDay = sumInMonths;
        int maxSumInDay = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSumInDay) {
                minSumInDay = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSumInDay + " рублей.");
        for (int j : arr) {
            if (j > maxSumInDay) {
                maxSumInDay = j;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSumInDay + " рублей.");

// task 3
        float avgInDay;
        avgInDay = (float) sumInMonths / arr.length;
        System.out.println("Средняя сумма трат в день за месяц составила " + avgInDay + " рублей.");

        // task 4
        System.out.println();
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}