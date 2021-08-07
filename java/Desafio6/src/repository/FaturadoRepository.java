package repository;

public class FaturadoRepository implements Buscavel {
    @Override
    public void findById(Long id) {
        System.out.println("Listando por ID");
    }

    @Override
    public void findAll() {
        System.out.println("Listando");
    }
}
