public class Padawan implements Bootcampable {

    String name = null;

    private Padawan (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Bootcampable makePadawan(String name) {
        return new Padawan(name);
    }

    @Override
    public String toString() {
        return "This is Padawan " + name + " speaking.";
    }

}
