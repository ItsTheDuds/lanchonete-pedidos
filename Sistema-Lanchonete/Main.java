
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lanchonete l = new Lanchonete();

        //Lanches
        Produto xburguer = new Produto("X-Burguer", 34.90, 1, "Lanche");
        Produto smasher = new Produto("Smasher-Taste", 44.90, 2, "Lanche");
        Produto hunger_drainer = new Produto("Hunger-Drainer", 55.50, 3, "Lanche");
        Produto xtudo = new Produto("X-Tudo", 28.90, 4, "Lanche");
        Produto xsalada = new Produto("X-Salada", 25.90, 5, "Lanche");
        Produto smelter = new Produto("Big-Smelter", 66.70, 6, "Lanche");

        l.adicionarAoCardapio(xburguer);
        l.adicionarAoCardapio(smasher);
        l.adicionarAoCardapio(hunger_drainer);
        l.adicionarAoCardapio(xtudo);
        l.adicionarAoCardapio(xsalada);
        l.adicionarAoCardapio(smelter);

        //Bebidas
        Produto cocacola = new Produto("Coca-Cola", 10.50, 7, "Bebida");
        Produto sucouva = new Produto("Suco-Uva", 6.70, 8, "Bebida");
        Produto sucolaranja = new Produto("Suco-Laranja", 6.70, 9, "Bebida");
        Produto fantalaranja = new Produto("Fanta-Laranja", 7.50, 10, "Bebida");

        l.adicionarAoCardapio(cocacola);
        l.adicionarAoCardapio(sucouva);
        l.adicionarAoCardapio(sucolaranja);
        l.adicionarAoCardapio(fantalaranja);

        int opcao;
        do {
            System.out.println("\n=== Menu da Lanchonete ===");
            System.out.println("1 - Listar cardápio");
            System.out.println("2 - Fazer pedido");
            System.out.println("3 - Atender próximo pedido");
            System.out.println("4 - Ver último pedido atendido");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cardápio ---");
                    l.listarCardapio();
                    break;

                case 2:
                    System.out.print("Digite o nome do cliente: ");
                    String nomeCliente = sc.nextLine();
                    Pedido pedido = new Pedido(nomeCliente);

                    String adicionarMais;

                    l.listarCardapio();
                    do {
                        System.out.print("Digite o código do produto que deseja adicionar: ");
                        String codigo = sc.nextLine();
                        Produto p = l.buscarProduto(codigo);
                        if (p != null) {
                            pedido.adicionarItem(p);
                            System.out.println(p.getNome() + " adicionado ao pedido.");
                        } else {
                            System.out.println("Produto não encontrado!");
                        }

                        l.listarCardapio();

                        System.out.print("Deseja adicionar outro produto? (s/n): ");

                        adicionarMais = sc.nextLine();
                    } while (adicionarMais.equalsIgnoreCase("s"));

                    l.fazerPedido(pedido);
                    System.out.println("Pedido de " + nomeCliente + " adicionado à fila.");
                    break;

                case 3:
                    System.out.println("\nAtendendo próximo pedido:");
                    l.atenderProximo();
                    break;

                case 4:
                    System.out.println("\nÚltimo pedido atendido:");
                    l.verUltimoAtendido();
                    break;

                case 0:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
