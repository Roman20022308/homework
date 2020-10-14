import java.util.NoSuchElementException;

public class MyArrayList implements SimpleList {

    public int array[];
    public int current_size=1;
    public int size=1;

    public MyArrayList() {
        this.array= new int[1];
        // ваш 1й конструктор
    }

    public MyArrayList(int capacity) {
        size=capacity;
        this.array= new int[size];
        // ваш 2й конструктор
    }

    @Override
    public void add(int item) {
        size =1;
        int[] a=new int[size];
        for(int i=0;i<size-1;i++  )
        {
            a[i]=array[i];

        }
        a[size-1]=item;
        array=a.clone();
        // ваш метод
    }

    @Override
    public int remove(int idx) throws NoSuchElementException {
        try{

            int element=array[idx];
            int [] a1=new int[size-1];
            for (int i=0;i<size;i++
            )
            {if(i<idx)
            {a1[i]=array[i];}
            else
            {a1[i]=array[i+1];}
            }
            size-=1;
            array=a1.clone();
            return element;

        }

        catch (Exception e)
        {
            e.printStackTrace();
        }
        return -1;

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int get(int idx) throws NoSuchElementException {
        try {
            ;
            return  array[idx];
        }
        catch (Exception e) {
            e.printStackTrace();
        }


        return -1;
    }

    MyArrayList m=new MyArrayList(3);


}