package casuale;
public class Mergsort {
    public static void dividi(int[]a,int[]primaMeta,int[]ultimaMeta){
        for(int i=0; i<primaMeta.length;i++)
            primaMeta[i]=a[i];
        for(int i=0;i<ultimaMeta.length;i++)
            ultimaMeta[i]=a[primaMeta.length+i];
    }
    public static void merge(int[] a,int[] primaMeta, int[] ultimaMeta){
        int indicePrimaMeta=0;
        int indiceUltimaMeta=0;
        int indiceA=0;
        while((indicePrimaMeta<primaMeta.length)&&(indiceUltimaMeta<ultimaMeta.length)){
            if(primaMeta[indicePrimaMeta]<ultimaMeta[indiceUltimaMeta]){
                a[indiceA]=primaMeta[indicePrimaMeta];
                indicePrimaMeta++;
            }else{
                a[indiceA]=ultimaMeta[indiceUltimaMeta];
                indiceUltimaMeta++;
            }
            indiceA++;
        }
    }
    public static void ordina(int[] a){
        if(a.length>=2){
            int metaLunghezza=a.length/2;
            int[] primaMeta=new int[metaLunghezza];
            int[] ultimaMeta=new int[a.length-metaLunghezza];
            dividi(a,primaMeta,ultimaMeta);
            ordina(primaMeta);
            ordina(ultimaMeta);
            merge(a,primaMeta,ultimaMeta);
        }
    }
}
