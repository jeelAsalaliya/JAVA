public class continuelabel {
    public static void main(String[] args) {
        outer: for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (j > i) {
                    System.out.println();
                    continue outer;
                }
                System.out.println("" + j);
            }
        }
        System.out.println();
    }
}
