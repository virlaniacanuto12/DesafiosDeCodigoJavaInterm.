import java.util.Scanner;

public class QuantidadeNecessaria {
    
  public static void main(String[] args) {
    final int SLICE = 4;
    Scanner scanner = new Scanner(System.in);

    int T = scanner.nextInt();
    int numFatias = 1;
    int X = 0;
    int N = 2;
    double numPedido = 0;
    int numPedidoFinal = 0;

        // TODO: Retorne o número de pizzas necessárias para atender o pedido. 
        for(int i =0; i < T; i++){
            for(int j = 0; j < N; j++){
                X = scanner.nextInt();
                numFatias = numFatias * X;
            }
            numPedido = Math.ceil(numFatias / SLICE);  
            numPedidoFinal = (int) numPedido;
            if(numFatias % SLICE != 0) numPedidoFinal++;
        }
        System.out.println(numPedidoFinal);
        
    }
}