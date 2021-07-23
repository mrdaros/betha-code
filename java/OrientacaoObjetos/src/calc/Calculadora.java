package calc;

public class Calculadora {


    public void calcular(int a, int b) {
        System.out.println("Soma integer: " + (a+b));
    }

    public void calcular(double a, double b) {
        System.out.println("Soma double: " +(a+b));
    }
    public void calcular(String a, String b) {
        System.out.println("Soma string: "+ (a+b));
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.calcular(1.2, 1.2);
        calc.calcular("1.2", "1.2");
        calc.calcular(1,1);
    }
}
