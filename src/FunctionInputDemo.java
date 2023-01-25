import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionInputDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("one", "two", "three", "four", "five");

        list.forEach(t-> System.out.println(processString(s-> t.toUpperCase(), t)));

    }
    // added a random comment
    public static String processString(Function<String, String> operation, String target) {
        return operation.apply(target);
    }
}