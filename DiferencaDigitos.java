import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.*;

public class DiferencaDigitos {
	public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);

    int numero = scan.nextInt();
    int soma = 0;
    int mult = 1;
    int sub = 0;

    String numeroEmString = String.valueOf(numero);
    String[] split = numeroEmString.split("");

    int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

        // TODO: Retorne a diferença entre o produto e a soma dos dígitos.
       for (int i = 0; i < ints.length; i++) {
         soma += ints[i];
         mult *= ints[i];
       }
        
        // Subtração
        sub = mult - soma; 
        System.out.println(sub);
        
    }
}