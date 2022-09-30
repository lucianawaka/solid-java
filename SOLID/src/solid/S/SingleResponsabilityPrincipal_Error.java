package solid.S;

public class SingleResponsabilityPrincipal_Error {
	/*Exemplo de GOD CLASS*/
	/*
	 * PROBLEMAS
	 *  - Falta de Coesão (Classe assume responsabilidades que não são as suas
	 *  - Alto Acoplamento ( + Resp. MAIOR nível de dependências - Deixando o Sistema engessado
	 *  - Dificuldade de criar Testes Automatizados
	 *  - Baixo Reaproveitamento
	 * */
	
	public void calculateTotalSum() {
		/*Calcula a soma total"*/
	}
	
	public void getItems() {
		/*Pega os Items*/
	}
	
	public void getItemCount() {
		/*Conta os Items*/
	}
	
	public void addItem(Integer item) {
		/*Adiciona os Items*/
	}
	
	public void deleteItem(Integer item) {
		/*Deleta Items*/
	}
	
	
	public void printOrder(Integer orderID) {
		/*Imprime os Pedidos*/
	}
	
	public void showOrder(Integer orderID) {
		/*Mostra os Pedidos*/
	}
	
	
	public void load(Integer orderID) {
		/*Carrega Pedido*/
	}
	
	public void save(Integer orderID) {
		/*Salva Pedido*/
	}
	
	public void update(Integer orderID) {
		/*Atualiza Pedido*/
	}
	
	public void delete(Integer orderID) {
		/*Deleta Pedido*/
	}
	

}
