package creational.singleton;

import java.io.Serializable;

public class Student implements Serializable, Cloneable {

    private static Student student;

    private Student() {
        if (student != null) throw new RuntimeException("Constructor invocation not allowed");
    }

    public synchronized static Student getStudent() {
        if (student == null) {
            synchronized (Student.class) {
                if (student == null)
                    student = new Student();
            }
        }
        return student;
    }

    public Object readResolve() {
        return student;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return student;
    }
}
