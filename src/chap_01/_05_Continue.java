package chap_01;

public class _05_Continue {
    public static void main(String[] args) {
        // for 반복문
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                // 짝수인 경우 조건문으로 돌아간다.
                continue;
            }
            System.out.println(i); // 1 3
        }

        // while 반복문
        int a = 0;
        while (a < 5) {
            a++;
            if (a % 2 == 0) {
                // 짝수인 경우 조건문으로 돌아간다.
                continue;
            }
            System.out.println(a);  // 1 3 5
        }
    }
}
