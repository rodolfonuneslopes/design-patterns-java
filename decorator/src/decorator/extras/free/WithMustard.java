package decorator.extras.free;

import decorator.Hotdog;
import decorator.HotdogDecorator;

public class WithMustard extends HotdogDecorator {
    private double cost = 0;
    public WithMustard(Hotdog newHotdog) {
        super(newHotdog);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getChoice() {
        return super.getChoice() + "Mustard (" + cost + ")\n";
    }
}
