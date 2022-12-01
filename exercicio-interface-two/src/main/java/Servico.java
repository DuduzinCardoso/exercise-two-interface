public class Servico implements Vendavel{

    private String descricao;
    private Integer codigo;
    private Double qtdHoras;
    private Double valorHora;

    public Servico(String descricao, Integer codigo, Double qtdHoras, Double valorHora) {
        this.descricao = descricao;
        this.codigo = codigo;
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    @Override
    public double getValorVenda() {
        return qtdHoras * valorHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getQtdHoras() {
        return qtdHoras;
    }

    public void setQtdHoras(Double qtdHoras) {
        this.qtdHoras = qtdHoras;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return String.format("Descrição do serviço: %s\n"
                        + "Código do Serviço: %d \n"
                        + "Quantidade de horas trabalhadas: %.2f\n"
                        + "Valor por hora trabalhada: R$%.2f \n" +
                        "Valor total do serviço: R$%.2f\n"
                        + "*-----------------*--------------*\n",
                descricao, codigo, qtdHoras, valorHora,  getValorVenda());
    }
}
