public class ex2_6 {
    public static void main(String[] args) {
        /* Item 6 */
        for (int i = 15; i <= 35; i++) {
            if ((i % 2) != 0) {
                System.out.println("O número " + i + " é ímpar. Seu quadrado é " + Math.pow(i, 2));
            }
        }
    }
}
