package ProgettoATM;

public class Utente {
    private String Nome = "Edoardo";
    private String Cognome = "Olivato";
    private String DataDiNascita= "17/06/1999";
    private double Password=170699;
    private double Username=876377;

    public void setNome(String nome){
        this.Nome=nome;
    }
    public void setCognome(String cognome){
        this.Cognome=cognome;
    }
    public void setDataDiNascita(String data){
        this.DataDiNascita=data;
    }
    public String getNome(){
        return this.Nome;
    }
    public String getCognome(){
        return this.Cognome;
    }
    public String getDataDiNascita(){
        return this.DataDiNascita;
    }
    public double getPassword(){
        return Password;
    }
    public double getUsername(){
        return Username;
    }
    public Utente(){
        getCognome();
        getDataDiNascita();
        getNome();
        getPassword();
        getUsername();
    }
}
