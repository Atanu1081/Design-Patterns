package creational.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class SingletonDriver {


    // JDK : Runtime, Desktop, LoggingManager
    // SpringBoot : Bean scope
    public static void main(String[] args) throws Exception {
        Student s1 = Student.getStudent();
        System.out.println(s1.hashCode());

        /*Constructor<Student> declaredConstructor = Student.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Student s2 = declaredConstructor.newInstance();
        System.out.println(s2.hashCode());*/

        /*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
        oos.writeObject(s1);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
        Student s2 = (Student) ois.readObject();
        System.out.println(s2.hashCode());*/

        Student s2 = (Student) s1.clone();
        System.out.println(s2.hashCode());


    }
}
