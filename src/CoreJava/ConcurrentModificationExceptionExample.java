package CoreJava;

import java.util.*;

public class ConcurrentModificationExceptionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator<String> it =  list.iterator();
        while (it.hasNext()) {
            String next = it.next();
            System.out.println("List Value:"+next);
            if (next.equals("3")) {
                list.remove(next);
            }

            Map<String,String> map = new HashMap<>();
            map.put("1","1");
            map.put("2","2");
            map.put("3","3");
            map.put("4","4");

            Iterator<String> iterator = map.keySet().iterator();
            while (iterator.hasNext()){
                String next1 = iterator.next();
                System.out.println(map.get(next1));
                if (next1.equals("1")) {
                    map.put("1","4");
                }
            }
        }

    }
}
