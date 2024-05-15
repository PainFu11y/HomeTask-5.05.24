import java.util.*;
import java.util.Map.Entry;
public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
    map.put(12,"sdgaf");
    map.put(999,"sdgaf");
    map.put(45,"sdafaaqa");
    map.put(10,"sdgfaf");
    map.put(11,"sdgfuyaf");
    map.put(14,"sdaopadf");

    Set<Entry<Integer,String>> entries = map.entrySet();
    Iterator<Entry<Integer,String>> iterator = entries.iterator();

    while(iterator.hasNext()){
        Entry<Integer,String> next = iterator.next();

        if(next.getKey() < 20){
            System.out.println(next.getValue());
        }
    }

    }
}