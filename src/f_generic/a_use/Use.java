package f_generic.a_use;

import java.util.ArrayList;
import java.util.HashMap;

class Use {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("旺财", 10));
        dogs.add(new Dog("地包天", 5));
        for (Dog dog : dogs) {
            System.out.println(dog);
        }

        HashMap<String, Dog> dogMap = new HashMap<>();
        dogMap.put("旺财", new Dog("旺财", 10));
        dogMap.put("地包天", new Dog("地包天", 5));
        for (Dog dog : dogMap.values()) {
            System.out.println(dog);
        }

        //细节
        //1.定义类时如果携带泛型，泛型中的类型不能是已有类型
        //2.传入的参数类型不能为基本数据类型
        //3.指定参数类型后，能够传入的参数对象只能是该类型对象，或是该类型的子类对象
        //4.使用类时如果不指定参数类型，则默认使用 Object 类型
    }
}
