public class Aviao {

    // Atributos
    private String modelo;
    private String companhiaAerea;
    private int capacidadePassageiros;
    private int numeroMotores;

    // Construtor
    public Aviao(String modelo, String companhiaAerea,
                 int capacidadePassageiros, int numeroMotores) {
        this.modelo = modelo;
        this.companhiaAerea = companhiaAerea;
        this.capacidadePassageiros = capacidadePassageiros;
        this.numeroMotores = numeroMotores;
    }

    // Getters e Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCompanhiaAerea() {
        return companhiaAerea;
    }

    public void setCompanhiaAerea(String companhiaAerea) {
        this.companhiaAerea = companhiaAerea;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public void setCapacidadePassageiros(int capacidadePassageiros) {
        this.capacidadePassageiros = capacidadePassageiros;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    // Métodos
    public void decolar() {
        System.out.println("Avião decolando.");
    }

    public void voar() {
        System.out.println("Avião em voo.");
    }

    public void pousar() {
        System.out.println("Avião pousando.");
    }

    public void transportarPassageiros() {
        System.out.println("Transportando passageiros.");
    }

}
    
