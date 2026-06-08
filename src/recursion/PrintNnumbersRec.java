package recursion;

public class PrintNnumbersRec {
    public static void main(String[] args){
        int[] array = {5,4,3,2,1};
        PrintNnumbers rec= new PrintNnumbers();
//        rec.recursionFun();
//        rec.nameUsingRec(1,4);
//        rec.reverseNumbers(5);
//        rec.printNnumbersBackTrack(5);
//        rec.printNnumbersBackTrackRev(1,5);
//        System.out.println(rec.sumOfFirstN(1,3));
//        System.out.println(rec.factorialOfN(1,10));
//          rec.factorialParameterised(3,1);
//        rec.reverseArray(array,0,array.length-1);
//        for(int i=0;i<array.length;i++){
//            System.out.print(array[i]+"  ");
//        }
//        String s="i an n a i";
//        int slen = s.length()-1;
//        System.out.println(rec.pallindrome(0,slen,s));
        System.out.println(rec.fib(4));

    }
}
class PrintNnumbers{
    int count =1;


    void recursionFun(){
        if(count > 4)
            return ;
        System.out.println(count);
        count++;
        recursionFun();
    }

    void nameUsingRec(int i, int n ){
        if(i > n )
            return ;
        System.out.println("balaji");
        nameUsingRec(i+1,n);
    }

    void reverseNumbers(int i){
        System.out.print(i+"  ");
        if(i<=1)
            return;
        reverseNumbers(i-1);
    }

    void printNnumbersBackTrack(int i){
        if(i<1)
            return;
        printNnumbersBackTrack(i-1);
        System.out.print(i+" ");
    }

    void printNnumbersBackTrackRev(int i,int n){
        if(i>n)
            return;
        printNnumbersBackTrackRev(i+1,n);
        System.out.print(i+" ");
    }

    int sumOfFirstN(int i,int n){
        if(i>n)
            return 0;
        return i+sumOfFirstN(i+1,n);
    }

    long factorialOfN(int i, int n){
        if(i>=n)
            return n;
        return i*factorialOfN(i+1,n);
    }

    void factorialParameterised(int i , long mul){
        if(i<=0) {
            System.out.println(mul);
            return;
        }
        factorialParameterised(i-1,mul*i);
    }

    void swap(int[] arr, int i ,int j){
        int tem=arr[i];
        arr[i]= arr[j];
        arr[j] = tem;
    }

    void reverseArray(int[] arr, int i , int j){
        if(i>=j)
            return;
        swap(arr,i,j);
        reverseArray(arr,i+1,j-1);
    }

    boolean pallindrome(int i, int j , String s){
        if(i>=j)
            return true;
        while (i<j && !Character.isAlphabetic(s.charAt(i))){
            i++;
        }
        while(i<j && !Character.isAlphabetic(s.charAt(j))){
            j--;
        }
        if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
            return false;
        }
        return pallindrome(i+1,j-1,s);
    }


    int  fib(int n){
        if(n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
}
