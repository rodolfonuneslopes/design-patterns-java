package decorator.extras.free;
import decorator.Hotdog;
import decorator.HotdogDecorator;

public class WithMayonnaise extends HotdogDecorator {
    private double cost = 0;
    public WithMayonnaise(Hotdog newHotdog) {
        super(newHotdog);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getChoice() {
        return super.getChoice() + "Mayonnaise (" + cost + ")\n";
    }
}
