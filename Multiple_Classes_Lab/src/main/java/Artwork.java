public class Artwork {
    private String title;
    private String artist;
    private int price;
    private int nft;

    public Artwork(String title, String artist, int price, int nft) {
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

    public int getPrice() {
        return price;
    }

    public int getNft() {
        return nft;
    }
}
