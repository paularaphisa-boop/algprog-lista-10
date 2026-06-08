public class Livro {

    // Atributos
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private String editora;

    // Construtor
    public Livro(String titulo, String autor, int numeroPaginas, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.editora = editora;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    // Métodos
    public void abrir() {
        System.out.println("Livro aberto.");
    }

    public void ler() {
        System.out.println("Lendo o livro.");
    }

    public void fechar() {
        System.out.println("Livro fechado.");
    }

    public void marcarPagina() {
        System.out.println("Página marcada.");
    }
}

