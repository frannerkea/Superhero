import java.util.ArrayList;
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
            } else if (valg == 4) {
                redigerHelt();
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
        String searchTerm = null;
        ArrayList<Superhero> searchResults = database.searchFor(searchTerm);
        System.out.println("Søg efter din superhelts navn:");
        searchTerm = brugerInput.nextLine();

        if(searchResults.isEmpty()) {
            System.out.println("Der var ingen superhelt med dette navn");
        } else if(searchResults.size() == 1) {
            System.out.println("En enkle superhelt var fundet");
            Superhero hero = searchResults.get(0);
            System.out.println("Superhero navn: " + hero.getSuperHelteNavn());
            System.out.println("Superkraft:  " + hero.getSuperKraft());
            System.out.println("Er menneske:  " +  hero.getErMenneske());
            System.out.println("Oprindelesår år:  " + hero.getOprindelsesår());
            System.out.println("StyrkePoint:  " + hero.getStyrke());
            System.out.println("\n");
        } else {
            System.out.println("Flere superhelte var fundet");
            for(Superhero hero : searchResults) {
                System.out.println("Superhero navn: " + hero.getSuperHelteNavn());
                System.out.println("Superkraft:  " + hero.getSuperKraft());
                System.out.println("Er menneske:  " +  hero.getErMenneske());
                System.out.println("Oprindelesår år:  " + hero.getOprindelsesår());
                System.out.println("StyrkePoint:  " + hero.getStyrke());
                System.out.println("\n");
            }
        }
    }

    public void redigerHelt() {
        System.out.println("Rediger din superhero");

    }


}
