package Basic_Syntax_Conditional_Statements_and_Loops_More_Exercise_01;

import java.util.Scanner;

public class Reverse_String_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println((new StringBuilder(scanner.nextLine())).reverse().toString());
    }
}
