package decorator.extras.paid;

import decorator.Hotdog;
import decorator.HotdogDecorator;

public class WithBacon extends HotdogDecorator {
private double cost = 5.0;
    public WithBacon(Hotdog newHotdog) {
        super(newHotdog);
    }

    @Override
    public double getPrice() {
        return super.getPrice() + cost;
    }

    @Override
    public String getChoice() {
        return super.getChoice() + "Bacon ("+ cost +")\n";
    }
}
