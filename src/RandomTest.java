import java.util.*;

public class RandomTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        function(set);
        function(arrayList);
        function(linkedList);

    }

    public static void function(Collection<Integer> o){
        Random random = new Random();
        for (int i = 0; i < 500000; i++) {
            int randNum = random.nextInt();
            o.add(randNum);
        }
        long start = System.currentTimeMillis();
        Iterator<Integer> iterator = o.iterator();
        System.out.println("Start reading...");
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if(next % 2 == 0){
                iterator.remove();
            }
        }
        long finish = System.currentTimeMillis();
        System.out.println("Finish." + (finish-start)/1000.0 + " sec");

    }

}
