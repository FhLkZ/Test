package fruitstest;
public class Fruits {
    private String name;
    private double price;
    private int quality;

    public Fruits(String name, double price, int quality) {
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuality() {
        return quality;
    }

    @Override
    public String toString() {
        return "Fruits{" + "price=" + price + ", quality=" + quality + '}';
    }
    public boolean equals(Fruits f){
        return true;
    }
    
    public int compare(Fruits f){
        return 0;
    }
}
