package exercicio_7;


import exercicio_4.Porta;

import java.text.Normalizer;

public class Pedido {
    Item[] itens = new Item[hashCode()];;
    Cliente cliente;
    FormaPagamento formaPagamento;

    void adicionaItem(Item item){
        itens[itens.length] = item;
    }

    Pedido(FormaPagamento frmPgt){
        this.formaPagamento = frmPgt;
    }
}
