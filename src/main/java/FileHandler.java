import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

public class FileHandler {

    public FileHandler() throws FileNotFoundException {
    }

    private PrintStream output = new PrintStream(new File("data/list.csv"));



    public void saveData(ArrayList<Superhero> superheroes) throws FileNotFoundException{
        for (Superhero superhero : superheroes) {
            output.print(superhero.getSuperHelteNavn());
            output.print(";");
            output.print(superhero.getSuperKraft());
            output.print(";");
            output.print(superhero.getVirkeligeNavn());
            output.print(";");
            output.print(superhero.getOprindelsesår());
            output.print(";");
            output.print(superhero.getErMenneske());
            output.print(";");
            output.print(superhero.getStyrke());
            output.print(";");
            output.println();

            output.close();
        }
    }


}
