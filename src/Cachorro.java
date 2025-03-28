public class Cachorro extends Mamifero {

    private String nome;

    public Cachorro(float peso, int idade, int membros, String corPelo, String nome) {
        super(peso, idade, membros, corPelo); // Chama o construtor de Mamifero
        this.nome = nome;
    }

    @Override
    public void alimentar() {
        System.out.println("comendo raçao");
    }

    @Override
    public void emitirsom() {
        System.out.println("latindo");

    }

    public void enterrarOsso() {
        System.out.println("Enterrando osso");
    }

    public void abanarRabo() {
        System.out.println("abanando o rabo");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\n" +
                "Peso: " + this.getPeso() + "\n" +
                "Idade: " + this.getIdade() + "\n" +
                "Membros: " + this.getMembros() + "\n" +
                "Cor do Pelo: " + this.getCorPelo();
    }


}
