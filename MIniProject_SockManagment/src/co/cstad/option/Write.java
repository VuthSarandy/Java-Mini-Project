package co.cstad.option;

import co.cstad.StockManagementSystem.StockManagementSystem;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.time.LocalDate;
import java.util.*;

public class Write {

    static List<StockManagementSystem> stockManagementSystemArrayList = new ArrayList<>();
    static StockManagementSystem stockManagementSystem = new StockManagementSystem();
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void writeFunction() {
        int randomNumber = random.nextInt(20) + 1;
        stockManagementSystem.setDate(LocalDate.now());
        Integer proID = stockManagementSystem.setId(randomNumber);
        System.out.println("Product ID : " + proID);
        System.out.print("Product's name : ");
        String proName = stockManagementSystem.setName(scanner.next());
        System.out.print("Product's Price : ");
        Integer proPrice = stockManagementSystem.setUnitPrice(scanner.nextInt());
        System.out.print("Product's Qty : ");
        Integer proQty = stockManagementSystem.setQty(scanner.nextInt());
        addItem(new StockManagementSystem(proID, proName, proPrice, proQty, LocalDate.now()));
        Table table = getTable();
        System.out.println(table.render());
        System.out.print("Are you sure want to add this record? [Y/y] or [N/n]: ");
        String userInput = scanner.next();
        if (userInput.equals("Y") || Objects.equals(userInput, "y")) {
            System.out.println("~".repeat(30));
            System.out.println(stockManagementSystem.getId() + " was added sucessfully ");
            System.out.println("~".repeat(30));
        } else if (userInput.equals("N") || Objects.equals(userInput, "n")) {
            removeItem(stockManagementSystem);
            System.out.println("Product is not added");
        }
    }

    private static Table getTable() {
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE, ShownBorders.SURROUND);
        table.addCell("ID" + " ".repeat(20) + ": " + stockManagementSystem.getId());
        table.addCell("Name" + " ".repeat(18) + ": " + stockManagementSystem.getName());
        table.addCell("Unit Price" + " ".repeat(12) + ": " + stockManagementSystem.getUnitPrice());
        table.addCell("Qty" + " ".repeat(19) + ": " + stockManagementSystem.getQty());
        table.addCell("Imported Date" + " ".repeat(9) + ": " + stockManagementSystem.getDate());
        return table;
    }
    public static void addItem(StockManagementSystem stockManagementSystem) {
        stockManagementSystemArrayList.add(stockManagementSystem);
    }

    public static void removeItem(StockManagementSystem stockManagementSystem) {
        stockManagementSystemArrayList.remove(stockManagementSystem);
    }
}


