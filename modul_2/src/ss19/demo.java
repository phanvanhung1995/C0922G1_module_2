package ss19;

import java.util.*;

public class demo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(3);
        queue.add(3);
        queue.add(4);
        queue.add(1);

        System.out.println(queue);

        Boolean arr = queue.isEmpty();
        System.out.println(arr);
        System.out.println(queue);
    }
}
