package co.cstad.option;

import co.cstad.StockManagementSystem.StockManagementSystem;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.time.LocalDate;
import java.util.Scanner;

public class Update {
    public static void updateFunction() {
        Scanner sc = new Scanner(System.in);
        boolean isFound = false;
        try {
            System.out.print("Enter ID to update : ");
            Integer idToUpdate = Integer.parseInt(sc.nextLine());
            for (StockManagementSystem stockManagementSystem : Write.stockManagementSystemArrayList) {
                if (stockManagementSystem.getId().equals(idToUpdate)) {
                    Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND);
                    table.addCell(" ID            : " + idToUpdate + " ".repeat(10));
                    table.addCell(" Name          : " + stockManagementSystem.getName() + " ".repeat(10));
                    table.addCell(" Unit price    : " + stockManagementSystem.getUnitPrice() + " ".repeat(10));
                    table.addCell(" Qty           : " + stockManagementSystem.getQty() + " ".repeat(10));
                    table.addCell(" Imported Date : " + LocalDate.now() + " ".repeat(10));
                    System.out.println(table.render());
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                System.out.println("Product with ID : " + idToUpdate + " is not found");
            }
            StockManagementSystem productToUpdate = null;

            for (StockManagementSystem product : Write.stockManagementSystemArrayList) {
                if (product.getId().equals(idToUpdate)) {
                    productToUpdate = product;
                    isFound = true;
                    break;
                }
            }

            if (!isFound) {
                System.out.println("Product with ID: " + idToUpdate + " is not found");
                return;
            }
            StockManagementSystem product = productToUpdate;

            System.out.println("What do you want to update?");
            Table tableToUpdate = new Table(5, BorderStyle.UNICODE_ROUND_BOX, ShownBorders.SURROUND);
            tableToUpdate.addCell(" ".repeat(2) + "1. All" + " ".repeat(2));
            tableToUpdate.addCell(" ".repeat(2) + "2. Name" + " ".repeat(2));
            tableToUpdate.addCell(" ".repeat(2) + "3. Quantity" + " ".repeat(2));
            tableToUpdate.addCell(" ".repeat(2) + "4. Price" + " ".repeat(2));
            tableToUpdate.addCell(" ".repeat(2) + "5. Back to menu" + " ".repeat(2));
            System.out.println(tableToUpdate.render());
            try {
                System.out.print("Choose option (1-5) : ");
                int op = Integer.parseInt(sc.nextLine());
                switch (op) {
                    case 1 -> {
                        try {
                            System.out.print("Enter new product name: ");
                            String newProductName = sc.nextLine();
                            System.out.print("Enter new quantity: ");
                            Integer newQuantity = Integer.parseInt(sc.nextLine());
                            System.out.print("Enter new price: ");
                            Integer newPrice = Integer.parseInt(sc.nextLine());

                            product.setName(newProductName);
                            product.setQty(newQuantity);
                            product.setUnitPrice(newPrice);

                            Table updatedTable = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND);
                            updatedTable.addCell(" ID            : " + idToUpdate + " ".repeat(10));
                            updatedTable.addCell(" Name          : " + newProductName + " ".repeat(10));
                            updatedTable.addCell(" Unit price    : " + newPrice + " ".repeat(10));
                            updatedTable.addCell(" Qty           : " + newQuantity + " ".repeat(10));
                            updatedTable.addCell(" Imported Date : " + LocalDate.now() + " ".repeat(10));
                            System.out.println(updatedTable.render());

                            System.out.print("Are you sure to add this record? [Y/y] or [N/n] : ");
                            String options = sc.nextLine();
                            switch (options) {
                                case "y", "Y" -> {
                                    Write.stockManagementSystemArrayList.add(productToUpdate);
                                    System.out.println("Product added successfully.");
                                }
                                case "n", "N" -> System.out.println("Product is not added");
                                default -> System.out.println("Invalid options.");
                            }
                        } catch (Exception exception) {
                            System.out.println(exception.getMessage());
                        }
                    }


                    case 2 -> {
                        try {
                            System.out.println("Enter new product name : ");
                            String newProductName = sc.nextLine();
                            product.setName(newProductName);
                            Table updatedTable = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND);
                            updatedTable.addCell(" ID            : " + idToUpdate + " ".repeat(10));
                            updatedTable.addCell(" Name          : " + newProductName + " ".repeat(10));
                            updatedTable.addCell(" Unit price    : " + product.getUnitPrice()
                                    + " ".repeat(10));
                            updatedTable.addCell(" Qty           : " + product.getQty() + " ".repeat(10));
                            updatedTable.addCell(" Imported Date : " + LocalDate.now() + " ".repeat(10));
                            System.out.println(updatedTable.render());
                            System.out.print("Are you sure to add this record? [Y/y] or [N/n] : ");
                            String options = sc.nextLine();
                            switch (options) {
                                case "y", "Y" -> {
                                    Write.stockManagementSystemArrayList.add(productToUpdate);
                                    System.out.println("Product added successfully.");
                                }
                                case "n", "N" -> System.out.println("Product is not added");
                                default -> System.out.println("Invalid options.");
                            }
                        } catch (Exception exception) {
                            System.out.println(exception.getMessage());
                        }
                    }
                    case 3 -> {
                        try {
                            System.out.println("Enter new product Price : ");
                            Integer newProductPrice = Integer.parseInt(sc.nextLine());
                            product.setUnitPrice(newProductPrice);
                            Table updatedTable = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND);
                            updatedTable.addCell(" ID            : " + idToUpdate + " ".repeat(10));
                            updatedTable.addCell(" Name          : " + product.getName() + " ".repeat(10));
                            updatedTable.addCell(" Unit price    : " + newProductPrice + " ".repeat(10));
                            updatedTable.addCell(" Qty           : " + product.getQty() + " ".repeat(10));
                            updatedTable.addCell(" Imported Date : " + LocalDate.now() + " ".repeat(10));
                            System.out.println(updatedTable.render());
                            System.out.print("Are you sure to add this record? [Y/y] or [N/n] : ");
                            String options = sc.nextLine();
                            switch (options) {
                                case "y", "Y" -> {
                                    Write.stockManagementSystemArrayList.add(productToUpdate);
                                    System.out.println("Product added successfully.");
                                }
                                case "n", "N" -> System.out.println("Product is not added");
                                default -> System.out.println("Invalid options.");
                            }
                        } catch (Exception exception) {
                            System.out.println(exception.getMessage());
                        }
                    }
                    case 4 -> {
                        try {
                            System.out.println("Enter new product Price : ");
                            Integer newProductQty = Integer.parseInt(sc.nextLine());
                            product.setQty(newProductQty);
                            Table updatedTable = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER, ShownBorders.SURROUND);
                            updatedTable.addCell(" ID            : " + idToUpdate + " ".repeat(10));
                            updatedTable.addCell(" Name          : " + product.getName() + " ".repeat(10));
                            updatedTable.addCell(" Unit price    : " + product.getUnitPrice() + " ".repeat(10));
                            updatedTable.addCell(" Qty           : " + newProductQty + " ".repeat(10));
                            updatedTable.addCell(" Imported Date : " + LocalDate.now() + " ".repeat(10));
                            System.out.println(updatedTable.render());
                            System.out.print("Are you sure to add this record? [Y/y] or [N/n] : ");
                            String options = sc.nextLine();
                            switch (options) {
                                case "y", "Y" -> {
                                    Write.stockManagementSystemArrayList.add(productToUpdate);
                                    System.out.println("Product added successfully.");
                                }
                                case "n", "N" -> System.out.println("Product is not added");
                                default -> System.out.println("Invalid options.");
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    case 5 -> System.out.println("Back to menu : ");
                    default -> throw new IllegalStateException("Unexpected value: " + op);
                }


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }
}
