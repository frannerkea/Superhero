import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Controller {
    private Database database = new Database();



    public ArrayList<Superhero> getSuperHeroDatabase() {
        return database.getSuperHeroDatabase();
    }


    public void createSuperhero(String superHelteNavn, String superKraft, String virkeligeNavn, int oprindelsesår, String erMenneske, double styrke) {
    database.createSuperhero( superHelteNavn,  superKraft,  virkeligeNavn,  oprindelsesår,  erMenneske,  styrke);
    }

    public ArrayList<Superhero> searchFor(String searchTerm) {
        ArrayList<Superhero> searchResults = new ArrayList<>();

        for (Superhero helt : database.getSuperHeroDatabase()) {
            if (helt.getSuperHelteNavn().toLowerCase().contains(searchTerm.toLowerCase())) {
                searchResults.add(helt);        // hvis fundet
            }

        }
        //hvis ikke fundet
        return searchResults;
    }

    public void saveData() throws FileNotFoundException {
        FileHandler fileHandler = new FileHandler();
        fileHandler.saveData(getSuperHeroDatabase());
    }
}
