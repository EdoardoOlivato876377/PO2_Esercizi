package EsameDel_01_06_21;

class Persona {
    protected int peso;
    protected int altitudine;
    protected double calorie;

    protected Persona(int peso){
        this.peso=peso;
        this.altitudine=0;
        this.calorie=0;
    }
    public void mangia(double calorie){
        if(calorie>0){
            this.calorie=this.calorie+calorie;
        }
    }
    protected void saliscendi(int metri){
        this.altitudine=metri;
        if(metri<0){
            this.calorie = this.calorie - (metri * 2)*peso;
        }if(calorie<0){
            if(metri!=0){
                metri=metri-1;
            }
            this.calorie = this.calorie - (metri * 2)*peso;
        }
    }
}
