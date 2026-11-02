package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            double p,r,t,amt;
            System.out.println("Enter Principal Amount: ");
            p=s.nextDouble();
            System.out.println("Enter Rate: ");
            r=s.nextDouble();
            System.out.println("ENter Time:");
            t=s.nextDouble();
            amt=(p*r*t)/100;
            System.out.println("Interest Amount: "+amt);
            s.close();
    }
}