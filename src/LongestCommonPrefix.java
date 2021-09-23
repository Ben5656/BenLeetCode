package src;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        StringBuilder longest = new StringBuilder();

        for(int i = 0; i < strs[0].length(); i++){
            if(strs[0].charAt(i) == strs[strs.length-1].charAt(i)){
                longest.append(strs[0].charAt(i));
            } else break;
        } 

        return longest.toString();   
    }

}
