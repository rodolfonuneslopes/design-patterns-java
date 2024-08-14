package decorator;

public class Simple implements Hotdog {
    private double price = 10.00;
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getChoice() {
        return "Simple hotdog ("+price+")\n";
    }
}
