package src;

public class RomanToInteger {

    public int romanToInt(String s){
        int val = 0, conv = 0;
        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) == 'I'){
                val = 1;
            } else if(s.charAt(i) == 'V'){
                val = 5;
            } else if(s.charAt(i) == 'X'){
                val = 10;
            } else if(s.charAt(i) == 'L'){
                val = 50;
            } else if(s.charAt(i) == 'C'){
                val = 100;
            } else if(s.charAt(i) == 'D'){
                val = 500;
            } else if(s.charAt(i) == 'M'){
                val = 1000;
            }
            if(4 * val < conv) conv-=val;
            else conv += val;
        }
        return conv;
    }
}
