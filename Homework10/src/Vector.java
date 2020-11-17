
public class Vector {
    int x,y,z;
    public  Vector(int x, int y, int z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    // Длина вектора. Корень из суммы квадратов
    double length(){
        double s;
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));

    }
    double scalarProduct(Vector vector){
        return x*vector.x+y*vector.y+z*vector.z;


    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector){

        return new Vector(y*z-z*vector.y,z*vector.x-x*z,x*vector.y-y*vector.x);

    }

    // Косинус между двумя векторами
    double cos(Vector vector){
        return this.scalarProduct(vector)/(this.length()+vector.length());

    }

    // Сумма двух векторов
    Vector add(Vector vector){
        Vector vector3= new Vector(x+vector.x,y+vector.y,z+vector.z);
        return vector3;

    }

    // Разность двух веторов
    Vector subtract(Vector vector){
        Vector vector3= new Vector(x-vector.x,y-vector.y,z-vector.z);
        return vector3;

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

