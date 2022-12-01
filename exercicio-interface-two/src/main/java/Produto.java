public abstract class Produto implements Vendavel{

    private Integer codigo;
    private Double precoCusto;

    public Produto(Integer codigo, Double precoCusto) {
        this.codigo = codigo;
        this.precoCusto = precoCusto;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo() {
        this.codigo = codigo;
    }

    public Double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(Double precoCusto) {
        this.precoCusto = precoCusto;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("codigo=").append(codigo);
        sb.append(", precoCusto=").append(precoCusto);
        sb.append('}');
        return sb.toString();
    }
}
