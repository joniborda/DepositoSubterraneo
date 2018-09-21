import org.junit.Assert;
import org.junit.Test;

public class ConsignaTest {

	@Test
	public void consigna() {
		int cantDeposito = 3;
		int[][] depositos = { { 12, 3 }, { 8, 2 }, { 6, 1 } };
		int volumen = 60;

		Principal p = new Principal(cantDeposito, depositos, volumen);
		Assert.assertEquals("Rebalsan: 2", p.resolver());
	}

	@Test
	public void consigna30() {
		int cantDeposito = 3;
		int[][] depositos = { { 12, 3 }, { 8, 2 }, { 6, 1 } };
		int volumen = 30;

		Principal p = new Principal(cantDeposito, depositos, volumen);
		Assert.assertEquals("2\n1", p.resolver());
	}

	@Test
	public void sinRebalsar10() {
		int cantDeposito = 10;
		int[][] depositos = { { 16, 30 }, { 15, 6 }, { 13, 5 }, { 13, 4 }, { 12, 3 }, { 11, 3 }, { 10, 2 }, { 9, 2 }, { 8, 2 }, { 6, 1 } };
		int volumen = 30;

		Principal p = new Principal(cantDeposito, depositos, volumen);
		Assert.assertEquals("1\n28", p.resolver());
	}
	
	@Test
	public void sinRebalsarTodosLlenos() {
		int cantDeposito = 10;
		int[][] depositos = { { 12, 3 }, { 18, 2 }, { 36, 1 } };
		int volumen = 36;

		Principal p = new Principal(cantDeposito, depositos, volumen);
		Assert.assertEquals("3\n0", p.resolver());
	}
}
