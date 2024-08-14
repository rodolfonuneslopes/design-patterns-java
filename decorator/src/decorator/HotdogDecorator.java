package decorator;

public abstract class HotdogDecorator implements Hotdog {
protected Hotdog hotdog;

public HotdogDecorator (Hotdog hotdog){
    this.hotdog = hotdog;
}

    @Override
    public double getPrice() {
        return hotdog.getPrice();
    }

    @Override
    public String getChoice() {
        return hotdog.getChoice();
    }
}
