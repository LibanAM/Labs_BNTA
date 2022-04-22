import java.util.ArrayList;
import java.util.List;

public class Gallery {
    private String name;
    private double till;
    private List<Artwork> artworks;

    public Gallery(String name, double till){
        this.name = name;
        this.till = 0;
        this.artworks = new ArrayList<Artwork>();
    }

    public String getName() {
        return name;
    }

    public double getTill() {
        return till;
    }

    public void addArtwork(Artwork artwork){
        this.artworks.add(artwork);
    }

    public List<Artwork> getArtworks() {
        return artworks;
    }

    public void sellArtworks(Gallery galleries){
        for (Artwork artworks : galleries.getArtworks()){
            this.till += artworks.getPrice();
        }
    }

    public void stockTake(Gallery gallery){
        double stock_take;
        for (Artwork artworks : gallery.getArtworks()){
            stock_take += gallery.getArtworks().get(2);

        }
    }
}
