package structural.composite.good;

public class Driver {
    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movies");
        File file = new File("KKHH");
        movieDirectory.add(file);
        Directory comedyMovieDirectory = new Directory("Comedy Movies");
        File file1 = new File("Yaariyaan");
        comedyMovieDirectory.add(file1);
        movieDirectory.add(comedyMovieDirectory);
        movieDirectory.ls();
    }
}
