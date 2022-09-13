import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //Main klasse med en main-metode, som kan indlæse data om en superhelt via brugerinput (hint: Scanner klassen).

    //FÅ BRUGER IMPUT
    Scanner brugerInput = new Scanner(System.in);
    int valg;

   public void startMenu() {
       System.out.println("Velkommen til the SUPERHERO PROGRAM");
       System.out.println("1: Opret ny superhero");
       System.out.println("2: Liste menu");
       System.out.println("9: Afslut programet");
       int valg = brugerInput.nextInt();
       brugerInput.nextLine();
       if (valg == 1) {
           opretSuperhero();
       }
       else if (valg == 9) {
           System.exit(0);
       }
       else if (valg == 2) {
           listeMenu();
       }






   }

   public void listeMenu() {
       System.out.println("liste af superheros");




       Database database = new Database();
       System.out.println(database);




   }

   public void opretSuperhero() {

       //create superhero
       Database database = new Database();



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

           // erMenneske
           System.out.println("Er din superhelt menneske? true eller false");
           System.out.print("skriv true eller falsh ");
           boolean erMenneske = brugerInput.nextBoolean();

           //styrke
           System.out.println("Hvad er din superhelts styrke?");
           System.out.print("Skriv lige tal mellem 1 og 10000 her: ");
           double styrke = brugerInput.nextInt();

           database.createSuperhero(superHelteNavn, superKraft, virkeligeNavn, oprindelsesår, erMenneske, styrke);

       System.out.println("DU har oprettet in superhero. Hvad vil du nu?");
       System.out.println("1: Opret ny superhero");
       System.out.println("2: Liste menu");
       System.out.println("9: Afslut programet");
       int valg = brugerInput.nextInt();
       brugerInput.nextLine();
       if (valg == 1) {
           opretSuperhero();
       }
       else if (valg == 9) {
           System.exit(0);
       }
       else if (valg == 2) {
           listeMenu();
       }

       }





    public static void main(String[] args) {
        Main program = new Main();
        program.startMenu();

        /* Superhero sup1 = new Superhero("Batman ", "got the bag ", "Bruce Wayne ", 1939, true, 7000);
        Superhero sup2 = new Superhero("Superman ", "Kan flyve og skyde laser ud af øjene ", "Clark Kent", 1938, false, 9500);
        Superhero sup3 = new Superhero("Spiderman ", "Er en edderkop ", "Peter Parker ", 1962, true, 6000);
        Superhero sup4 = new Superhero("Hulk ", "Er på ordenligt meget bamse saft ", "Bruce Banner ", 1962, true, 8500);
        Superhero sup5 = new Superhero("Thor ", "Har en hammer, der slå fucking hårdt! ", "Thor", 1962, false, 8000);

        Database database = new Database();
        database.addhero(sup1);
        database.addhero(sup2);
        database.addhero(sup3);
        database.addhero(sup4);
        database.addhero(sup5);

        System.out.println(database);


         */
    }



}
