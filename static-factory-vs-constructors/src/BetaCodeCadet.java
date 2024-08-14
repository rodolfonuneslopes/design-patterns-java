public class BetaCodeCadet implements Bootcampable {

    private String name = null;
    private boolean doneWorkshop = false;

    private BetaCodeCadet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean setWorkshopToTrue() {
        return this.doneWorkshop = true;
    }

    public static Bootcampable makeNewBetaCodeCadet(String name, boolean doneWorkshop) {
        if (doneWorkshop) {
            return CodeCadet.makeNewCodeCadet(name, true);
        }
        return new BetaCodeCadet(name);
    }

    @Override
    public String toString() {
        return "This is Beta Code Cadet " + name + " speaking.";
    }
}
