package tdd.tarefa;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculadoraTeste{

	@Test
	public void som(){

		Calculadora calc = new Calculadora();
		assertEquals(30, calc.som(20,10));
	}

	@Test
	public void sub(){

		Calculadora calc = new Calculadora();
		assertEquals(5, calc.sub(15,10));
	}

	@Test
	public void div(){

		Calculadora calc = new Calculadora();
		assertEquals(2, calc.div(4,2));
	}

	@Test
	public void mult(){

		Calculadora calc = new Calculadora();
		assertEquals(25, calc.mult(5,5));
	}
	@Test
	void pot() {
		Calculadora c = new Calculadora();
		double resultEsperado = 243;
		
		double result = c.pot(3, 5);
		
		assertEquals(resultEsperado, result);
	}
	@Test
	void quad() {
		Calculadora c = new Calculadora();
		double resultEsperado = 2;
		
		double result = c.quad(4);
		
		assertEquals(resultEsperado, result);
	}
	@Test
	void cub() {
		Calculadora c = new Calculadora();
		double resultEsperado = 2;
		
		double result = c.cub(8);
		
		assertEquals(resultEsperado, result);
	}
	@Test
	void porc() {
		Calculadora c = new Calculadora();
		float resultEsperado = 20;
		
		float result = c.porc(20,100);
		
		assertEquals(resultEsperado, result);
	}

}