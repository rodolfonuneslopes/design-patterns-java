package decorator.extras.paid;

import decorator.Hotdog;
import decorator.HotdogDecorator;

public class WithFries extends HotdogDecorator {
    private double cost = 3.50;
    public WithFries(Hotdog newHotdog) {
        super(newHotdog);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + cost;
    }

    @Override
    public String getChoice() {
        return super.getChoice() + "Fries ("+ cost +")\n";
    }
}
