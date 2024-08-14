package decorator;

public class Vegan implements Hotdog {
    private double price = 15.00;
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getChoice() {
        return "Vegan hotdog ("+price+")\n";
    }
}
