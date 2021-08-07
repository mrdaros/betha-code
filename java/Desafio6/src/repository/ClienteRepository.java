package repository;

public class ClienteRepository implements Buscavel {
    @Override
    public void findById(Long id) {
        System.out.println("Listando por ID");
    }

    @Override
    public void findAll() {
        System.out.println("Listando");
    }
}
