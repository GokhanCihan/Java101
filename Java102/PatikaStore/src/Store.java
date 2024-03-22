import product.Notebook;
import product.Phone;
import product.Product;

import java.util.*;

public class Store {
    private static ArrayList<Brand> brands = new ArrayList<>();
    private static ArrayList<Notebook> notebooks = new ArrayList<>();
    private static ArrayList<Phone> phones = new ArrayList<>();

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
    };

    public static void addBrand(String brandName){
        brands.add(new Brand(brandName));
    }

    public static void addProduct(Product product){
        if (Objects.equals(product.getProductType(), "Notebook")){
            notebooks.add((Notebook) product);
        }
        if (Objects.equals(product.getProductType(), "Phone")){
            phones.add((Phone) product);
        }
    };

    public static void listNotebooks(){
    //TODO: listNotebooks() UI
    }

    public static void listPhones(){
    //TODO: listPhones() UI
    }

    public static void removeProductByID(int id){
        //TODO: remove product by ID
    }

    public static ArrayList<Brand> getBrands() {
        return brands;
    }

    public static ArrayList<Notebook> getNotebooks() {
        return notebooks;
    }

    public static ArrayList<Phone> getPhones() {
        return phones;
    }

}
