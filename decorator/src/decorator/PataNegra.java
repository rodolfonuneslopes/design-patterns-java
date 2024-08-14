package decorator;

public class PataNegra implements Hotdog {
    private double price = 20.00;
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getChoice() {
        return "Pata Negra hotdog ("+price+")\n";
    }
}
