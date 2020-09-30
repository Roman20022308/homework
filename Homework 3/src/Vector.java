import java.io.Serializable;
public class Vector implements Serializable {
    private double x,y,z;
    public Vector()
    {
        x=0;
        y=0;
        z=0;
    }
    public  Vector(double x, double y, double z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    // Длина вектора. Корень из суммы квадратов
    public double length(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));

    }
    public double scalarProduct(Vector vector){
        return x*vector.x+y*vector.y+z*vector.z;


    }

    // метод, вычисляющий векторное произведение
    public Vector crossProduct(Vector vector){

        return new Vector(y*z-z*vector.y,z*vector.x-x*z,x*vector.y-y*vector.x);

    }

    // Косинус между двумя векторами
    public double cos(Vector vector){
        return this.scalarProduct(vector)/(this.length()+vector.length());

    }

    // Сумма двух векторов
    public Vector add(Vector vector){

        return new Vector(x+vector.x,y+vector.y,z+vector.z);

    }

    // Разность двух веторов
    public Vector subtract(Vector vector){
        return new Vector(x-vector.x,y-vector.y,z-vector.z);

    }

    public static void main(String[] args) {
        Vector a=new Vector(1,1,1);
        Vector b=new Vector(2,2,2);
        System.out.println(a.length());
        Vector c=a.add(b);
        double d=a.cos(b);
        Vector e=a.crossProduct(b);
        Vector t=a.subtract(b);
        double y=a.scalarProduct(b);
        double u=a.length();

    }


}

