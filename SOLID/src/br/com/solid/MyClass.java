package br.com.solid;

public class MyClass {

	 public static void main(String args[]) {
	        ContratoCLT obj_tipo_contrato = new ContratoCLT();
	        
	        FolhaDePagamento obj_Contrato = new FolhaDePagamento();
	        obj_Contrato.calcular(obj_tipo_contrato);
	        obj_Contrato.printSalario();
	        
	    
	     
	    }

}
