package src;

public class LongestSubstringWithoutRepeatingCharacters {

    /** WIP */
    
    public int lengthOfLongestSubstring(String s){
        char lastchar = '\0';
        int largest = 0, counter = 0;
        String longest = "";

        if(s == ""){
            return 0;
        }

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == lastchar){
                counter = 0;
            } else {
                longest = longest + s.charAt(i);
            }

            if(longest.length() > largest){
                largest = longest.length();
            }
            lastchar = s.charAt(i);
        }

        return largest;
    }
}
