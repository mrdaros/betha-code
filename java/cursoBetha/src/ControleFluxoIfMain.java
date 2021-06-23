import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ControleFluxoIfMain {
    public static final double ALTURA_MEDIA = 1.5;
    public static final double SALARIO_DO_CARRION = 15000;

    public static void main(String[] args) {
        int ano = 2020;
        int a = 20, b = 20;

        if (ano < 0) {
            System.out.println("Não é um ano!");
        } else if ((ano%4==0 && ano%100!=0) || (ano%400==0)){
            System.out.println("É bissexto!");
        } else {
            System.out.println("Não é bissexto!");
        }

        if (a==b) {
            System.out.println("É igual.");
        } else {
            System.out.println("É diferente.");
        }

        double altura = 1.4;

        if (altura < ALTURA_MEDIA) {
            System.out.println("Baixinho.");
        } else {
            System.out.println("Altinho.");
        }

        double salario = 15000;
        if (salario >= SALARIO_DO_CARRION) {
            System.out.println("É o Carrion.");
        } else {
            System.out.println("Não é o Carrion.");
        }
    }
}
