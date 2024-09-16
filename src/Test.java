import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Atanu");
        list.add("Prattu");
        list.add("Tamuli");

        List<String> strings = Collections.unmodifiableList(list);

        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            strings.remove("Atanu");
        }
        System.out.println(list);
    }
}
