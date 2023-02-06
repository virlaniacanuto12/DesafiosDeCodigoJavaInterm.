import java.util.Scanner; 
 
public class Emboscada{ 
    public static int danoJogador(int vidaJogador, int ataqueInimigo, int defesaJogador, int dados){
        int resultado = vidaJogador - (ataqueInimigo - (defesaJogador + dados));

        return resultado;
    }
    public static int danoInimigo(int vidaInimigo, int ataqueJogador, int dados){
        int resultado = vidaInimigo - (ataqueJogador + dados);

        return resultado;
    }
    public static void main(String[] args){ 
        Scanner leitor = new Scanner(System.in); 
 
        int dados = leitor.nextInt(); 
        int vidaDoJogador = leitor.nextInt(); 
        int ataqueDoJogador= leitor.nextInt(); 
        int defesaDoJogador = leitor.nextInt(); 
        int vidaDoInimigo= leitor.nextInt(); 
        int ataqueDoInimigo = leitor.nextInt();

     //TODO: Crie as condições necessárias para verificar se o jogador vai sobreviver, e contra-atacar, ou morrer;
      if(danoJogador(vidaDoJogador, ataqueDoInimigo, defesaDoJogador, dados) > 0){
          if(danoInimigo(vidaDoInimigo, ataqueDoJogador, dados) > 0){
            System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
          }else {
            System.out.println("Jogador sobreviveu e derrotou o inimigo");
          }
       }else{
        System.out.println("Jogador nao sobreviveu");
       }
    }
}