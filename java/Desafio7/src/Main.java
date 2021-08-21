import model.Diretor;
import model.Funcionario;
import repository.DiretorRepository;
import repository.FuncionarioRepository;
import service.DiretorService;
import service.FuncionarioService;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Funcionario funcionario = new Funcionario(1, "Maria", "04696900975", 2000.0);
        Diretor diretor = new Diretor(1, "Olivia", "09854785768", 4000.0, 12.1);

        Funcionario funcionario2 = new Funcionario(2, "Alan", "98764367890", 2500.0);
        Diretor diretor2 = new Diretor(2, "Lorenzo", "12746528990", 3900.0, 10.0);

        FuncionarioService fService = new FuncionarioService();
        DiretorService dService = new DiretorService();

        FuncionarioRepository fRepository = new FuncionarioRepository();
        DiretorRepository dRepository = new DiretorRepository();

//        fService.save(funcionario);
//        dService.save(diretor);
//        fService.save(funcionario2);
//        dService.save(diretor2);

        System.out.println(fRepository.findAll());
        System.out.println(fRepository.findById(1));

        System.out.println(dRepository.findAll());
        System.out.println(dRepository.findById(1));

        funcionario.setNome(funcionario.getNome() + " - alterado");
        fService.update(funcionario);

        diretor.setNome(diretor.getNome() + " - alterado");
        dService.update(diretor);


        System.out.println(fRepository.findAll());
        System.out.println(fRepository.findById(1));

        System.out.println(dRepository.findAll());
        System.out.println(dRepository.findById(1));

//        fService.delete(funcionario);
//        dService.delete(diretor);

    }
}
