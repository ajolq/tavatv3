package tdd.tarefa;

public class Calculadora{

	public int som(int a, int b){
		return a + b;
	}

	public int sub(int a, int b){
		return a - b;
	}

	public int div(int a, int b){
		return a / b;
	}

	public int mult(int a, int b){
		return a * b;
	}
	public double pot(double a, double b) {
		
		return Math.pow(a,b);
		}
	public double quad(double a) {
		
		return Math.sqrt(a);
	}
	public double cub(double a) {
		
		return Math.cbrt(a);
	}
	public float porc(float a, float b) {
		
		return (a*100)/b;
	}

}