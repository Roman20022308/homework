import java.io.Serializable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
*Класс вектора со свойствами <b>x</b>,<b>y</b>,<b>z</b>
*@autor Юссуфьянов Роман
*@version 1769
 */
public class Vector implements Serializable {
    /*поля координат*/

    private double x,y,z;
    /**
    *Конструктор нового вектора
    *@see Vector#Vector(double,double,double)
     */
    public Vector()
    {
        x=0;
        y=0;
        z=0;
    }
    /**
     *Конструктор нового вектора
     *@param x -координата x
     * @param y - координата y
     * @param z -координата z
     * @see Vector#Vector()
     * @since 1769
     */

    public  Vector(double x, double y, double z)
    {
        this.x=x;
        this.y=y;
        this.z=z;
    }
    /**
     *Данный метод получает длину вектора
     *@return возвращает длину
     */
    public double length(){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));

    }
    /**
     *Фуекция получения скалярного произведения векторов
     *@return возвращает скалярное произведение
     */
    public double scalarProduct(Vector vector){
        return x*vector.x+y*vector.y+z*vector.z;


    }
    /**
     *Фуекция получения векторное произведения векторов
     *@return возвращает векторное произведение
     */

    // метод, вычисляющий векторное произведение
    public Vector crossProduct(Vector vector){

        return new Vector(y*z-z*vector.y,z*vector.x-x*z,x*vector.y-y*vector.x);

    }
    /**
     *Фуекция получения косинуса угла между векторами
     *@return возвращает косинуса угла между векторами
     */

    // Косинус между двумя векторами
    public double cos(Vector vector){
        return this.scalarProduct(vector)/(this.length()+vector.length());

    }
    /**
     *Фуекция получения вектора суммы данных векторов
     *@return возвращает вектор суммы данных векторов
     */
    // Сумма двух векторов
    public Vector add(Vector vector){

        return new Vector(x+vector.x,y+vector.y,z+vector.z);

    }
    /**
     *Фуекция получения вектора разности данных векторов
     *@return возвращает вектор разности данных векторов
     */

    // Разность двух веторов
    public Vector subtract(Vector vector){
        return new Vector(x-vector.x,y-vector.y,z-vector.z);

    }
    /**
     *Фуекция проверяет равны ли вектора
     *@return возвращает равны ли вектора
     */
    boolean equals(Vector vector2)
    {
        if(x==vector2.x&&y==vector2.y&&z==vector2.z)
        {return true;}
        else {return false;}
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

