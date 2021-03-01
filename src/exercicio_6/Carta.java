package exercicio_6;

enum Valores{
    AS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, VALETE, DAMA, REI;
}

enum Naipes{
    CPAS,SPDS,OURO,PAUS;
}

public class Carta {
    String valor;
    Naipes naipe;

    Carta(int _valor, int _naipe){
        valor = Valores.values()[_valor].toString();
        naipe = Naipes.values()[_naipe];
    }
}
