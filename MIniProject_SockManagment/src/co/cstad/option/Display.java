package co.cstad.option;

import co.cstad.StockManagementSystem.StockManagementSystem;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.Table;

public class Display {
    public static int currentPage = 1;
    public static int rowsPerPage = 2;

    public static void displayFunction(int currentPage, int rowsPerPage) {
        int productList = Write.stockManagementSystemArrayList.size();
        int start = (currentPage - 1) * rowsPerPage;
        int end = Math.min(start + rowsPerPage, productList);
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE);
        table.addCell("ID");
        table.addCell("Name");
        table.addCell("Unit Price");
        table.addCell("Qty");
        table.addCell("Imported Date");
        for (int i = start; i < end; i++) {
            StockManagementSystem stockManagementSystem = Write.stockManagementSystemArrayList.get(i);
            table.addCell(String.valueOf(stockManagementSystem.getId()));
            table.addCell(String.valueOf(stockManagementSystem.getName()));
            table.addCell(String.valueOf(stockManagementSystem.getUnitPrice()));
            table.addCell(String.valueOf(stockManagementSystem.getQty()));
            table.addCell(String.valueOf(stockManagementSystem.getDate()));
        }
        System.out.println(table.render());
        System.out.println("O" + "~".repeat(70) + "0");
        int totalPages = (int) Math.ceil((double) productList / rowsPerPage);
        System.out.println("Page " + currentPage + " of " + totalPages + " ".repeat(40) + "Total records : " + productList);
        System.out.println("O" + "~".repeat(70) + "0");
    }

}
