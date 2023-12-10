package chap_01;

public class _04_Break {
    public static void main(String[] args) {
        // for 반복문
        for (int i = 1; i < 10; i++) {
            if (i == 3) {
                // i 가 3 이 되면 반복문을 종료
                break;
            }
            System.out.println(i); // 1 2
        }

        // while 반복문
        int i = 1;
        while (i <= 10) {
            if (i == 3) {
                // i 가 3 이 되면 반복문을 종료
                break;
            }
            System.out.println(i); // 1 2
            i++;
        }
    }
}
