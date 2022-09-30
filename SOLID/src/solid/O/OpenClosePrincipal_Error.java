package solid.O;

public class OpenClosePrincipal_Error {

	/* Obj. e Entidade Abertos para Extensão e fechados para Modificação
	 * 
	 * Novo comportamento e recursos precisam ser adicionados no SW
	 * Devemos EXTENDER e não alterar o código fonte original
	 * 
	 * */
	class ContratoCLT{
		public double salario() {
			return 4995.00;
		}
	}
	
	class Estagio{
		public double bolsaAuxilio() {
			return 740.00;
		}
	}
	
	class FolhaDePagamento {
		protected double saldo;
		
		public void calcular( Object contrato ) {
			if ( contrato instanceof ContratoCLT ) {
				this.saldo = ((ContratoCLT) contrato).salario();
			} else if ( contrato instanceof Estagio ) {
				this.saldo = ((Estagio) contrato).bolsaAuxilio();
			} /*Adicionar mais um comportamento - outro IF*/
		}
	}
	
}
