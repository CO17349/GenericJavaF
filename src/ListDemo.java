import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ListDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("one", "two", "three", "four");

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

    }
}