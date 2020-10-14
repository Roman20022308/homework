//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Objects;

public class Pair<T, S> {
    private T i;
    private S s;

    private Pair(T i, S s) {
        this.i = i;
        this.s = s;
    }

    public static void main(String[] args) throws Exception {
        Pair<Integer, String> pair = of(1, "hello");
        Integer i = (Integer)pair.getFirst();
        String s = (String)pair.getSecond();
        Pair<Integer, String> pair2 = of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();
        System.out.println(i);
        System.out.println(s);
        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
    }

    public T getFirst() {
        return this.i;
    }

    public S getSecond() {
        return this.s;
    }

    public boolean equals(Pair pair) {
        if (!(pair instanceof Pair) ) {
            return false;
        } else {
            return Objects.equals(this.i, pair.getFirst()) && Objects.equals(this.s, pair.getSecond());
        }
    }

    public int hashCode() {
        return 3 * Objects.hashCode(this.i) * Objects.hashCode(this.s);
    }

    public static <T, S> Pair of(T i, S s) {
        Pair pair = new Pair(i, s);
        return pair;
    }
}