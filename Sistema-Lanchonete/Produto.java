public class Produto {

    private String nome;
    private double preco;
    private int codigo;
    private String categoria;

    public Produto(String nome, double preco, int codigo, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = codigo;
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String exibir() {
        return String.format("[%d] - %s - %s - R$: %.2f", codigo, nome, categoria, preco);
    }
}