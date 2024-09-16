package creational.prototype;

public class PrototypeDriver {

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        Network n1 = new Network();
        n1.setIp("1");
        n1.load();


        Network n2 = (Network) n1.clone();
        Network n3 = (Network) n1.clone();

        n1.getHobbies().remove(1);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

    }
}
