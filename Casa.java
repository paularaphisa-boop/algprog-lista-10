public class Casa {
    
    // Atributos
    private String endereco;
    private int numeroQuartos;
    private String cor;
    private double area;

    // Construtor
    public Casa(String endereco, int numeroQuartos, String cor, double area) {
        this.endereco = endereco;
        this.numeroQuartos = numeroQuartos;
        this.cor = cor;
        this.area = area;
    }

    // Getters e Setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    // Métodos
    public void abrirPorta() {
        System.out.println("Porta aberta.");
    }

    public void fecharPorta() {
        System.out.println("Porta fechada.");
    }

    public void acenderLuz() {
        System.out.println("Luz acesa.");
    }

    public void receberMoradores() {
        System.out.println("Moradores recebidos.");
    }

}
    
