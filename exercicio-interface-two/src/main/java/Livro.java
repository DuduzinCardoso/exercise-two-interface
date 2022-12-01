public class Livro extends Produto{

    private String nome;
    private String autor;
    private String isbn;

    public Livro(Integer codigo, Double precoCusto, String nome, String autor, String isbn) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public double getValorVenda() {
        double valorTaxa = getPrecoCusto() * 0.1;
        return valorTaxa + getPrecoCusto();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return String.format("Código do livro: %d\n" +
                        "Preço do livro: R$%.2f\n" +
                        "Nome do livro: %s\n"
                        + "Autor do livro: %s \n"
                        + "ISBN: %s\n" +
                          "Valor do livro + taxa: R$%.2f\n"
                        + "*-----------------*--------------*\n",
                getCodigo(), getPrecoCusto(), nome, autor, isbn, getValorVenda());
    }
}
