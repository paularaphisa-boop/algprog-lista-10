public class Bicicleta {

    // Atributos
    private String marca;
    private String cor;
    private int numeroMarchas;
    private String tamanho;

    // Construtor
    public Bicicleta(String marca, String cor, int numeroMarchas, String tamanho) {
        this.marca = marca;
        this.cor = cor;
        this.numeroMarchas = numeroMarchas;
        this.tamanho = tamanho;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroMarchas() {
        return numeroMarchas;
    }

    public void setNumeroMarchas(int numeroMarchas) {
        this.numeroMarchas = numeroMarchas;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    // Métodos
    public void pedalar() {
        System.out.println("Pedalando.");
    }

    public void frear() {
        System.out.println("Freando.");
    }

    public void virar() {
        System.out.println("Virando.");
    }

    public void estacionar() {
        System.out.println("Bicicleta estacionada.");
    }
    
}
