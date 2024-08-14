public final class Jedi implements Promotable, Bootcampable {

    private static Jedi JEDI = null;
    private static String name = null;

    private Jedi(String name) {
        this.name = name;
    }

    public static Jedi makeJedi(String name) {
        if (JEDI == null) {
            JEDI = new Jedi(name);
        }
        return JEDI;
    }

    @Override
    public Bootcampable promote(Bootcampable promoted) {
        if (promoted instanceof Padawan) {
            return MasterCoder.makeMasterCoder(((Padawan) promoted).getName());
        } else if (promoted instanceof BetaCodeCadet) {
            return CodeCadet.makeNewCodeCadet(((BetaCodeCadet) promoted).getName(), true);
        }
        return promoted;
    }

    @Override
    public String toString() {
        return "This is Jedi " + name + " speaking.";
    }
}
