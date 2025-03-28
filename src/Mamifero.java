public class Mamifero extends Animal {
    private String corPelo;

    public Mamifero(float peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros); // Chama o construtor da superclasse Animal
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        System.out.println("correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirsom() {
        System.out.println("som de Mamifero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String toString() {
        return "Mamifero" +
                "\n" + this.getCorPelo();
    }
}
