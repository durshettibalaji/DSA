package stringsProblems;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args){
        String[] str={"abc", "kserfg","bcds", "wsed", "dfcvg"};
        char s= 'd';
        System.out.println( findWordsContaining(str,s));
    }


    static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            // for(int j=0;j<words[i].length();j++){
            //     if(words[i].charAt(j) == x)
            //     {
            //         list.add(i);
            //         break;
            //     }
            // }
            if(words[i].indexOf(x) != -1)
                list.add(i);
        }
        return list;
    }
}
