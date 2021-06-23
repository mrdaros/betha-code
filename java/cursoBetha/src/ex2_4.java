import java.util.Scanner;

public class ex2_4 {
    public static void main(String[] args) {
        /* Item 4 */
        Scanner s = new Scanner(System.in);
        int invertido = 0;
        int numero = 0;
        do {
            System.out.println("Dígite um número de no máximo 4 dígitos: ");
            numero = s.nextInt();
        } while (numero > 9999 || numero < 0);

        while (numero != 0 ) {
            invertido = invertido * 10;
            invertido = invertido + (numero%10);
            numero = numero/10;
        }
        System.out.println("Invertido: " + invertido);

    }
}
