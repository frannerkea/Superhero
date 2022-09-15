import java.util.Scanner;

public class Userinterface {

    //Main klasse med en main-metode, som kan indlæse data om en superhelt via brugerinput (hint: Scanner klassen).

    //FÅ BRUGER IMPUT
    Scanner brugerInput = new Scanner(System.in);
    int valg;
    Database database = new Database();

    public void startMenu() {
        int valg;
        do {
            System.out.println("Velkommen til the SUPERHERO PROGRAM");
            System.out.println("1: Opret ny superhero");
            System.out.println("2: Liste menu");
            System.out.println("3: søg efter superhelt by name");
            System.out.println("9: Afslut programet");
            valg = brugerInput.nextInt();
            brugerInput.nextLine();
            if (valg == 1) {
                opretSuperhero();
            } else if (valg == 9) {
                System.exit(0);
            } else if (valg == 2) {
                listeMenu();
            } else if (valg == 3) {
                søgeEfterHelt();
            }
        } while (valg != 9);


    }

    public void listeMenu() {
        System.out.println("liste af superheros");
        //loop der går igennem array
        for (Superhero helt : database.getSuperheroes()) {
            System.out.println(helt.getSuperHelteNavn() + "\n" + helt.getSuperKraft() + "\n" + helt.getVirkeligeNavn()
                    + "\n" + helt.getOprindelsesår() + "\n"  + helt.getErMenneske() + "\n"  + helt.getStyrke() + "\n"  + " ");
        }

    }

    public void opretSuperhero() {


        //text til brugeren og brugerInput


        //SuperhelteNavn
        System.out.println("Hvad er din superhelts superhelte navn?");
        System.out.print("Skriv det her: ");
        String superHelteNavn = brugerInput.nextLine();

        //Superkraft
        System.out.println("hvad er din superhelts superkraf?");
        System.out.print("Skriv det her: ");
        String superKraft = brugerInput.nextLine();

        //virkeligeNavn
        System.out.println("hvad er din superhelts virkelige navn?");
        System.out.print("Skriv det her: ");
        String virkeligeNavn = brugerInput.nextLine();

        // oprindelsesår
        System.out.println("Hvad er din superhelts oprindelesår?");
        System.out.print("Skriv det her: ");
        int oprindelsesår = brugerInput.nextInt();
        brugerInput.nextLine();

        // erMenneske
        System.out.println("Er din superhelt menneske? ja eller nej");
        System.out.println("skriv ja eller nej ");
        String erMenneske = brugerInput.nextLine();

        //styrke
        System.out.println("Hvad er din superhelts styrke?");
        System.out.print("Skriv lige tal mellem 1 og 10000 her: ");
        double styrke = brugerInput.nextInt();

        database.createSuperhero(superHelteNavn, superKraft, virkeligeNavn, oprindelsesår, erMenneske, styrke);


    }

    public void søgeEfterHelt() {
        System.out.println("Søg efter din superhelts navn:");
        String searchTerm = brugerInput.nextLine();
        Superhero superhero = database.searchFor(searchTerm);
        System.out.println(superhero);
        if (superhero != null) {
            System.out.println("Superhelt infomation" + "\n" + superhero);
        } else {
            System.out.println("kunne ikke finde superhero med det navn, dsv.!");
        }
    }



}
