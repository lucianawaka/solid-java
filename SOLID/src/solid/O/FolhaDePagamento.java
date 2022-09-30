package solid.O;

public class FolhaDePagamento {
    private Double salario;
    private Remuneravel contrato;
    
    /*Sobrecarga do método Construtor*/
    public FolhaDePagamento() {}
    
    /*D - Contructor Injection */
    public FolhaDePagamento( Remuneravel contrato ) {
    	this.contrato = contrato;
    }
    
    /*Sobrecarga do método calcular*/
    public void calcular(  ) {
        this.salario = this.contrato.remuneracao();
    }
    
    /*D - Injection through parameter*/   
    public void calcular( Remuneravel contrato ) {
        this.salario = contrato.remuneracao();
    }
    
    public void printSalario() {
        System.out.println("Salário:"+ this.salario);
    }

}