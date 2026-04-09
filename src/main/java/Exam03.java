public class Exam03 {
    public static void main(String[] args) {

        int n = 4; // 최대 별 개수

        // 위쪽 삼각형
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        // 아래쪽 역삼각형
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j <= i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
