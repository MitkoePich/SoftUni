package Arrays_Lab_03;

import java.util.Scanner;

public class Reverse_Array_of_Strings_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayInput = scanner.nextLine().split(" ");

        for (int i = arrayInput.length - 1; i >= 0; i--) {
            System.out.print(arrayInput[i] + " ");
        }
    }
}

        /*for (int i = 0; i <arrayInput.length / 2; i++) {
        String helpValue = arrayInput[i];
        arrayInput[i] = arrayInput[arrayInput.length - 1 - i];
        arrayInput[arrayInput.length - 1 - i] = helpValue;
        }

        for (int i = 0; i < arrayInput.length; i++) {
        System.out.print(arrayInput[i] + " ");
        }*/
