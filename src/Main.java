import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        scegliClasse();
        int sceltaClasse = scanner.nextInt();
        scanner.nextLine();

        registraNome();

        while (true) {
            int portaScelta = sceltaPorta();

            switch (portaScelta) {
                case 1:
                    System.out.println("Evento porta 1...");
                    break;
                case 2:
                    System.out.println("Evento porta 2...");
                    break;
                case 3:
                    System.out.println("Evento porta 3...");
                    break;
            }
        }
    }

    private static void scegliClasse(){
        System.out.println("Scegli la tua classe: ");
        System.out.println("1. Guerriero");
        System.out.println("2. Mago");
        System.out.println("3. Elfo");
    }

    private static void registraNome() {
        System.out.println("Inserisci il nome del tuo eroe: ");
        String nome = scanner.nextLine();
        System.out.println(nome + " entra nel dungeon!");
    }

    private static int sceltaPorta() {
        System.out.println("\nTi trovi di fronte a tre porte. Quale scegli? ");
        System.out.println("1. Porta di sinistra");
        System.out.println("2. Porta di centro");
        System.out.println("3. Porta di destra");

        int scelta = scanner.nextInt();
        scanner.nextLine();

        switch (scelta) {
            case 1:
                System.out.println("Hai scelto la porta di sinistra");
                break;
            case 2:
                System.out.println("Hai scelto la porta di centro");
                break;
            case 3:
                System.out.println("Hai scelto la porta di destra");
                break;
            default:
                System.out.println("Scelta non valida!");
        }

        return scelta;
    }

    public static String menu() {
        return "HP Eroe: ";
    }

    public static int avvenimentoPorta() {
        return (int) (Math.random() * 10) + 1;  // genera da 1 a 10


    }
}
