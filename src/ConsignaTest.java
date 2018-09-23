import org.junit.Assert;
import org.junit.Test;

public class ConsignaTest {

	@Test
	public void consigna() {
		int cantDeposito = 3;
		Deposito[] depositos = { new Deposito(12, 3), new Deposito(8, 2), new Deposito(6, 1) };
		int volumen = 60;

		Principal p = new Principal(cantDeposito, depositos, volumen);
		Assert.assertEquals("Rebalsan: 2", p.resolver());
	}

	@Test
	public void consigna30() {
		int cantDeposito = 3;
		Deposito[] depositos = { new Deposito(12, 3), new Deposito(8, 2), new Deposito(6, 1) };
		int volumen = 30;

		Principal p = new Principal(cantDeposito, depositos, volumen);
		Assert.assertEquals("2\n1", p.resolver());
	}

	@Test
	public void sinRebalsar10() {
		int cantDeposito = 10;
		Deposito[] depositos = { new Deposito(16, 30), new Deposito(15, 6), new Deposito(13, 5), new Deposito(13, 4),
				new Deposito(12, 3), new Deposito(11, 3), new Deposito(10, 2), new Deposito(9, 2), new Deposito(8, 2),
				new Deposito(6, 1) };
		int volumen = 30;

		Principal p = new Principal(cantDeposito, depositos, volumen);
		Assert.assertEquals("1\n28", p.resolver());
	}

	@Test
	public void sinRebalsarTodosLlenos() {
		int cantDeposito = 3;
		Deposito[] depositos = { new Deposito(12, 3), new Deposito(8, 2), new Deposito(6, 1) };
		int volumen = 58;

		Principal p = new Principal(cantDeposito, depositos, volumen);
		Assert.assertEquals("3\n0", p.resolver());
	}
}
