import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Lanchonete {

    private HashMap<String, Produto> cardapio; // chave = código do produto
    private Queue<Pedido> filaDePedidos;
    private Stack<Pedido> historico;

    public Lanchonete() {
        cardapio = new HashMap<>();
        filaDePedidos = new LinkedList<>();
        historico = new Stack<>();
    }

    public void adicionarAoCardapio(Produto p) {
        cardapio.put(p.getCodigo() + "", p); // converte o código para String
    }

    public Produto buscarProduto(String codigo) {
        return cardapio.get(codigo);
    }

    public void fazerPedido(Pedido pedido) {
        filaDePedidos.add(pedido);
    }

    public void atenderProximo() {
        if (filaDePedidos.isEmpty()) {
            System.out.println("Nenhum pedido na fila");
            return;
        }

        Pedido pedido = filaDePedidos.poll();
        pedido.exibir();
        historico.push(pedido);
    }

    public void verUltimoAtendido() {
        if (historico.isEmpty()) {
            System.out.println("Nenhum pedido atendido ainda.");
            return;
        }

        Pedido pedido = historico.peek(); 
        pedido.exibir();
    }

    public void listarCardapio() {
        for (Produto p : cardapio.values()) {
            System.out.println(p.exibir());
        }
    }
} 