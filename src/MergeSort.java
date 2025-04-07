public class Ordenador {
    public static void mergeSortPorNome(List<Produto> produtos) {
        if (produtos.size() > 1) {
            int meio = produtos.size() / 2;

            List<Produto> esquerda = new ArrayList<>(produtos.subList(0, meio));
            List<Produto> direita = new ArrayList<>(produtos.subList(meio, produtos.size()));

            mergeSortPorNome(esquerda);
            mergeSortPorNome(direita);

            mergePorNome(produtos, esquerda, direita);
        }
    }

    private static void mergePorNome(List<Produto> produtos, List<Produto> esquerda, List<Produto> direita) {
        int i = 0, j = 0, k = 0;
        while (i < esquerda.size() && j < direita.size()) {
            if (esquerda.get(i).getNome().compareToIgnoreCase(direita.get(j).getNome()) <= 0) {
                produtos.set(k++, esquerda.get(i++));
            } else {
                produtos.set(k++, direita.get(j++));
            }
        }
        while (i < esquerda.size()) {
            produtos.set(k++, esquerda.get(i++));
        }
        while (j < direita.size()) {
            produtos.set(k++, direita.get(j++));
        }
    }
}
