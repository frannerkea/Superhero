public class Database {

    // Database klasse med et array til superhelt-objekter
    // (du kan her i starten af projektet nøjes med at gøre plads til 5 superhelte).
    // Klassen skal desuden have en metode til at modtage data om en superhelt,
    // så den kan oprette og indsætte et superhelt-objekt i sit array.


    //
    public void createSuperhero(String superHeltNavn, String superKraft, String virkeligeNavn,int oprindelsesår,boolean erMenneske, int styrke) {
        Superhero sup1 = new Superhero(superHeltNavn, superKraft, virkeligeNavn, oprindelsesår, erMenneske, styrke);
    }

    //array
    /*
    Superhero[] superHeroArray;


    // 5 superhero-objekter
    Superhero sup1 = new Superhero("Batman ", "got the bag ", "Bruce Wayne ", 1939, true, 7000);
    Superhero sup2 = new Superhero("Superman ", "Kan flyve og skyde laser ud af øjene ", "Clark Kent", 1938, false, 9500);
    Superhero sup3 = new Superhero("Spiderman ", "Er en edderkop ", "Peter Parker ", 1962, true, 6000);
    Superhero sup4 = new Superhero("Hulk ", "Er på ordenligt meget bamse saft ", "Bruce Banner ", 1962, true, 8500);
    Superhero sup5 = new Superhero("Thor ", "Har en hammer, der slå fucking hårdt! ", "Thor", 1962, false, 8000);

    superHeroArray =  new Superhero[] {sup1, sup2, sup3, sup4, sup5};

    */

}
