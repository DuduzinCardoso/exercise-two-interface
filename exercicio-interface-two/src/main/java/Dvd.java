public class Dvd extends Produto {

    private String nome;
    private String gravadora;

    public Dvd(Integer codigo, Double precoCusto, String nome, String gravadora) {
        super(codigo, precoCusto);
        this.nome = nome;
        this.gravadora = gravadora;
    }

    @Override
    public double getValorVenda() {
        double valorTaxa = getPrecoCusto() * 0.2;
        return valorTaxa + getPrecoCusto();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGravadora() {
        return gravadora;
    }

    public void setGravadora(String gravadora) {
        this.gravadora = gravadora;
    }

    @Override
    public String toString() {
        return String.format("Código do Dvd: %d\n" +
                        "Preço do Dvd: R$%.2f\n" +
                        "Nome do Dvd: %s\n"
                        + "Gravadora: %S \n"
                        + "Valor do Dvd + taxa: R$%.2f \n"
                        + "*-----------------*--------------*\n",
                getCodigo(), getPrecoCusto() ,nome, gravadora, getValorVenda());
    }
}
