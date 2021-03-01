package exercicio_4;

public class Casa {
    String cor = "verde";
    Porta[] portas = new Porta[hashCode()];

   void adicionaPorta(Porta prt){
       portas[portas.length] = prt;
   }

   int quantasPortasEstaoAbertas(){
       int qtd = 0;
       for (int i = 0; i < portas.length; i++){
           if(portas[i].estado_aberta)
               qtd++;
       }
       System.out.println(qtd);
       return qtd;
   }


}
