package Arrays_Exercise_03;

import java.util.Arrays;
import java.util.Scanner;

public class Equal_Sums_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            int rightSum = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("no");
    }
}
