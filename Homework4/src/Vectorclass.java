import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class Vectorclass {
    @Test

        public void CheckLengh() {
            Vector vector1 = new Vector(3,4,0);
            Vector vector2 = new Vector(6,8,0);
            Vector vector3 = new Vector(12,16,0);



            assertEquals(5,vector1.length());

            assertTrue(vector2.length()==10);

            assertFalse(vector3.length()!=20);
        }
    @Test

    public void Checkcos() {
        Vector vector1 = new Vector(3,0,0);
        Vector vector2 = new Vector(0,3,0);
        Vector vector3 = new Vector(0,0,3);



        assertEquals(0,vector1.cos(vector2));

        assertTrue(vector1.cos(vector2)==0);

        assertFalse(vector3.cos(vector2)!=0);
    }
    @Test
    public void Checkadd() {
        Vector vector1 = new Vector(3,0,0);
        Vector vector2 = new Vector(0,3,0);
        Vector vector3 = new Vector(0,0,3);



        assertEquals(true,vector1.add(vector2).equals(new Vector(3,3,0)));
        assertTrue(vector1.add(vector3).equals(new Vector(3,0,3)));
        assertFalse(!vector2.add(vector3).equals(new Vector(0,3,3)));
    }
    @Test
    public void Checksubtract() {
        Vector vector1 = new Vector(3,0,0);
        Vector vector2 = new Vector(0,3,0);
        Vector vector3 = new Vector(0,0,3);



        assertEquals(true,vector1.subtract(vector2).equals(new Vector(3,-3,0)));
        assertTrue(vector1.subtract(vector3).equals(new Vector(3,0,-3)));
        assertFalse(!vector2.subtract(vector3).equals(new Vector(0,3,-3)));
    }
    @Test
    public void CheckcrossProduct() {
        Vector vector1 = new Vector(1,0,0);
        Vector vector2 = new Vector(1,0,0);
        Vector vector3 = new Vector(1,0,0);
        double a=0,b=0,c=0;
        Vector vector=new Vector(a,b,c);
        Vector q=vector1.crossProduct(vector2);




        assertEquals(true,vector1.crossProduct(vector2).equals(vector));

        assertTrue(vector1.crossProduct(vector2).equals(vector));

        assertFalse(!vector3.crossProduct(vector2).equals(vector));
    }


    @Test
    public void CheckscalarProduct() {
        Vector vector1 = new Vector(3,0,0);
        Vector vector2 = new Vector(0,3,0);
        Vector vector3 = new Vector(0,0,3);



        assertEquals(0,vector1.scalarProduct(vector2));

        assertTrue(vector1.scalarProduct(vector2)==0);

        assertFalse(vector3.scalarProduct(vector2)!=0);
    }


    @Test
    public void Checkequals() {
        Vector vector11 = new Vector(3,0,0);
        Vector vector12 = new Vector(3,0,0);
        Vector vector31 = new Vector(0,0,3);
        Vector vector32 = new Vector(0,0,3);
        Vector vector21 = new Vector(0,3,0);
        Vector vector22 = new Vector(0,3,0);



        assertEquals(true,vector11.equals(vector12));

        assertTrue(vector21.equals(vector22));

        assertFalse(vector31.equals(vector22));
    }
    @Test



    @Disabled
        public void setName() {
        }


}
