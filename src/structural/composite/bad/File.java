package structural.composite.bad;

public class File {
    String name;

    public File(String name) {
        this.name = name;
    }

    public void ls() {
        System.out.println("File name : " + name);
    }
}
