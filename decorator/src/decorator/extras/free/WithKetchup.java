package decorator.extras.free;
import decorator.Hotdog;
import decorator.HotdogDecorator;

public class WithKetchup extends HotdogDecorator {
    private double cost = 0;
    public WithKetchup(Hotdog newHotdog) {
        super(newHotdog);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getChoice() {
        return super.getChoice() + "Ketchup (" + cost + ")\n";
    }
}
