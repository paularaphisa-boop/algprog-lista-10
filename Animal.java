public class Animal {
    private String especie;
    private int idade;
    private String cor;
    private double peso;

    public Animal (String especie, int idade, String cor, double peso){
        this.especie = especie;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    
    public void correr() {
        System.out.println("Animal correndo.");
    }

    public void comer() {
        System.out.println("Animal comendo.");
    }

    public void dormir() {
        System.out.println("Animal dormindo.");
    }

    public void emitirSom() {
        System.out.println("Animal emitindo som.");
    }
    
}
