package chap_01;

public class _03_While {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            // 1 2 3 4 5
            i++;
        }
    }
}

class WhileExam {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 10) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
            // 2 4 6 8 10
        }
    }
}