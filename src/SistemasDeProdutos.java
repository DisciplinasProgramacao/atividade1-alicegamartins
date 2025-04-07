public class SistemaDeProdutos {
    private List<Produto> produtosOriginais = new ArrayList<>();
    private List<Produto> produtosPorNome = new ArrayList<>();
    private List<Produto> produtosPorPreco = new ArrayList<>();

    public void carregarProdutos(List<Produto> lista) {
        this.produtosOriginais = lista;
        this.produtosPorNome = new ArrayList<>(lista);
        this.produtosPorPreco = new ArrayList<>(lista);

        Ordenador.mergeSortPorNome(produtosPorNome);
        Ordenador.ordenarPorPreco(produtosPorPreco);
    }

    public void exibirProdutosPorNome() {
        System.out.println("Ordenados por nome:");
        produtosPorNome.forEach(System.out::println);
    }

    public void exibirProdutosPorPreco() {
        System.out.println("Ordenados por preço:");
        produtosPorPreco.forEach(System.out::println);
    }
}
