package exercicio_4;

public class Porta {
    double dimensao_altura = 2.12;
    double dimensao_largura = 1.24;
    String cor = "marrom";
    boolean estado_aberta = false;

    Porta(){

    }
    Porta(String _cor){
        this.cor = _cor;
    }
    void abrir(){
        estado_aberta = true;
    }
    void fechar(){
        estado_aberta = false;
    }

    void pintar(String novaCor){
        cor = novaCor;
    }

    boolean estaAberta(){
        return  estado_aberta;
    }

}
