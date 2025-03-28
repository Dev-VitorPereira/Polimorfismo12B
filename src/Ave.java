public class Ave extends Animal {


    public Ave(float peso, int idade, int membros) {
        super(peso, idade, membros); // Chama o construtor da superclasse Animal

    }

    private String corPena;

    @Override
    public void locomover() {
        System.out.println("voando");
    }

    @Override
    public void alimentar() {
        System.out.println("frutas");
    }

    @Override
    public void emitirsom() {
        System.out.println("som de ave");
    }

    public void fazerNinho() {
        System.out.println("construiu ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
