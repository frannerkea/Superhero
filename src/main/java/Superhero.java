public class Superhero {

    //Superhero klasse med private attributter, så værdierne skal sættes af konstruktøren, og læses ud via getter-metoder.

    //Attributer
    public String superHelteNavn;
    public String superKraft;
    public String virkeligeNavn;
    public int oprindelsesår;
    public boolean erMenneske;
    public double styrke;

    //konstruktør
    public Superhero(String superHelteNavn, String superKraft, String virkeligeNavn, int oprindelsesår, boolean erMenneske, double styrke) {
        this.superHelteNavn = superHelteNavn;
        this.superKraft = superKraft;
        this.virkeligeNavn = virkeligeNavn;
        this.oprindelsesår = oprindelsesår;
        this.erMenneske = erMenneske;
        this.styrke = styrke;
    }


    //gettere
    public String getSuperHelteNavn() {
        return superHelteNavn;
    }

    public String getSuperKraft() {
        return superKraft;
    }

    public String getVirkeligeNavn() {
        return virkeligeNavn;
    }

    public int getOprindelsesår() {
        return oprindelsesår;
    }

    public boolean isErMenneske() {
        return erMenneske;
    }

    public double getStyrke() {
        return styrke;
    }


    //settere

    public void setSuperHelteNavn(String superHelteNavn) {
        this.superHelteNavn = superHelteNavn;
    }

    public void setSuperKraft(String superKraft) {
        this.superKraft = superKraft;
    }

    public void setVirkeligeNavn(String virkeligeNavn) {
        this.virkeligeNavn = virkeligeNavn;
    }

    public void setOprindelsesår(int oprindelsesår) {
        this.oprindelsesår = oprindelsesår;
    }

    public void setErMenneske(boolean erMenneske) {
        this.erMenneske = erMenneske;
    }

    public void setStyrke(int styrke) {
        this.styrke = styrke;
    }

    @Override
    public String toString() {
        return superHelteNavn +  "\n" + superKraft + "\n" + virkeligeNavn + "\n" + oprindelsesår + "\n" + erMenneske + "\n" + styrke + "\n" + "\n";
    }


}

//public String superHelteNavn;
//    public String superKraft;
//    public String virkeligeNavn;
//    public int oprindelsesår;
//    public boolean erMenneske;
//    public double styrke;