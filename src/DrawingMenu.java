import java.util.Scanner;

//// Cach 1:
//public class DrawingMenu {
//    public static void main(String[] args) {
//        menu();
//        int choice;
//        Scanner input = new Scanner(System.in);
//        choice = input.nextInt();
//
//        if (choice == 1) {
//            System.out.println("Draw the triangle:");
//            System.out.println("******");
//            System.out.println("*****");
//            System.out.println("****");
//            System.out.println("***");
//            System.out.println("**");
//            System.out.println("*");
//            menu();
//        } else if (choice == 2) {
//            System.out.println("Draw the square:");
//            System.out.println("* * * * * *");
//            System.out.println("* * * * * *");
//            System.out.println("* * * * * *");
//            System.out.println("* * * * * *");
//            System.out.println("* * * * * *");
//            menu();
//        } else if (choice == 3) {
//            System.out.println("Draw the rectangle:");
//            System.out.println("* * * * * *");
//            System.out.println("* * * * * *");
//            System.out.println("* * * * * *");
//            menu();
//        } else if (choice == 0) {
//            System.exit(0);
//            menu();
//        } else {
//            System.out.println("Error Choice, please choose one!");
//            menu();
//        }
//    }
//
//    public static void menu() {
//        System.out.println("Menu:");
//        System.out.println("1. Draw the triangle");
//        System.out.println("2. Draw the square");
//        System.out.println("3. Draw the rectangle");
//        System.out.println("0. Exit");
//        System.out.println("Enter your choice: ");
//    }
//}

// Cach 2:
public class DrawingMenu {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);

        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Draw the triangle:");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square:");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle:");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
