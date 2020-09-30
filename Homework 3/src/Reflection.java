import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.String.*;
import java.lang.ref.*;
public class Reflection {



        public static void main(String[] args) throws Exception {
            //получаем класс
            Vector vector=null;




            Class clazz = Vector.class;

            Vector vector1 = (Vector) clazz.getConstructor().newInstance();
            Vector vector2 = (Vector) clazz.getConstructor().newInstance();




            //получаем список конструкторов
            clazz.getConstructors();

            //методы

            Method scalarProduct=clazz.getMethod("scalarProduct", Vector.class);
            Method cos=clazz.getMethod("cos", Vector.class);
            Method length= clazz.getMethod("length");
            Method subtract=clazz.getMethod("subtract", Vector.class);
            Method crossProduct=clazz.getMethod("crossProduct", Vector.class);
            Method add= clazz.getMethod("add", Vector.class);


            scalarProduct.invoke(vector1,vector2);
            cos.invoke(vector1,vector2);
            length.invoke(vector1);
            length.invoke(vector2);
            subtract.invoke(vector1,vector2);
            crossProduct.invoke(vector1,vector2);
            add.invoke(vector1,vector2);

            //получаем private поле и редактируем его
            Field fieldx1 = clazz.getDeclaredField("x");
            fieldx1.setAccessible(true);
            fieldx1.set(vector1,1 );
            Field fieldy1 = clazz.getDeclaredField("y");
            fieldy1.setAccessible(true);
            fieldy1.set(vector1, 2);
            Field fieldz1 = clazz.getDeclaredField("z");
            fieldz1.setAccessible(true);
            fieldz1.set(vector1, 3);
            Field fieldx2 = clazz.getDeclaredField("x");
            fieldx2.setAccessible(true);
            fieldx2.set(vector2, 4);
            Field fieldy2 = clazz.getDeclaredField("y");
            fieldy2.setAccessible(true);
            fieldy2.set(vector2, 5);
            Field fieldz2 = clazz.getDeclaredField("z");
            fieldz2.setAccessible(true);
            fieldz2.set(vector2, 6);
            System.out.println(length.invoke(vector1));
            System.out.println(length.invoke(vector2));
            System.out.println(crossProduct.invoke(vector1,vector2));
            System.out.println(cos.invoke(vector1,vector2));
            System.out.println(scalarProduct.invoke(vector1,vector2));
            System.out.println(add.invoke(vector1,vector2));



        }
    }



