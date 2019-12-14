//Este programa te dice que número es mayor

import java.util.Scanner;

public class NumMayor {
	public static void main (String args[]) {

	Scanner entrada = new Scanner (System.in);

//Declaramos las variables
int n1, n2, n3;
//Se piden los datos por teclado
	System.out.println("Introduzca el primer número");
		n1 = entrada.nextInt(); 
	System.out.println("Introduzca el segundo numero");
		n2 = entrada.nextInt(); 
	System.out.println("Introduzca el siguiente número");
		n3 = entrada.nextInt(); 



//Se comparan las variables
if ((n1>n2) && (n2>n3)) {
	System.out.println("El número "+ n1 + " es mayor");
} else if ((n2>n1) && (n1>n3)) {  
	System.out.println("El número "+ n2 + " es mayor");
} else {
	System.out.println("El número "+ n3 + " es mayor");
	}
						}
			}

