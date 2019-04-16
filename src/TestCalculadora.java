
public class TestCalculadora {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora miCalculadora = new Calculadora();
		
		System.out.println(miCalculadora.sumar(5, 3));
		System.out.println(miCalculadora.dividir(5, 3));
		System.out.println(miCalculadora.restar(5, 3));
		System.out.println(miCalculadora.multiplicar(5, 3));
		
		Calculadora miCalculadora1 = new Calculadora(8,9);
		
		System.out.println(miCalculadora1.sumar());
		System.out.println(miCalculadora1.restar());
		System.out.println(miCalculadora1.multiplicar());
		System.out.println(miCalculadora1.dividir());
		
		System.out.println("el numero es positivo ? "+miCalculadora.esPositivo(25));
	
		
	}

}
