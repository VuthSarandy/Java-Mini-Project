package co.cstad.option;

public class First {
    public static int firstPageFunction(int currentPage, int rowsPerPage) {
        if (currentPage == 1) {
            System.out.println("You are already on the first page.");
        } else {
            currentPage = 1;
            Display.displayFunction(currentPage, rowsPerPage);
        }
        return  currentPage;
    }
}
