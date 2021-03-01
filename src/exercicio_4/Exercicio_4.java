package exercicio_4;

public class Exercicio_4 {
    public static void main(String[] args) {
        System.gc();
        Casa casa = new Casa();
        casa.adicionaPorta(new Porta("verde"));
        casa.adicionaPorta(new Porta("azul"));
        casa.adicionaPorta(new Porta("bege"));


        casa.portas[0].fechar();
        casa.portas[1].abrir();
        casa.portas[2].fechar();
        casa.portas[0].fechar();
        casa.portas[1].fechar();
        casa.portas[2].abrir();

        casa.quantasPortasEstaoAbertas();
    }
}
