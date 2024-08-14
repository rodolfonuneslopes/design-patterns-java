public class Bootcamp {
    public static void main(String[] args) {

        // Creating a single Jedi
        Jedi christine = Jedi.makeJedi("Christine");

        // Creating MCs and Padawans
        MasterCoder jeronimo = (MasterCoder) MasterCoder.makeMasterCoder("Jerónimo");
        System.out.println(jeronimo);
        MasterCoder rita = (MasterCoder) MasterCoder.makeMasterCoder("Rita");
        System.out.println(rita);
        Padawan fanukaPadawan = (Padawan) Padawan.makePadawan("Fanuka");
        System.out.println(fanukaPadawan);

        // Creating a Beta Code Cadet
        BetaCodeCadet rodolfoBeta = (BetaCodeCadet) BetaCodeCadet.makeNewBetaCodeCadet("Rodolfo", false);
        System.out.println(rodolfoBeta);

        // Creating a Code Cadet
        CodeCadet ruiCadet = (CodeCadet) CodeCadet.makeNewCodeCadet("Rui", true);
        System.out.println(ruiCadet);

        // Rita promoting Rodolfo to CodeCadet
        CodeCadet rodolfoCadet = (CodeCadet) rita.promote(rodolfoBeta);
        System.out.println(rodolfoCadet);

        // Christine promoting Fanuka to MC
        MasterCoder fanukaMc = (MasterCoder) christine.promote(fanukaPadawan);
        System.out.println(fanukaMc);

    }
}