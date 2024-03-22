import product.Notebook;
import product.Phone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        mainMenuAction(scanner);

    }

    public static void mainMenuAction(Scanner scanner){
        System.out.println("""
                Welcome to the store. Please select an action.
                1. List products
                2. Add new product
                3. Remove existing product
                4. List brands
                5. Exit
                """);

        switch (scanner.nextInt()) {
            case 1:
                listProductsAction(scanner);
                break;
            case 2:
                addProductAction(scanner);
                break;
            case 3:
                //TODO: removeProductAction(scanner);
                break;
            case 4:
                //TODO: listBrandsAction(scanner);
                break;
            case 5:
                System.exit(0);
                break;
            default:
        }
    }

    public static void listProductsAction(Scanner scanner) {
        System.out.println("""
                Please select an action.
                1. List notebooks
                2. List phones
                3. Back to main menu
                """);
        switch (scanner.nextInt()) {
            case 1:
                Store.listNotebooks();
                listProductsAction(scanner);
                break;
            case 2:
                Store.listPhones();
                listProductsAction(scanner);
                break;
            case 3:
                mainMenuAction(scanner);
                break;
        }
    }

    private static void addProductAction(Scanner scanner) {
        System.out.println("""
                Select a category to add a product.
                1. Notebook
                2. Phone
                3. Back to main menu
                """);
        switch (scanner.nextInt()){
            case 1:
                Store.addProduct(new Notebook());
                //TODO: get notebook field values from stdin
                break;
            case 2:
                Store.addProduct(new Phone());
                //TODO: get phone field values from stdin
                break;
            case 3:
                mainMenuAction(scanner);
                break;
        }
    }
}
