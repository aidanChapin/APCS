package ChristmasBreak;

public class Client {
    public static void main(String[] args) {


        DVD theGodfather = new DVD("The Godfather", "Francis Ford Coppala", 1972, 24.95, true);
        DVD district9 = new DVD("District 9", " Niel Blomkamp", 2009, 19.95, false);
        DVD ironMan = new DVD("Iron Man", "Jon Favreau", 2008, 15.95, false);
        DVD allAboutEve = new DVD("All About Eve", "Joseph Mankiewicz", 1950, 17.50, false);
        DVD theMatrix = new DVD("The Matrix", "Andy & Lana Wachowski", 1999, 19.95, true);
        DVD ironMan2 = new DVD("Iron Man 2", "Jon Favreau", 2010, 22.99, false);
        DVD casablanca = new DVD("Casablanca", "Michael Curtiz", 1942, 19.95, false);

        DVDCollection movies = new DVDCollection();
        movies.addDVD(theGodfather);
        movies.addDVD(district9);
        movies.addDVD(ironMan);
        movies.addDVD(allAboutEve);
        movies.addDVD(theMatrix);

        System.out.println(movies.toString());

        movies.addDVD(ironMan2);
        movies.addDVD(casablanca);

        System.out.println(movies.toString());

    }

}
