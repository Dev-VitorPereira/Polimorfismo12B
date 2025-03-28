
public class Main {
    public static void main(String[] args) {

        Cachorro c1 = new Cachorro(20.1f, 5, 4, "preto", "Rex");
        System.out.println(c1.toString());
        System.out.println("------");
        c1.abanarRabo();
        c1.alimentar();

    }
}