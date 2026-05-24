package patternsExamples;

import java.util.Scanner;

public class PatEasy {
   public static void main(String[] args) {
       Examples ex =  new Examples();
       ex.p1();
   } 
}


class Examples {
    void p1(){
        int n=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter an number ");
        n= sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}