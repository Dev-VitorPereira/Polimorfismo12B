public class Reptil extends Animal {
    private String corEscama;

    public Reptil(float peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros); // Chama o construtor da superclasse Animal
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("vegetal");
    }

    @Override
    public void emitirsom() {
        System.out.println("som reptil");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
