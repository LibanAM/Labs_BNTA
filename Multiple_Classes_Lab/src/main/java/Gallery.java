import java.util.ArrayList;

public class Gallery {
    private String name;
    private int till;
    private ArrayList<Artwork> artworks;

    public Gallery(String name){
        this.name = name;
        this.till = 0;
        this.artworks = new ArrayList<Artwork>();
    }

    public String getName() {
        return name;
    }

    public int getTill() {
        return till;
    }

    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }

    public ArrayList<Artwork> getArtworks() {
        return artworks;
    }

    public void setTill(int amount) {
        this.till = amount;
    }

    public void sellArtworks(Gallery galleries){
        for (Artwork artworks : galleries.getArtworks()){
            this.till += artworks.getPrice();
        }
    }
}
