package exercicio_2;

public class Exercicio_2 {
    public static void main(String[] args) {
        System.gc();
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Danilo Siqueira de Oliveira";
        pessoa1.idade = 25;
        System.out.println("Pessoa " + pessoa1.nome + " criada com idade de " + pessoa1.idade + " anos.\n");

        pessoa1.fazerAniversario();
        pessoa1.fazerAniversario();
        pessoa1.fazerAniversario();
        System.out.print("Agora, " + pessoa1.nome + " tem " + pessoa1.idade + " anos.");

    }
}
