public class Artwork {
    private String title;
    private String artist;
    private double price;
    private int nft;

    public Artwork(String title, String artist, double price, int nft) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.nft = nft;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getPrice() {
        return price;
    }

    public int getNft() {
        return nft;
    }
}
