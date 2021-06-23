public class ControleFluxoWhileMain {
    public static void main(String[] args) {
        int x = 10;

        while(x == 10){
            System.out.println("Item x: " + x);
            x++;
        }

        int y = 10;
        do {
            System.out.println("Item y :" + y);
            y++;
        } while (y < 10);
    }
}
