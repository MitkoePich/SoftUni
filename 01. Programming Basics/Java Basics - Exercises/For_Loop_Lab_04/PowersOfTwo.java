package For_Loop_Lab_04;

import java.util.Scanner;

public class PowersOfTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int num = 1;

        for (int i = 0; i <=  n; i++) {
            System.out.println(num);
            num *= 2;
        }
    }
}