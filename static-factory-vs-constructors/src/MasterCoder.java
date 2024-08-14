public class MasterCoder implements Promotable, Bootcampable {

    private String name = null;

    private MasterCoder (String name) {
        this.name = name;
    }

    public static Bootcampable makeMasterCoder (String name) {
        return new MasterCoder(name);
    }

    @Override
    public Bootcampable promote(Bootcampable promoted) {
        if (promoted instanceof BetaCodeCadet) {
            return CodeCadet.makeNewCodeCadet(((BetaCodeCadet) promoted).getName(), true);
        }
        return promoted;
    }

    @Override
    public String toString() {
        return "This is Master Coder " + name + " speaking.";
    }
}
