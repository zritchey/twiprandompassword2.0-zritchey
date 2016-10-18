package com.company;


import java.util.Random;
/**
 * Created by zachary on 10/17/2016.
 */
class Password {

    private String generate;
    private String pass;
    private int a[]=new int[16];

    public Password() {
        generate = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*";

    }
    private void numgen(){
        int j = 0;
        while (j < 16) {
            a[j] = new Random().nextInt(70);
            j++;
        }
    }
    public String id(){
        numgen();
        int j=0;
        pass="";
        while (j<16){
            pass=pass+generate.substring(a[j],a[j]+1);
            j++;
        }
        return pass;
    }


}