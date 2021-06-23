import java.util.Scanner;

public class ex2_5 {
    public static void main(String[] args) {
        /* Item 5 */
        Scanner s = new Scanner(System.in);
        double h = 0;
        double b = 0;
        double B = 0;
        double area = 0;

        System.out.println("Informe a altura: ");
        h = s.nextDouble();

        System.out.println("Informe a base menor: ");
        b = s.nextDouble();

        System.out.println("Informe a base maior: ");
        B = s.nextDouble();

        area = (h * (b + B))/2;

        System.out.println("A área do trapézio é: " + area);

    }
}
