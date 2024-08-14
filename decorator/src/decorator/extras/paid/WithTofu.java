package decorator.extras.paid;

import decorator.Hotdog;
import decorator.HotdogDecorator;

public class WithTofu extends HotdogDecorator {
private double cost = 2.5;
    public WithTofu(Hotdog newHotdog) {
        super(newHotdog);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + cost;
    }

    @Override
    public String getChoice() {
        return super.getChoice() + "Tofu ("+ cost +")\n";
    }
}
