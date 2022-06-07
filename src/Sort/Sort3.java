package Sort;

public class Sort3 {
    int max=0,min=0,middle=0;
    public int Grande(int a, int b, int c) {
        if (a > b) {
            max = a;
            if (a > c) {
                max = a;
            } else
                max = c;
        } else {
            max = b;
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        return max;
    }
    public int Piccolo(int a, int b, int c){
        if (a > b) {
            min = b;
            if (b > c) {
                min = c;
            } else
                min = b;
        } else {
            min = a;
            if (a > c) {
                max = c;
            } else {
                max = a;
            }
        }
        return min;
    }
    public int Medio(int a, int b, int c){
        if(a<b && c>b){
            middle=b;
        }else if(a>b && c>a){
            middle=a;
        }else{
            middle=c;
        }
        return middle;
    }


    Sort3(int aa, int bb, int cc) {
        Piccolo(aa,bb,cc);
        Grande(aa,bb,cc);
        Medio(aa,bb,cc);
    }
}
