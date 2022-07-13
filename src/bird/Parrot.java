package bird;
//Abstract class for parrot bird type
abstract class Parrot extends AbstractBird {

    protected int numFavWords;
    protected String favWord;
    protected String salientChar;
    protected String sharedChar = "intelligent and mimic sounds and short, curved beak";

    public String getChar(){
        return "The specific traits are: " + salientChar + "\n" +
                "The common traits are: " + sharedChar;
    }

    int getNumFavWords(){
        return this.numFavWords;
    }

    String getFavWord(){
        return this.favWord;
    }


    public Food[] getFavFood() {

        return this.favFood;
    }

    abstract String getSharedChar();




}

