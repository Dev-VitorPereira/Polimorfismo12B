public class Peixe extends Animal {
    private String corEscama;

    public Peixe(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros); // Chama o construtor da superclasse Animal
        this.corEscama = corEscama;
    }

    public void soltarBolhas() {
        System.out.println("soltando bolha");
    }

    @Override
    public void alimentar() {
        System.out.println("Materia");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void emitirsom() {
        System.out.println("som peixe");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
