import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        mainMenu(scanner);

    }

    public static void mainMenu(Scanner scanner) {
        System.out.println("""
                Welcome to the store. Please select an action.
                1. List products
                2. Add new product
                3. Find product with known ID
                4. Remove product
                5. List brands
                6. Exit
                """);
        switch (scanner.nextInt()) {
            case 1:
                listProductsMenu(scanner);
                break;
            case 2:
                addProductMenu(scanner);
                break;
            case 3:
                System.out.print("Enter ID to find product: ");
                Store.filterProductByID(scanner.nextInt());
                mainMenu(scanner);
                break;
            case 4:
                System.out.print("Enter ID of the product which you want to remove from the store: ");
                Store.removeProduct(scanner.nextInt());
                break;
            case 5:
                Store.showListOfBrands();
                break;
            case 6:
                System.exit(0);
                break;
            default:
        }
    }

    public static void listProductsMenu(Scanner scanner) {
        System.out.println("""
                Please select an action.
                1. List notebooks
                2. List phones
                3. List products by brand
                4. Back to main menu
                """);
        switch (scanner.nextInt()) {
            case 1:
                Store.showListOfNotebooks();
                listProductsMenu(scanner);
                break;
            case 2:
                Store.showListOfPhones();
                listProductsMenu(scanner);
                break;
            case 3:
                System.out.println("Choose brand name to list all devices.");
                System.out.print("Brand name: ");
                Store.filterProductsByBrand(scanner.next());
                listProductsMenu(scanner);
            case 4:
                mainMenu(scanner);
                break;
        }
    }

    private static void addProductMenu(Scanner scanner) {
        System.out.println("""
                Select a category to add a product.
                1. Notebook
                2. Phone
                3. Back to main menu
                """);
        switch (scanner.nextInt()) {
            case 1:
                Notebook notebook = new Notebook();
                System.out.println("Please provide necessary fields for the notebook");
                System.out.print("Brand: ");
                notebook.setBrand(scanner.next());
                System.out.print("Name (no white spaces!!!): ");
                notebook.setName(scanner.next());
                System.out.print("Price ($): ");
                notebook.setPrice(scanner.nextInt());
                System.out.print("Stocks (pieces): ");
                notebook.setStocks(scanner.nextInt());
                System.out.print("Discount (%): ");
                notebook.setDiscount(scanner.nextInt());
                System.out.print("Memory (GB): ");
                notebook.setMemory(scanner.nextInt());
                System.out.print("ram (GB): ");
                notebook.setRam(scanner.nextInt());
                System.out.print("screensize (inches): ");
                notebook.setScreenSize(scanner.nextDouble());
                Store.addProduct(notebook);
                System.out.println("New notebook saved.");
                System.out.println();
                addProductMenu(scanner);
                break;
            case 2:
                Phone phone = new Phone();
                System.out.println("Please provide necessary fields for the phone");
                System.out.print("Brand: ");
                phone.setBrand(scanner.next());
                System.out.print("Name (no white spaces!!!): ");
                phone.setName(scanner.next());
                System.out.print("Color: ");
                phone.setColor(scanner.next());
                System.out.print("Price ($): ");
                phone.setPrice(scanner.nextInt());
                System.out.print("Stocks (pieces): ");
                phone.setStocks(scanner.nextInt());
                System.out.print("Discount (%): ");
                phone.setDiscount(scanner.nextInt());
                System.out.print("Battery (mah): ");
                phone.setBattery(scanner.nextInt());
                System.out.print("Memory (GB): ");
                phone.setMemory(scanner.nextInt());
                System.out.print("ram (GB): ");
                phone.setRam(scanner.nextInt());
                System.out.print("screensize (inches): ");
                phone.setScreenSize(scanner.nextDouble());
                Store.addProduct(phone);
                System.out.println("New phone saved.");
                System.out.println();
                addProductMenu(scanner);
                break;
            case 3:
                mainMenu(scanner);
                break;
        }
    }
}
