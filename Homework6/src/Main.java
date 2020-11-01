import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//*Я не списывал у Ярика)
public class Main {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        for (int i=0;i<9;i++ )
        {
            String name= String.valueOf(i*2+2);
            String surname= String.valueOf(i*2+1);
            map.put(surname,name);
        }
        map.put("33","2");
        return map;
    }
    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        HashSet<String> h = new HashSet<String>();
        HashSet<String> namesForDelete = new HashSet<String>();


        for (Map.Entry<String, String> m : map.entrySet()){
            if(h.contains(m.getValue()))
            {
                namesForDelete.add(m.getValue());
            }
            else {h.add(m.getValue());}
        }
        for (String m : namesForDelete){
            removeItemFromMapByValue(map,m);
        }

    }
    public static void removeItemFromMapByValue(Map<String, String> map, String value) {

            Set <String> keys=new HashSet<String>();
            keys.addAll(map.keySet());
            for (String key : keys){
                if(map.get(key).equals(value))
                {
                    map.remove(key);
                }
            }
    }
    public static void printMap(Map<String,String> map){
        for(Map.Entry<String,String> x: map.entrySet())
        {
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Map h=createMap();
        printMap(h);
        removeTheFirstNameDuplicates(h);
        printMap(h);



    }
}

