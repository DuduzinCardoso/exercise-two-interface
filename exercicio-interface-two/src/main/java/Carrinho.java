import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<Vendavel> vendas;

    public Carrinho() {
        vendas = new ArrayList<>();
    }

    public void addVendas(Vendavel it){
        vendas.add(it);
    }

    public Double calculaTotalVenda() {
        double total = 0.0;
        for (Vendavel it : vendas) {
            total += it.getValorVenda();
        }
        return total;
    }

    public void exibirTodos(){
        System.out.println("Lista dos Produtos");
            System.out.println(vendas);
    }

    public List<Vendavel> getVendas() {
        return vendas;
    }

    public void setVendas(List<Vendavel> vendas) {
        this.vendas = vendas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Carrinho{");
        sb.append("vendas=").append(vendas);
        sb.append('}');
        return sb.toString();
    }
}
