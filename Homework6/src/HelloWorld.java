
    import java.util.*;
    public class HelloWorld{

        public static class Util {
            public static <T> T getValue(Object obj) {
                return (T) obj;
            }
        }

        public static void main(String []args) {
            List list = Arrays.asList(2, 3);
            for (Object element : list) {
                System.out.println(Util.<Integer>getValue(element) + 1);
            }
        }
    }

