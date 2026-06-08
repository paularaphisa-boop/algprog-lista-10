public class Celular {

    // Atributos
    private String marca;
    private String modelo;
    private String sistemaOperacional;
    private int memoria;

    // Construtor
    public Celular(String marca, String modelo, String sistemaOperacional, int memoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperacional = sistemaOperacional;
        this.memoria = memoria;
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    // Métodos
    public void ligar() {
        System.out.println("Celular ligado.");
    }

    public void enviarMensagem() {
        System.out.println("Mensagem enviada.");
    }

    public void tirarFoto() {
        System.out.println("Foto tirada.");
    }

    public void acessarInternet() {
        System.out.println("Acessando internet.");
    }

}
