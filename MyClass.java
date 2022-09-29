import ContratoClt.ContratoClt;
import FolhaDePagamento.FolhaDePagamento;

class MyClass {
    public static void main(String args[]) {
        obj_tipo_contrato = ContratoClt();
        
        obj_Contrato = FolhaDePagamento(obj_tipo_contrato);
        obj_Contrato.calcular();
        obj_Contrato.printSalario();
        
    
     
    }
}