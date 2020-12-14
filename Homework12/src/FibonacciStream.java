import java.util.ArrayList;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class FibonacciStream {
    public static void fibonacciStream(int sum)
    {
                Stream.iterate(new int[]{0, 1},arr->((arr[1]+1)+arr[0]+arr[1])<sum,arr -> new int[]{arr[1],arr[0]+ arr[1]} )
                     .map(x -> x[1])
                     .forEach(x -> System.out.println(x));
    }
    public static void main(String[] args) {
        fibonacciStream(15);
    }
}
