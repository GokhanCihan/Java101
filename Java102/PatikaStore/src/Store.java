import java.util.*;

public class Store {
    private static ArrayList<Brand> brands = new ArrayList<>();
    private static ArrayList<Product> products = new ArrayList<>();

    static {
        brands.add(new Brand("Samsung"));
        brands.add(new Brand("Lenovo"));
        brands.add(new Brand("Apple"));
        brands.add(new Brand("Huawei"));
        brands.add(new Brand("Casper"));
        brands.add(new Brand("Asus"));
        brands.add(new Brand("HP"));
        brands.add(new Brand("Xiaomi"));
        brands.add(new Brand("Monster"));
    }

    public static void addBrand(String brandName) {
        brands.add(new Brand(brandName));
    }

    public static void addProduct(Product product) {
        products.add(product);
    }

    public static void showListOfNotebooks() {
        System.out.println("Notebooks:");
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("| ID | Product Name    | Brand     | Price     | Memory  | Screensize     | RAM       |");
        System.out.println("---------------------------------------------------------------------------------------");
        for (Notebook notebook : getNotebooks()) {
            System.out.format("| %-2d | %-15s | %-9s | %-7d $ | %-4d GB | %-11.1f in | %-6d GB |\n",
                    notebook.getId(), notebook.getName(), notebook.getBrand().getName(), notebook.getPrice(), notebook.getMemory(),
                    notebook.getScreenSize(), notebook.getRam());
        }
    }

    public static void showListOfPhones() {
        System.out.println("Phones:");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Product Name    | Brand     | Price     |  Color  |  Battery  | Memory  | Screensize     | RAM       |");
        System.out.println("-------------------------------------------------------------------------------------------------------------");
        for (Phone phone : getPhones()) {
            System.out.format("| %-2d | %-15s | %-9s | %-8d $| %-7s | %-6s mAh| %-5d GB| %-12.1f in| %-7d GB|\n",
                    phone.getId(), phone.getName(), phone.getBrand().getName(), phone.getPrice(), phone.getColor(),
                    phone.getBattery(), phone.getMemory(), phone.getScreenSize(), phone.getRam());
        }
    }

    public static void showListOfBrands(){
        for (Brand brand: getBrands()){
            System.out.println(brand.getName());
        }
    }
    public static void filterProductsByBrand(String brandName) {
        System.out.println("----- All devices with brand " + brandName + " -----");
        System.out.println("|   Device   | ID |      Name      |");
        for (Product product: products) {
            if (product.getBrand().getName().equalsIgnoreCase(brandName)) {
                System.out.format("| %-10s | %-2s | %-14s |\n",
                        product.getProductType(), product.getId(),product.getName());
            }
        }
    }

    public static void filterProductByID(int id) {
       for (Product product: products){
           if (product.getId() == id){
               System.out.println("-----------------------------------------------------");
               System.out.println("Found product: ");
               System.out.println("|   Device   | ID |      Name      |");
               System.out.format("| %-10s | %-2s | %-14s |\n", product.getProductType(), product.getId(), product.getName());
               System.out.println("-----------------------------------------------------");
           }else {
               System.out.println("No product is found with ID \"" + id + "\".");
           }
       }

    }

    public static void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);
        System.out.println("Product removed.");
    }

    public static Brand getBrandByName(String brandName) {
        for (Brand brand : brands) {
            if (brand.getName().equalsIgnoreCase(brandName)) {
                return brand;
            }
        }
        return new Brand(brandName);
    }

    public static ArrayList<Brand> getBrands() {
        return brands;
    }

    public static ArrayList<Notebook> getNotebooks() {
        ArrayList<Notebook> notebooks = new ArrayList<>();
        for (Product product : products) {
            if (Objects.equals(product.getProductType(), "Notebook")) {
                notebooks.add((Notebook) product);
            }
        }
        return notebooks;
    }

    public static ArrayList<Phone> getPhones() {
        ArrayList<Phone> phones = new ArrayList<>();
        for (Product product : products) {
            if (Objects.equals(product.getProductType(), "Phone")) {
                phones.add((Phone) product);
            }
        }
        return phones;
    }

}
