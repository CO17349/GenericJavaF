import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;

public class ListDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("one", "two", "three", "four");
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);

        list.forEach(new ConsumerImpl<>());

        System.out.println("++++++++++++");

        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("++++++++++++");

        list.forEach(t-> System.out.println(t));

        System.out.println("++++++++++++");

        Consumer consumer = t -> System.out.println(t);
        list.forEach(consumer);

        System.out.println("++++++++++++");

        HashSet<Integer> myHash = new HashSet<>();
        myHash.add(1);
        myHash.add(2);
        myHash.add(3);
        myHash.add(4);
        myHash.add(5);

        myHash.removeIf(t-> t>2);
        System.out.println(myHash);

    }
}