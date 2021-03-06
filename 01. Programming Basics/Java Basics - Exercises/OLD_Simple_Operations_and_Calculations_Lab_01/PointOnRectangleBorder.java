package OLD_Simple_Operations_and_Calculations_Lab_01;

import java.util.Scanner;

public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());

        boolean isOnLeftSide = (x == x1 && y >= y1 && y <= y2);
        boolean isOnRightSide = (x == x2 && y >= y1 && y <= y2);
        boolean isOnUpSide = (y == y1 && x >= x1 && x <= x2);
        boolean isOnDownSide = (y == y2 && x >= x1 && x <= x2);

        if (isOnLeftSide || isOnRightSide || isOnDownSide || isOnUpSide) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
