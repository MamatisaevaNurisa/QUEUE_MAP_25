import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Deque<Integer>queue  = new ArrayDeque<>();

//            @Override
//            public int compare(Integer o1, Integer o2) {    //new Comparator<Integer>
//                return 0;
//            }
//        });


//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.add(5);
//        deque.add(50);
//        deque.add(500);
//        deque.add(5000);
//        deque.addFirst(5);
//
//        System.out.println(deque);

//for(Integer in : deque){
        // System.out.println(in);
//}

//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Uson");
//        map.put(2, "Malika");
//        map.put(3, "Nurisa"); //settin copotunda map ishhteit
//
////        System.out.println(map);
////        System.out.println(map.get(2));
//        for (Map.Entry<Integer, String> m : map.entrySet()) {
//            System.out.println(m.getKey() + ":" + m.getValue());
//        }

        Cat cat1 = new Cat(1, 45);
        Cat cat2 = new Cat(2, 35);
        Cat cat3 = new Cat(3, 54);

        Map<Integer, Cat> map = new TreeMap<>();
        map.put(cat1.getID(), cat1);
        map.put(cat2.getID(), cat2);
        map.put(cat3.getID(), cat3);

        for(Integer s: map.keySet()){
            System.out.println(s+":"+map.get(s));
        }


    }
}