package co.cstad.option;

public class Last {
    public static Integer lastFunction(int currentPage, int rowsPerPage) {
        int totalPages = (int) Math.ceil((double) Write.stockManagementSystemArrayList.size() / rowsPerPage);
        if (currentPage == totalPages) {
            System.out.println("You are already on the last page.");
        } else {
            currentPage = totalPages;
            Display.displayFunction(currentPage, rowsPerPage);
        }
        return currentPage;
    }
}
