package repository;

import model.Diretor;
import util.ConnectionManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DiretorRepository implements IRepository<Diretor> {
    @Override
    public List<Diretor> findAll() throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement = conn.prepareStatement("SELECT * FROM empresa.diretor ");
        ResultSet resultSet = null;
        resultSet = statement.executeQuery();

        List<Diretor> diretor = new ArrayList<>();

        System.out.println("---- BUSCA TODOS DIRETORES ----");
        while (resultSet.next()) {
            Diretor diretorAux = new Diretor();
            diretorAux.setId(resultSet.getInt(1));
            diretorAux.setNome(resultSet.getString(2));
            diretorAux.setCpf(resultSet.getString(3));
            diretorAux.setSalario(resultSet.getDouble(4));
            diretorAux.setBonus(resultSet.getDouble(5));
            diretor.add(diretorAux);
            //String index = resultSet.getString(2);
            //System.out.println(index);
        }
        //System.out.println("---- BUSCA TODOS FIM DIRETORES ----");
        conn.close();

        return diretor;
    }

    @Override
    public Diretor findById(Integer id) throws SQLException, ClassNotFoundException {
        Connection conn = ConnectionManager.getConnection();
        PreparedStatement statement3 = conn.prepareStatement("SELECT * FROM empresa.diretor WHERE id = ?");
        statement3.setInt(1, id);
        ResultSet resultSet3 = null;
        resultSet3 = statement3.executeQuery();

        Diretor diretor = new Diretor();

        System.out.println("---- Listagem POR ID DIRETORES ----");
        while (resultSet3.next()) {
            diretor.setId(resultSet3.getInt(1));
            diretor.setNome(resultSet3.getString(2));
            diretor.setCpf(resultSet3.getString(3));
            diretor.setSalario(resultSet3.getDouble(4));
            diretor.setBonus(resultSet3.getDouble(5));
//            String index = resultSet3.getString(2);
//            System.out.println(index);
        }
        //System.out.println("---- Listagem POR ID FIM DIRETORES ----");
        conn.close();

        return diretor;
    }
}
