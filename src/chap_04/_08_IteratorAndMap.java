package chap_04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _08_IteratorAndMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        // Iterator 객체 생성
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("키: " + key + ", 값: " + value);
            /*
             * 키: 1, 값: A
             * 키: 2, 값: B
             * 키: 3, 값: C
             * */
        }

        // Iterator 객체 초기화
        it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            if (entry.getValue().equals("B")) {
                it.remove();
            }
        }
        System.out.println(map);
        // {1=A, 3=C}
    }
}
