import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            System.out.println(arr[i]);
        }
        // Exercise 1
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Exercise 2
        int max = 100_000;
        int min = 200_000;
        for (int i : arr) {
            if (i >= max) {
                max = i;
            } else if (i < min) {
                min = i;
                }
            }
        System.out.println("Минимальная сумма трат за день составила "+ min + " рублей. Максимальная сумма трат за день составила " + max +" рублей");

        // Exercise 3

        double averageCosts = sum / arr.length;

        System.out.println("Средняя сумма трат за месяц составила " + averageCosts + " рублей");

        // Exercise 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print (reverseFullName[i]);
        }

    }

    }