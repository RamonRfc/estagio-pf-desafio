import java.util.Scanner;

public class ProblemaMedianaNivelDois {

public static void main(String[] args) {
		
		/**
		 * Exemplo logico:
		 * 
		 * Se meus três valores inseridos forem  2, 8, e 5. Após colocá-los em ordem (não decrescente) teríamos os valores 2, 5 e 8.
		 * 
		 * A media é (a+b+c)/3 sendo que a media é igual a mediana.
		 * 
		 * Tendo em vista que A menor que B, e vamos ter que calcular o menor inteiro de C... 
		 * Por exemplo: 
		 * 
		 * Se minha entrada é 1, 2 e a saída é 0... 
		 * quando ordenamos os números temos a seguinte sequencia 0 1 2.
		 * 
		 * Ou seja C =0 A= 1 B=2
		 * Obs: como o A sempre vai ser menor que B e C será o menor inteiro possível A sempre fica no meio da sequencia: C, A, B;
		 * A media desses três valores da 1
		 * então A é igual a media e será a mediana também. 
		 * 
		 * encontraremos a formula assim 
		 * 
		 *  (a+b+c)/3 = Media
		 *  
		 *  (a+b+c) = 3a ( o 3 estava dividindo e passou multiplicando A.
		 *   
		 *   c = 3a -a -b
		 *   
		 *   c = 2a - b  >>  com essa formula encontraremos o valor de C.
		 *      
		 */

		int a, b, c;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira dois valores inteiros, exemplo: 1 2 ");
		a =  entrada.nextInt();
		b = entrada.nextInt();
		
		
		while (a != 0 && b != 0) {
			c = 2 * a - b;  
			
			System.out.println(c);
			
			a =  entrada.nextInt();
			b = entrada.nextInt();
		}
		
		
	}

}
