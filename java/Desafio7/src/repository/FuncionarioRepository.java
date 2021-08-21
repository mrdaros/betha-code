package repository;

import model.Diretor;
import model.Funcionario;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioRepository implements IRepository<Funcionario> {
    @Override
    public List<Funcionario> findAll() throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM empresa.funcionario ");
        ResultSet resultSet = null;
        resultSet = statement.executeQuery();

        List<Funcionario> funcionario = new ArrayList<>();

        System.out.println("---- BUSCA TODOS FUNCIONÁRIOS ----");
        while (resultSet.next()) {
            Funcionario funcionarioAux = new Funcionario();
            funcionarioAux.setId(resultSet.getInt(1));
            funcionarioAux.setNome(resultSet.getString(2));
            funcionarioAux.setCpf(resultSet.getString(3));
            funcionarioAux.setSalario(resultSet.getDouble(4));
            funcionario.add(funcionarioAux);
//            String index = resultSet.getString(2);
//            System.out.println(index);
        }
        //System.out.println("---- BUSCA TODOS FIM FUNCIONÁRIOS ----");
        conn.close();

        return funcionario;
    }

    @Override
    public Funcionario findById(Integer id) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement3 = conn.prepareStatement("SELECT * FROM empresa.funcionario WHERE id = ?");
        statement3.setInt(1, id);
        ResultSet resultSet3 = null;
        resultSet3 = statement3.executeQuery();

        Funcionario funcionario = new Funcionario();
        System.out.println("---- Listagem POR ID FUNCIONÁRIOS ----");
        while (resultSet3.next()) {
            funcionario.setId(resultSet3.getInt(1));
            funcionario.setNome(resultSet3.getString(2));
            funcionario.setCpf(resultSet3.getString(3));
            funcionario.setSalario(resultSet3.getDouble(4));
//            String index = resultSet3.getString(2);
//            System.out.println(index);
        }
        //System.out.println("---- Listagem POR ID FIM FUNCIONÁRIOS ----");
        conn.close();

        return funcionario;
    }
}
