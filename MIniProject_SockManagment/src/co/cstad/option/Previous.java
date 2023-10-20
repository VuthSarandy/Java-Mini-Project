package co.cstad.option;

public class Previous {
    public static int previousFunction(int currentPage, int rowsPerPage) {
        if (currentPage > 1) {
            currentPage--;
            Display.displayFunction(currentPage, rowsPerPage);
        } else {
            System.out.println("You are already on the first page.");
        }
        return currentPage;
    }
}
