package Arrays_Exercise_03;

import java.util.Scanner;

public class Common_Elements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                if (first[i].equals(second[j])) {
                    System.out.print(first[i] + " ");
                }
            }
        }
    }
}
