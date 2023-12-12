package chap_04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _06_IteratorAndList {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Iterator 객체 생성
        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            int num = it.next();
            System.out.println(num);
            // 1 2 3
        }


        // Iterator 객체 초기화
        it = numbers.iterator();

        while (it.hasNext()) {
            int num = it.next();
            if (num % 2 == 0) {
                it.remove();
            }
        }
        System.out.println(numbers);
        // [1, 3]

    }
}
