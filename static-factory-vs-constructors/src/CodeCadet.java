public class CodeCadet implements Bootcampable {

    private String name = null;
    private boolean doneWorkshop = true;

    private CodeCadet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Bootcampable makeNewCodeCadet(String name, boolean doneWorkshop) {
        if (doneWorkshop) {
            return new CodeCadet(name);
        }
        return BetaCodeCadet.makeNewBetaCodeCadet(name, false);
    }

    @Override
    public String toString() {
        return "This is Code Cadet " + name + " speaking.";
    }
}
