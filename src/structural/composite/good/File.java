package structural.composite.good;

public class File implements FileSystem{
    String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println("File name : " + name);
    }
}
