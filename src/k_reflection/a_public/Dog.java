package k_reflection.a_public;

import java.time.LocalDateTime;

@Deprecated
public class Dog extends Animal implements PhysicalRunnable, Friend {
    public String name = "white";
    protected int age = 10;
    String master = "黑炭";
    private String hobby = "play";
    public static boolean loop = true;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    private Dog(int size, String name, int age, String master, String hobby) {
        super(size);
        this.name = name;
        this.age = age;
        this.master = master;
        this.hobby = hobby;
    }

    public void hi() {
        //System.out.println(name + " say hi");
    }

    public static String no() {
        System.out.println("no");
        return "no-return";
    }

    private void shit(String name, String location, LocalDateTime localDateTime) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", master='" + master + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
