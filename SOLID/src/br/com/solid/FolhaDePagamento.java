package br.com.solid;

public class FolhaDePagamento {
    public Double salario;
    
    public void calcular( Remuneravel contrato ) {
        this.salario = contrato.remuneracao();
    }
    
    public void printSalario() {
        System.out.println("Salário:"+ this.salario);
    }

}