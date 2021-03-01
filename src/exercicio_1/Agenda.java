package exercicio_1;

import exercicio_4.*;

import java.util.ArrayList;
import java.util.List;


public class Agenda {
    List<Contato> contatos = new ArrayList<Contato>();
    int hC = hashCode();
    void inserirContato(Contato ct){
        contatos.add(ct);
    }
    void inserirContato(String nm, String tel){
        Contato ct = new Contato();
        ct.nome = nm;
        ct.telefone = tel;
        contatos.add(ct);
    }

    String buscarTelefonePorNome(String nome){
        var ct = contatos.stream().filter(x-> x.nome.equalsIgnoreCase(nome)).findFirst();
        return ct.orElse(new Contato()).telefone;
    }

}
