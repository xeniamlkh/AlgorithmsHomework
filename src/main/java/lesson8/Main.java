package lesson8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ChainingHasMap<Integer, String> map = new ChainingHasMap<>(7);
        for (int i = 0; i < 5; i++) {
            map.put(random.nextInt(10), "a");
        }
        System.out.println(map);

        System.out.println("Key to delete = " + map.remove(2));
        System.out.println(map);


    }
}
