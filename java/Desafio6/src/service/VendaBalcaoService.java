package service;

public class VendaBalcaoService implements Persistivel {
    @Override
    public void save() {
        System.out.println("Salvando");
    }

    @Override
    public void update() {
        System.out.println("Atualizando");
    }

    @Override
    public void remove() {
        System.out.println("Removendo");
    }
}
