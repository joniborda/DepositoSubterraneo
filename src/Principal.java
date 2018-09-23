
public class Principal {

	int cantDeposito;
	Deposito[] depositos;
	int volumenDeLlenado;
	int volumenSobrante;
	int rebalsados = 0;

	public Principal(int cantDeposito, Deposito[] depositos, int volumen) {
		super();
		this.cantDeposito = cantDeposito;
		this.depositos = depositos;
		this.volumenDeLlenado = volumen;
	}

	public String resolver() {

		int profundidad = this.depositos[0].profundidad - 1;
		while (this.volumenDeLlenado >= 0) {
			if (profundidad == -1) {
				this.rebalsados += this.volumenDeLlenado;
				break;
			}
			for (Deposito deposito : this.depositos) {
				this.volumenDeLlenado -= deposito.llenar(profundidad);
			}
			profundidad--;
		}
		if (this.rebalsados > 0) {
			return "Rebalsan: " + this.rebalsados;
		}

		int usados = 0;
		for (Deposito deposito : depositos) {
			if (deposito.seUso()) {
				usados++;
			}
		}
		return usados + "\n" + (profundidad + 1);
	}
}
