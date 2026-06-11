package stringsProblems;
//58. Length of Last Word
public class LengthOfLastWord {
    public static void main(String[] arg){
        bruteForce("asd  erff  485 123456789   ");
        System.out.println(optimal("qaaa wwed ikn   "));

    }
   static int bruteForce(String s){
        String[] str = s.split(" ");
        System.out.println(str[str.length-1].length());
        return  str[str.length-1].length() ;
    }

    static int optimal(String s){
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' ')
                c++;
            else{
                if(c>0)
                    return c;
            }
        }
        return c;
    }
}
