package exercicio_1;

import java.util.*;

public class Exercicio_1 {
    public static boolean isNumTel(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0 || length < 4 || length > 12) {
            return false;
        }
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9' || c == '-') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.gc();
        Scanner sc= new Scanner(System.in);
        Agenda agenda = new Agenda();
        String telefone, nome;
        int retorno = 0;

        while (retorno == 0){
            System.out.println("Olá, Aqui é o exercicio 1: ");
            System.out.println("Agenda(" + agenda.contatos.size()+ " contato(s)) ");
            System.out.println("Digite um numero de telefone para \nadicionar um novo contato \nou um nome para buscar o telefone:");
            String str= sc.nextLine();
            if(isNumTel(str)){
                int valor = Integer.parseInt(str);
                if (valor == 0)
                    retorno = 1;
                telefone = str;
                System.out.println("Digite o nome do contato a ser inserido:");
                str= sc.nextLine();
                agenda.inserirContato(str, telefone);

                System.out.println("Contato Inserido com sucesso:");
            }
            else{
                telefone = agenda.buscarTelefonePorNome(str);
                System.out.println("Contato: " + str + "\n Telefone: "+ telefone);
            }
        }

    }
}
