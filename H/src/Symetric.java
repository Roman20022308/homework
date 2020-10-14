import java.util.HashSet;
import java.util.Set;

public class Symetric {
    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        HashSet<T> d1 = new HashSet<>();
        HashSet<T> d2 = new HashSet<>();
        for (T a:set1)
        {
            if(!(set2.contains(a)))
            {d1.add(a);}}
        for (T a:set2)
        {
            if(!(set1.contains(a)))
            {d1.add(a);}

        }
        return d1;}
    public static void main(String[] args) throws Exception {
        Set<String> h1 = new HashSet<String>();
        h1.add("a");
        h1.add("b");
        h1.add("c");
        Set<String> h2 = new HashSet<String>();
        h2.add("b");
        h2.add("d");
        h2.add("e");
        System.out.println(symmetricDifference(h1,h2));


    }
}