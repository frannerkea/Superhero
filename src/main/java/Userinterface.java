import java.util.ArrayList;
import java.util.Scanner;

public class Userinterface {

    //Main klasse med en main-metode, som kan indlæse data om en superhelt via brugerinput (hint: Scanner klassen).

    //FÅ BRUGER IMPUT
    Scanner brugerInput = new Scanner(System.in);
    int valg;
    Database database = new Database();

    public void startMenu() {
        database.createTestData();
        int valg;
        do {
            System.out.println("Velkommen til the SUPERHERO PROGRAM");
            System.out.println("1: Opret ny superhero");
            System.out.println("2: Liste menu");
            System.out.println("3: Søg efter superhelt by name");
            System.out.println("4: Rediger en helt");
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
        for (Superhero helt : database.getSuperHeroDatabase()) {
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
        //boolean der checker for bruger imput fejl
        boolean writingError =  false;

        System.out.println("Rediger din superhero");
        //giver hver superhero et nummer så man kan vælge superhelten
        for (int i = 0; i <database.getSuperHeroDatabase().size(); i++) {
            System.out.println(i + 1 + ": " + database.getSuperHeroDatabase().get(i));
        }

        System.out.println("Vælg nummer for den superhero du vil rediger");
        //gør så brugen kan vælge helt
        int number = brugerInput.nextInt();
        brugerInput.nextLine();

        //tager den valgt superhelt af bruger minus 1 fordi array starter på 0
        Superhero redigerHelt = database.getSuperHeroDatabase().get(number - 1);
        System.out.println("Rediger superhero's info: " + redigerHelt);

        //info til brugeren         Er lidt itivle om
        System.out.println("Rediger data tryk og ENTER. Hvis du ikke vil rediger data bare tryk Enter ");
        System.out.println("Name: " + redigerHelt.getSuperHelteNavn());
        // todo: hvad gør trim? sletter det gamle navn?
        String newSuperHelteNavn = brugerInput.nextLine().trim();
        //if statement der sætter ny navn
        // todo: hvad gør ! helst presist?
        if (!newSuperHelteNavn.isEmpty())
            redigerHelt.setSuperHelteNavn(newSuperHelteNavn);

        //superkraft
        System.out.println("SuperKraft: " + redigerHelt.getSuperKraft());
        String newSuperKraft = brugerInput.nextLine().trim();
        if (!newSuperHelteNavn.isEmpty())
            redigerHelt.setSuperHelteNavn(newSuperKraft);

        //Virkelignavn
        System.out.println("Virkeligenavn: " + redigerHelt.getVirkeligeNavn());
        String newVirkeligeNavn = brugerInput.nextLine().trim();
        if (!newVirkeligeNavn.isEmpty())
            redigerHelt.setVirkeligeNavn(newVirkeligeNavn);

        //Oprindelses år:
        System.out.println("Oprindelses år: " + redigerHelt.getOprindelsesår());
        do {
            String newOprindelsesår = brugerInput.nextLine().trim();
            if (!newOprindelsesår.isEmpty()) {
                try {
                    redigerHelt.setOprindelsesår(Integer.parseInt(newOprindelsesår));
                    writingError = false;
                } catch (NumberFormatException nfe) {  // catch for hvis bruger skriver andet end tal
                    System.out.println("En fejl op stod");
                    System.out.println("Skriv oprindelsesår i tal");
                    writingError = true;
                }

            }
        } while (writingError == true); //todo lidt i tivle hvad den gør


        //ErMenneske
        System.out.println("Er menneske: " + redigerHelt.getErMenneske());
        String newErMenneske = brugerInput.nextLine().trim();
        if (!newErMenneske.isEmpty())
            redigerHelt.setErMenneske(newErMenneske);

        //styrke
        System.out.println("Styrke: " + redigerHelt.getStyrke());
        do {
            String newStyrke = brugerInput.nextLine().trim();
            if (!newStyrke.isEmpty()) {
                try {
                    redigerHelt.setStyrke(Integer.parseInt(newStyrke));
                    writingError = false;
                } catch (NumberFormatException nfe) { // catch for hvis bruger skriver andet end tal
                    System.out.println("En fejl op stod");
                    System.out.println("Skriv oprindelsesår i tal");
                    writingError = true;
                }

            }
        } while (writingError == true);


    }


}










