package solid.O;

public class MyClass {

	 public static void main(String args[]) {
	 /*
	  * O OCP é o Design Pattern STRATEGY
	  * 
	  * */	 
	        Estagio obj_tipo_contrato = new Estagio();
	        
	        FolhaDePagamento obj_Contrato = new FolhaDePagamento(obj_tipo_contrato);
	        obj_Contrato.calcular();
	        obj_Contrato.printSalario(); 
	    }
}
