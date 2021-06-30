import javax.swing.JOptionPane;

public class ex3_6 {
    public static void main(String[] args) {
        double peso, altura;
        peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso em kg:"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura em m:"));
        String mensagem = "Seu IMC é: " + String.format("%.2f",peso/Math.pow(altura,2));

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
