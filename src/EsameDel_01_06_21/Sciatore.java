package EsameDel_01_06_21;

public class Sciatore extends Persona {
    protected Sciatore(int peso) {
        super(peso);
    }

    @Override
    protected void saliscendi(int metri) {
        super.saliscendi(metri);
        this.altitudine=metri;
        if(metri>0) {
            this.calorie = calorie - (metri * 30);
            this.peso = peso - (metri * 30);
        }
    }
    private SkyPass skypass=new SkyPass();

   /*protected Sciatore(int peso, SkyPass s1){
        this.peso=peso;
        this.skypass=s1;
    }
    */
    public void prendi_funivia(int metri, int punti) throws PuntiNonSufficientiException {
        altitudine=altitudine+metri;
        if(skypass.punti_disponibili-punti>0) {
            skypass.punti_disponibili = skypass.punti_disponibili - punti;
        }else{
            throw new PuntiNonSufficientiException();
        }
    }
}
