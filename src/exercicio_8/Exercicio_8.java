package exercicio_8;

public class Exercicio_8 {
    public static void main(String[] args) {
        Celular celular = new Celular();
        System.out.println("Celular criado!");
        System.out.print("Capacidade de Bateria: ");
        System.out.println(celular.capacidadeBateria);
        System.out.print("Nível da Carga: ");
        System.out.println(celular.nivelCarga);
        System.out.println("\n");

        System.out.print("Ligação de 160 segundos: \n");
        celular.realizarLigacao(160);
        System.out.print("Nível da Carga: ");
        System.out.println(celular.nivelCarga);
        System.out.println("\n");

        System.out.print("SMS Enviado: \n");
        celular.enviarSMS();
        System.out.print("Nível da Carga: ");
        System.out.println(celular.nivelCarga);
        System.out.println("\n");


    }
}
