package exercicio_3;

public class Exercicio_3 {
    public static void main(String[] args) {
        System.gc();
        Porta porta = new Porta();
        porta.abrir();
        porta.fechar();
        porta.pintar("azul");
        porta.pintar("rosa");
        porta.estaAberta();

        System.out.println(porta.teste);
    }
}
