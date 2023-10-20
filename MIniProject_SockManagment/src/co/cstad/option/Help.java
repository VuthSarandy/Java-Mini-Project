package co.cstad.option;

public class Help {
    public static void helpFunction() {
        System.out.println("! 1." + " ".repeat(5) + "Press" + " ".repeat(5) + "* Display all record of products");
        System.out.println("! 2." + " ".repeat(5) + "Press" + " ".repeat(5) + "w: Add new product");
        System.out.println("! " + " ".repeat(17) + "w →#proname-unitprice-qty: sortcut for add new product!");
        System.out.println("! 3 " + " ".repeat(5) + "Press" + " ".repeat(5) + "r: read Content any content");
        System.out.println("! " + " ".repeat(17) + "r#proId : shortcut for read product by Id");
        System.out.println("! 4." + " ".repeat(5) + "Press" + " ".repeat(5) + "u: Update Data");
        System.out.println("! 5." + " ".repeat(5) + "Press" + " ".repeat(5) + "d: Delete Data");
        System.out.println("! " + " ".repeat(17) + "d#proId : shortcut for delete product by Id");
        System.out.println("! 6." + " ".repeat(5) + "Press" + " ".repeat(5) + "f: Display First Page");
        System.out.println("! 7." + " ".repeat(5) + "Press" + " ".repeat(5) + "p: Display Previous Page");
        System.out.println("! 8." + " ".repeat(5) + "Press" + " ".repeat(5) + "n: Display Next Pages");
        System.out.println("! 9." + " ".repeat(5) + "Press" + " ".repeat(5) + "l: Display last page");
        System.out.println("! 10." + " ".repeat(4) + "Press" + " ".repeat(5) + "s: Search products by name");
        System.out.println("! 11." + " ".repeat(4) + "Press" + " ".repeat(5) + "h: help");

    }
}
