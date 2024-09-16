package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Network implements Cloneable{
    private String ip;
    private String data;

    private List<String> hobbies = new ArrayList<>();

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void load() throws InterruptedException {
        Thread.sleep(3000);
        this.data = "Atanu";
        this.hobbies.add("Football");
        this.hobbies.add("Cricket");
    }

    @Override
    public String toString() {
        return "Network{" +
                "ip='" + ip + '\'' +
                ", data='" + data + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Network network = new Network();
        network.ip = this.ip;
        network.data = this.data;
        List<String> h = new ArrayList<>();
        for (String s : hobbies) {
            h.add(s);
        }
        network.hobbies = h;
        return network;
    }
}
