public class Customer {
    private String name;
    private double wallet;

    public Customer(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }

    public void purchaseArtworks(Gallery galleries){
        for (Artwork artworks : galleries.getArtworks()){
            this.wallet -= artworks.getPrice();
        }
    }
}

