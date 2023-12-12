package chap_04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _07_IteratorAndSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        // Iterator 객체 생성
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
            int num = it.next();
            System.out.println(num);
            // 1 2 3
        }

        // Iterator 객체 초기화
        it = set.iterator();

        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 0) {
                it.remove();
            }
        }
        System.out.println(set);
        // [1, 3]
    }
}
