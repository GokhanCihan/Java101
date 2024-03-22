public class Brand {
    private final int id;
    private static int brandID = 0;
    private final String name;

    public Brand(String name) {
        brandID++;
        this.id = brandID;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
