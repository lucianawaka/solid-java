package solid.O;

public class MyClass {

	 public static void main(String args[]) {
	        Estagio obj_tipo_contrato = new Estagio();
	        
	        FolhaDePagamento obj_Contrato = new FolhaDePagamento(obj_tipo_contrato);
	        obj_Contrato.calcular();
	        obj_Contrato.printSalario();
	        
	    
	     
	    }

}
