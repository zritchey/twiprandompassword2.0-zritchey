package com.company;


import java.util.Random;
/**
 * Created by zachary on 10/17/2016.
 */
class Password {


    private String pass;
    private int a[]=new int[16];

    public Password() {


    }
    private void numgen(){
        int j = 0;
        while (j < 16) {
            a[j] = new Random().nextInt(92);
            j++;
        }
    }
    public String id(){
        numgen();
        int j=0;
        pass="";
        while (j<16){
            pass=pass+((char)(a[j]+33));
            j++;
        }
        return pass;
    }



}