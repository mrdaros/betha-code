package desafio4;

public class Desafio4Main {
    public static void main(String[] args) {

        Funcionario func = new Funcionario(1,
                "Marina",
                "São Domingos",
                "48993456275",
                "80274834567",
                "7524195",
                'F',
                20.00,
                15.00);

        PessoaFisica resp = new PessoaFisica(3,
                "César Smielevski",
                "Rua 123",
                "48993622378",
                "83647352748",
                "74693755",
                'M'
        );
        Fornecedor forn = new Fornecedor(1,
                "Betha Sistemas",
                "Julio Gaidzinski",
                "483444444",
                "00456865000752",
                "1234567890",
                "123456",
                resp,
                "obs"
                );


        Cliente cli = new Cliente(2,
                "Fulano",
                "Rua Principal",
                "4812345643",
                "83375827449",
                "84739",
                'M',
                50.0,
                25.0);

        System.out.println(resp);
        System.out.println(forn);

        System.out.println("Salário bruto antes do dissídio: " + func.getSalarioBruto());
        func.aplicarDissidio(10.0);
        System.out.println("Salário bruto depois do dissídio: " + func.getSalarioBruto());
        func.aplicarDissidio(0.00);
        System.out.println("Doc principal física: " + func.documentoPrincipal());

        System.out.println("Doc principal jurídica: " + forn.documentoPrincipal());

        System.out.println("Limite cliente antes aumento: " + cli.getLimiteCrediario());
        cli.aumentarLimite(50.0);
        System.out.println("Limite cliente após aumento: " + cli.getLimiteCrediario());
        cli.aumentarLimite(-50.00);
        cli.diminuirLimite(90.0);
        cli.diminuirLimite(25.0);
        System.out.println("Limite atual: " + cli.getLimiteCrediario());
    }

}
