package hashing;

import java.util.Scanner;

public class NumberOftimeACharInStr {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter string");
    String s = sc.nextLine();
    System.out.println("enter character");
    char ch = sc.next().charAt(0);
    int[] ha = new int[256];
    for(int i=0;i<s.length();i++){
        ha[s.charAt(i)] += 1;
    }
    System.out.println(ha[ch]);
    }
}
