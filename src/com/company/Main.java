package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner kb=new Scanner(System.in);
            System.out.print("Choose your username: ");
            String uName=kb.nextLine();
            while (uName.trim().length()<0){
                System.out.print("Spaces aren't allowed in usernames.\nPlease enter a new username: ");
                uName=kb.next();
            }
        System.out.println("Welcome "+uName+"!");
        Password tired=new Password();
        String password=tired.id();
        System.out.println("Your password is: "+password);
        System.out.println("\nWould you ike to log in?");
        String ans=kb.next();
        int login=0;

        String check1="";
        String check2="";
        if (ans.trim().substring(0,1).equalsIgnoreCase("y"))
            login++;
        while(login==1){

            System.out.print("Username: ");
            while (check1.length()==0)
             check1=kb.nextLine();


            System.out.print("Password: ");
            check2 = kb.nextLine().trim();


            if(check1.equals(uName)&&check2.equals(password)){
                login++;
            }
            else{
                System.out.println("Your username or password is incorrect. ");
                check1="";
            }
        }
         if(login==2){
             System.out.println("Welcome to your account!");
         }

    }
}
