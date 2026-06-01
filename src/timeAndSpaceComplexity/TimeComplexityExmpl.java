package timeAndSpaceComplexity;

public class TimeComplexityExmpl {
    public static void main(String a[]){
        TimeExmpl ex1 = new TimeExmpl();
        ex1.method1();
        ex1.method2();
    }
}


class TimeExmpl{
    int n=20;
    void method1(){
        for(int i=0;i<n;i++){
           System.out.println(i);
        }
        System.out.println("the time complexity for above one is O(n)  ");
    }
    void method2(){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

            }
        }
        System.out.println("the time complexity for above one is O(n^2)  ");
    }
}