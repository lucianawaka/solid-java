package solid.O;

public class FolhaDePagamento {
    private Double salario;
    private Remuneravel contrato;
    
    public FolhaDePagamento( Remuneravel contrato ) {
    	this.contrato = contrato;
    }
    
    public void calcular(  ) {
        this.salario = this.contrato.remuneracao();
    }
    
    public void printSalario() {
        System.out.println("Salário:"+ this.salario);
    }

}