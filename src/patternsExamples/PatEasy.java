package patternsExamples;

import java.util.Scanner;

public class PatEasy {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println();
            System.out.println("enter the number for input ");
            int num = sc.nextInt();
            Examples ex = new Examples(num);
            System.out.println();
            System.out.println();
            ex.p1();
            System.out.println("\n\n");
            ex.p2();
            System.out.println();
            System.out.println();
            ex.p3();
            System.out.println();
            System.out.println();
            ex.p4();
            System.out.println();
            System.out.println();
            ex.p5();
            System.out.println();
            System.out.println();
            ex.p6();
            System.out.println();
            System.out.println();
            ex.p7();
            System.out.println();
            System.out.println();
            ex.p8();
            System.out.println();
            System.out.println();
            ex.p9();
            System.out.println();
            System.out.println();
            ex.p10();
            System.out.println();
            System.out.println();
            ex.p11();
            System.out.println();
            System.out.println();
            ex.p12();
            System.out.println();
            System.out.println();
            ex.p13();
            System.out.println();
            System.out.println();
            ex.p14();
            System.out.println();
            System.out.println();
            ex.p15();
            System.out.println();
            System.out.println();
            ex.p16();
            System.out.println();
            System.out.println();
            ex.p17();
            System.out.println();
            System.out.println();
            ex.p18();
            System.out.println();
            System.out.println();
            ex.p19();
            System.out.println();
            System.out.println();
            ex.p20();
            System.out.println();
            System.out.println();
            ex.p21();
            System.out.println();
            System.out.println();
            ex.p22();
            System.out.println();
            System.out.println();
        }
        
    }
}

class Examples {

    int n = 5;

    public Examples(int n) {
        this.n =n;
    }
    

    void p1() {
        // int n=0;
        // Scanner sc =new Scanner(System.in);
        // System.out.println("enter an number ");
        // n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void p2() {
        // int n=0;
        // Scanner sc =new Scanner(System.in);
        // System.out.println("enter an number ");
        // n= sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void p3() {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void p4() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    void p5() {
        for (int i = 1; i < n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void p6() {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    void p7() {
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int k = (i - 1) * 2 + 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void p8() {
        for (int i = 1; i <= n; i++) {
            for (int s = 0; s < i - 1; s++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (n - i) * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    void p9() {
        for (int i = 1; i <= n / 2; i++) {
            for (int s = n / 2 - i; s > 0; s--) {
                System.out.print(" ");
            }
            for (int k = (i - 1) * 2 + 1; k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = 1; i <= n / 2; i++) {
            for (int s = 0; s < i - 1; s++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (n / 2 - i) * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    void p10() {
        for (int i = 1; i <= n / 2; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }
        for (int i = n / 2 - 1; i >= 1; i--) {
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    void p11() {
        int c ;
        for (int i = 1; i <= n; i++) {
            c = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(c % 2);
                c++;
            }
            System.out.println();
        }
    }

    void p12() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int s = 1; s <= (n - i) * 2; s++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();

        }
    }

    void p13() {
        int c = 1;
        for (int i = 1; i <= n; i++) {
            // c=i;
            for (int j = 1; j <= i; j++) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

    void p14(){
        for(int i=1;i<=n;i++){
            for(char c='A'; c< 'A'+i ;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    void p15(){
        for(int i=n;i>=1;i--){
            for(char c='A'; c< 'A'+i ;c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    void p16(){
        char ch = 'A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }

      void p17() {
        for (int i = 1; i <= n; i++) {
            for (int s = n - i; s > 0; s--) {
                System.out.print(" ");
            }
            char c=  'A';
            for (int j=1;j<2*i;j++) {
                System.out.print(c);
                if(j<i)
                c++;
                else 
                c--;
            }
            System.out.println();
        }
    }

    void p18() {
        for (int i = 1; i <= n; i++) {
            // char c= 'A'+i;
            for(int j=i;j>=1;j--){
                System.out.print((char)('A'+n-j)+" ");
            }
            System.out.println();
        }
    }

    void p19(){
        for(int i=n;i>=1;i--){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int s= 1 ;s<= (n-i)*2; s++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int s= 1 ;s<= (n-i)*2; s++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }

    void p20(){
        for(int i=1;i<=n;i++){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int s= 1 ;s<= (n-i)*2; s++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int s= 1 ;s<= (n-i)*2; s++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
        
    }

    void p21(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j ==1 || j ==n )
                System.out.print("*");
                else
                System.out.print(" ");
        }
        System.out.println();
    }
        
    }

    void p22(){
       for(int i=0;i< (2*n - 1); i++){
          for(int j=0;j< (2*n - 1); j++){
           int  top = i;
           int  left = j;
           int  right = ((2*n -2 )-j);
           int  btm = 2*n-2-i;
           
           int a =  (int)Math.min(Math.min(top, left), Math.min(right , btm));

           System.out.print(n-a);

     }
     System.out.println();
       }
    }

    
}
