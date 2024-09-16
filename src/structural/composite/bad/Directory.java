package structural.composite.bad;

import java.util.ArrayList;
import java.util.List;

public class Directory {
    String directoryName;
    List<Object> directory = new ArrayList<>();

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public void add(Object o) {
        directory.add(o);
    }

    public void ls() {
        System.out.println("Directory name : " + directoryName);
        for (Object o : directory) {
            /*if (o instanceof File)
                ((File) o).ls();
            else if (o instanceof Directory) {
                ((Directory) o).ls();
            }*/

        }
    }
}
