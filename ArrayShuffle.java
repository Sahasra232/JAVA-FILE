import java.util.*;

public class ArrayShuffle {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println("List before shuffle:" + list);
        Collections.shuffle(list);
        System.out.println("List after shuffle:" + list);

    }

}
