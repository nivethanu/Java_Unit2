public class Program4 {
    public static void main(String[] args) {
        int[][] m = {
            {1, 2},
            {3, 4}
        };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
