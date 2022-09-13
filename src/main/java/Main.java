import java.util.Scanner;

public class Main {

    //Main klasse med en main-metode, som kan indlæse data om en superhelt via brugerinput (hint: Scanner klassen).

    //FÅ BRUGER IMPUT
    Scanner brugerInput = new Scanner(System.in);
    int valg;

   public void startMenu() {
       System.out.println("Velkommen til the SUPERHERO PROGRAM");
       System.out.println("1: Opret ny superhero");
       System.out.println("9: afslut programet");
       int valg = brugerInput.nextInt();
       brugerInput.nextLine();
       if (valg == 1) {
           opretSuperhero();
       } else if (valg == 9) { System.exit(0);


       }
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
           System.out.print("Skriv lige tal mellem 0 og 10000 her: ");
           double styrke = brugerInput.nextInt();

           database.createSuperhero(superHelteNavn, superKraft, virkeligeNavn, oprindelsesår, erMenneske, styrke);

           startMenu();

       }





    public static void main(String[] args) {
        Main program = new Main();
        program.startMenu();


    }



}
