public class App {

    enum Comandi {
        e_LEGGI_DA_FILE,
        e_SCRIVI_SU_FILE,
        e_CERCA_PERSONA,
        e_CANCELLA_PERSONA,
        e_TERMINA
    };

    public static void main(String[] args) throws Exception {

        CMenu<Comandi> menu = new CMenu<>(Comandi.values());

        while (true) {
            Comandi cmd = menu.run();
            System.out.println("Comando: " + cmd);
            switch (cmd) {
                case e_LEGGI_DA_FILE:
                    System.out.println("e_LEGGI_DA_FILE");
                    break;
                case e_SCRIVI_SU_FILE:
                    System.out.println("e_SCRIVI_SU_FILE");
                    break;
                case e_CERCA_PERSONA:
                    System.out.println("e_CERCA_PERSONA");
                    break;
                case e_CANCELLA_PERSONA:
                    System.out.println("e_CANCELLA_PERSONA");
                    break;
                case e_TERMINA:
                    System.out.println("e_TERMINA");
                    System.exit(0);
                    break;
            }
        }
    }
}
