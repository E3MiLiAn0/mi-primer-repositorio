
import java.util.Scanner;
public class Calculadora {
	
	
	 public static void main(String[] args) {
		 Integer a;
		 Integer b;
		 Integer opcion;
		 Integer resultado = 0;
		 
		 Scanner teclado = new Scanner(System.in);
		 
	 System.out.println("Ingrese su operación /n 1 para sumar /n 2 para restar /n 3 para multiplicar /n 4 para dividir");
	 
	 opcion = teclado.nextInt();
	
		 switch (opcion) {
		 case 1:
			 System.out.println(" ingrese el primer numero");
			 a=teclado.nextInt();
			 System.out.println(" ingrese el segundo numero");
			 b=teclado.nextInt();
			 
			 resultado= a+b;
			 break;
			 
		 case 2:
			 System.out.println(" ingrese el primer numero");
			 
			 a=teclado.nextInt();
			 System.out.println(" ingrese el segundo numero");
			 b=teclado.nextInt();
			 
			 resultado= a-b;
			 break;
		 case 3:
			 System.out.println(" ingrese el primer numero");
			 a=teclado.nextInt();
			 System.out.println(" ingrese el segundo numero");
			 b=teclado.nextInt();
			 
			 resultado= a*b;
			 break;
			 
		 case 4:
			 System.out.println(" ingrese el primer numero");
			 a=teclado.nextInt();
			 System.out.println(" ingrese el segundo numero");
			 b=teclado.nextInt();
			 
			 if(b < 0 || b>0) {
					resultado= a/b;
					}
			 break;
			 default:
				 System.out.println("ERROR");
		 }
		 
		 System.out.println("El resultado es " + resultado.toString());
	}
	 

}

