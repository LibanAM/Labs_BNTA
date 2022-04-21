import java.util.ArrayList;

public class Gallery {
    private String name;
    private int till;
    private ArrayList<Gallery> artworks;

    public Gallery(String name, int till){
        this.name = name;
        this.till = till;
    }

    public String getName() {
        return name;
    }

    public int getTill() {
        return till;
    }
}
