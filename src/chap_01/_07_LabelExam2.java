package chap_01;

public class _07_LabelExam2 {
    public static void main(String[] args) {
        outter:
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                if (i == 0 && k == 2) {
                    continue outter;
                }
                System.out.println(i + ", " + k);
            }
        }
    }
}

/**
 * 0, 0
 * 0, 1
 * 1, 0
 * 1, 1
 * 1, 2
 * 2, 0
 * 2, 1
 * 2, 2
 */