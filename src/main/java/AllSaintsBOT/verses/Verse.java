package AllSaintsBOT.verses;

import AllSaintsBOT.AllSaintsBOT;

public class Verse {
    private int id;
    private static final String imageAdress = "https://i1.wp.com/transformedblog.westernseminary.edu/wp-content/uploads/2012/05/Bible2.jpg?fit=750%2C500&ssl=1";
    private String siglum;
    private String verse;

    public Verse(String siglum, String verse, int id) {
        this.siglum = siglum;
        this.verse = verse;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static String getImageAdress() {
        return imageAdress;
    }

    public String getSiglum() {
        return siglum;
    }

    public String getVerse() {
        return verse;
    }
}


