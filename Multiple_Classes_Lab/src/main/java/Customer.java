public class Customer {
    private String name;
    private int wallet;

    public Customer(String name, int wallet){
        this.name = name;
        this.wallet = 0;
    }

    public String getName() {
        return name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int amount) {
        this.wallet = amount;
    }

    public void purchaseArtworks(Gallery galleries){
        int totalWallet = 0;
        int totalTill = 0;
        for (Artwork artworks : galleries.getArtworks()){
            this.wallet -= artworks.getPrice();
        }
    }
}

