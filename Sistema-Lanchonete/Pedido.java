import java.util.ArrayList;

public class Pedido {
    private String nomeCliente;
    private ArrayList<Produto> itens;

    public Pedido(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto p) {
        itens.add(p);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto p : itens) {
            total += p.getPreco();
        }
        if (total > 50.0) {
            total *= 0.9; // Motivo de ser 0.9%: Basicamente o total é 100% então se eu quero menos 10% eu multiplico por 90% o valor.
        }
        return total;
    }

    public void exibir() {
        System.out.println("=== Pedido de: " + nomeCliente + " ===");

        for (Produto p : itens) {
            String nome = p.getNome();
            String precoFormatado = String.format("R$ %.2f", p.getPreco()).replace(',', '.'); // ponto decimal

            int pontos = 40 - nome.length();
            if (pontos < 0) pontos = 0;

            String linha = "- " + nome + " ";
            for (int i = 0; i < pontos; i++) {
                linha += ".";
            }
            linha += " " + precoFormatado;
            System.out.println(linha);
        }

        String totalFormatado = String.format("R$ %.2f", calcularTotal()).replace(',', '.');
        System.out.println("Total: " + totalFormatado);
    }
}