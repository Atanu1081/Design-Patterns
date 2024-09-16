package structural.composite.good;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> directory = new ArrayList<>();

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public void add(FileSystem o) {
        directory.add(o);
    }

    public void ls() {
        System.out.println("Directory name : " + directoryName);
        for (FileSystem o : directory) {
            o.ls();
        }
    }
}
