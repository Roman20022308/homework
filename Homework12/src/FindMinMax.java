import java.util.Comparator;

import java.util.function.BiConsumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindMinMax {
    public static <T> void findMinMax(IntStream stream, Comparator<Integer> order, BiConsumer<? super T, ? super T> minMaxConsumer)
    {
        T x= (T) stream.reduce((a, b)-> order.compare(a,b)>=0?a:b);
        T y= (T) stream.reduce((a,b)-> order.compare(a,b)<=0?a:b);
        minMaxConsumer.accept(x,y);
        }



    public static void main(String[] args) {
        IntStream intStream=IntStream.range(1,10);
        Comparator<Integer> comparator=(o1,o2)->o1.compareTo(o2);
        findMinMax(intStream,comparator,(x,y)->System.out.println(x+" "+y));
    }


}
