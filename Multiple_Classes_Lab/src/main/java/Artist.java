
import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Artwork> artworks;

    public Artist(String name){
        this.name = name;
        this.artworks = new ArrayList<Artwork>();
    }

    public String getName() {
        return name;
    }
}
