package fattorialeprova;

public class fattoriale {
    static int fattoriale1(int n) {
        int i = 1;
        int j = 1;
        while (j <= n){
            i = i * j;
            j++;
        }
        return i;
    }
}

