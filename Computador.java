public class Computador {

    // Atributos
    private String processador;
    private int memoriaRAM;
    private int armazenamento;
    private String sistemaOperacional;

    // Construtor
    public Computador(String processador, int memoriaRAM,
                      int armazenamento, String sistemaOperacional) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.sistemaOperacional = sistemaOperacional;
    }

    // Getters e Setters
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    // Métodos
    public void ligar() {
        System.out.println("Computador ligado.");
    }

    public void executarProgramas() {
        System.out.println("Executando programas.");
    }

    public void salvarArquivos() {
        System.out.println("Arquivos salvos.");
    }

    public void desligar() {
        System.out.println("Computador desligado.");
    }


}
    

