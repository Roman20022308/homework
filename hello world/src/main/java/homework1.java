public class homework1 {

    //ВАЖНО!
    //модификаторы методов оставьте public - так нужно мне для тестов

    //посчитать факториал числа n
    //0.5б - если посчитаете в цикле
    //1б - если посчитаете рекурсией
    public static int fact(int n){
        int x;
        if(n==1) {
        return 1;
        }
        else
        {
            return fact((n-1))*n;
        }


    }

    //вывести таблицу умножения на экран - 1б
    //подсказка - использовать двойной for
    public static void table(){
        for(int i=1;i<11;i++){
            for(int u=1;u<11;u++){
                System.out.print(i*u+" ");
                if(u==10) {
                    System.out.print("\n");
                }


            }
        }
    }

    //посчитать сумму цифр числа
    //можно посчитать для трехзначного - 0.5б
    //для любого числа - 1б
    //подсказка - в случае для любого числа используйте while
    public static int sum(int n){
        int x=0;
        while(n>0){
            x+=n%10;
            n=n/10;


        }
        return x;
    }

    //определить, является ли год високосным
    //В високосном году - 366 дней, тогда как в обычном - 365.
    //Високосным годом является каждый четвёртый год, за исключением столетий, которые не кратны 400.
    //Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
    //Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
    //Годы 2100, 2200 и 2300 - не високосные.
    //за правильный ответ - 0.5б
    public static boolean isLeapYear(int year) {
        if(year%400==0||(year%100!=0&&year%4==0)){
            return true;
        }
        else {
         return false;
        }

    }

    //здесь вам нужно будет использовать результат прошлой задачи
    //и вывести, сколько дней в году
    //правильный ответ - 0.5б
    public static int daysInYear(int year) {
        if (isLeapYear(year)){
            return 366;
        } else {
            return 365;
        }

    }

    //определить номер дня недели по строке
    //например: Понедельник - 1
    //правильный ответ - 1б
    public static int dayOfTheWeek(String n){
        String[] x={"Понедельник","Вторник","Среда","Четверг","Пятница","Суббота","Воскресенье"};
        for(int i=0;i<7;i++)
        {
            if(x[i]==n)
            {
                return i+1;
            }
        }
        return 0;
    }

    //вывести массив на экран в виде: [1, 5, 3, 7, 10, 2, 5]
    //правильное решение - 0.5б
    public static void printArray(int[] array){
        System.out.print("[");
        for(int i=0; i<array.length-1;i++)
        {
            System.out.print(array[i]+", ");
        }
        if(array.length>0)
        {
            System.out.print(array[array.length-1]);
        }

        System.out.println("]");

        //Ваше решение здесь
    }

    //вывести двойной массив на экран в виде:
    // [1, 5, 3, 7, 10, 2, 5]
    // [1, 5, 3, 7, 10, 2, 5]
    // ...
    //правильное решение - 0.5б
    public static void printArray(int[][] array){
        //Ваше решение здесь
        for(int i=0;i<array.length;i++)
        {
            printArray(array[i]);

        }
    }

    //отсортировать одномерный массив в порядке возрастания
    //если не знаете, как сортировать, то подсказка -
    //метод пузырька (один из самых простых для понимания)
    //правильный ответ - 1б
    public static int[] sort(int[] array){
        int i=0;
        while(i<array.length-1)
        {if(array[i]>array[i+1])
        {
            int t=array[i];
            array[i]=array[i+1];
            array[i+1]=t;
            i=0;

        }
        else {
            i+=1;
        }

        }

        //Ваше решение здесь
        return array;
    }


    //здесь можете тестировать свои решения
    public static void main(String[] args){
        System.out.println("Факториал:");
        System.out.println(fact(5));

        System.out.println("Таблица умножения:");
        table();

        System.out.println("Сумма цифр числа:");
        System.out.println(sum(12345));

        System.out.println("Дней в году:");
        System.out.println(daysInYear(2019));

        System.out.println("День недели:");
        System.out.println(dayOfTheWeek("Понедельник"));

        int[] array1D = {1,5,3,7,10,2,5};
        System.out.println("Вывод отсортированного массива:");
        printArray(sort(array1D));

        System.out.println("Вывод двумерного массива:");
        int[][] array2D = {{1,5,3,7,10,2,5}, {1,5,3,7,10,2,5}};
        printArray(array2D);
    }
}