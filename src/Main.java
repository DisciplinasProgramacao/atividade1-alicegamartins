public class Main {
    public static void main(String[] args) {
        List<Produto> lista = List.of(
            new Produto("Lapis Bege",6.67),
            new Produto("Compasso Kiwio", 5,67 ),
            new Produto("Furador Cinza", 5,87 ),
           
        );

        SistemaDeProdutos sistema = new SistemaDeProdutos();
        sistema.carregarProdutos(lista);
        sistema.exibirProdutosPorNome();
        sistema.exibirProdutosPorPreco();
    }
}
