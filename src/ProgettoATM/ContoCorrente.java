package ProgettoATM;

public class ContoCorrente {
    private double importoConto=1500.00;
    public double getimportoConto(){
        return importoConto;
    }
    public void Prelleva(double x){
        importoConto=importoConto-x;
    }
    public void Versamento(double y){
        importoConto=importoConto+y;
    }
    public void Print(){
        System.out.println("L'importo residuo nel tuo conto è di:");
        System.out.println(importoConto);
    }
    ContoCorrente(Double x){
        getimportoConto();
        Prelleva(x);
        Versamento(x);
        Print();
    }
}
