package product;

public class Notebook extends Product{
    private final int id;
    private static int notebookID = 0;

    public Notebook() {
        notebookID++;
        this.id = notebookID;
    }

    public int getId() {
        return this.id;
    }
}

