package exercicio_7;

public class Exercicio_7 {
    public static void main(String[] args) {
        System.out.println("Supermercao aberto");
        System.out.println("Primeiro pedido do dia: ");
        Pedido pedido1 = new Pedido(FormaPagamento.CARTAO);

        pedido1.adicionaItem(new Item(1, new Produto("Guarana")));
        pedido1.adicionaItem(new Item(2, new Produto("Tempero")));
        pedido1.adicionaItem(new Item(1, new Produto("Sal")));
        pedido1.adicionaItem(new Item(9, new Produto("Kg de frango")));
        pedido1.adicionaItem(new Item(52, new Produto("Copos")));
        pedido1.adicionaItem(new Item(10, new Produto("Kg Linguiça de porco")));
        pedido1.adicionaItem(new Item(78, new Produto("Cerveja")));

        for (int i = 0; i < pedido1.itens.length; i++) {
            System.out.print(pedido1.itens[i].quantidade + " ");
            System.out.print(pedido1.itens[i].produto.nome + " - ");
            System.out.print(pedido1.itens[i].produto.valor + " cada. ");
        }
    }
}
