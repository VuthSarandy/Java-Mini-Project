package co.cstad.option;

import java.util.Scanner;

public class Goto {
    public static int gotoFunction(int currentPage, int rowsPerPage) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the page number you want to go to: ");

        int targetPage = scanner.nextInt();
        int totalPages = (int) Math.ceil((double) Write.stockManagementSystemArrayList.size() / rowsPerPage);

        if (targetPage >= 1 && targetPage <= totalPages) {
            currentPage = targetPage;
            Display.displayFunction( currentPage, rowsPerPage);
        } else {
            System.out.println("Invalid page number. Please enter a page number between 1 and " + totalPages + ".");
        }
        return currentPage;
    }
}
