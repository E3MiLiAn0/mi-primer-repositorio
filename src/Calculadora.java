
public class Calculadora {
	private double operador1;
	private double operador2;

	public Calculadora() {
		this.operador1 = 2;
		this.operador2 = 1;
	}

	public Calculadora(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
	}

	public double sumar() {
		return operador1 + operador2;

	}

	public double sumar(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
		return operador1 + operador2;
	}

	

	public double restar(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
		return operador1 - operador2;
	}
	public double restar() {
		return operador1 - operador2;
	}
	public double multiplicar() {
		return operador1 * operador2;
	}
	public double multiplicar(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
		return operador1 * operador2;
	}
	public double dividir() {
		double division=0;
		if(operador2 < 0 || operador2>0) {
		
		division= operador1/operador2;
		}
		return division;
	}
	public double dividir(double operador1, double operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
		double division = 0;
		if(operador2 < 0 || operador2>0) {
			division= operador1/operador2;
		}
		return division;
	}

	@Override
	public String toString() {
		return "Calculadora [operador1=" + operador1 + ", operador2=" + operador2 + "]";
	}
	
}
