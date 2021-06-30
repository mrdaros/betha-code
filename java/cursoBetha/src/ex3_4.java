import javax.swing.JOptionPane;
import java.util.Scanner;

public class ex3_4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual a sua idade? ");
        int idade = s.nextInt();

        String mensagem = "Idade informada: " + idade;
        JOptionPane.showMessageDialog(null, mensagem);
    }
}
