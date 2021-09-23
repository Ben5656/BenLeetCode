package src;

public class ReverseInteger {
    public int reverse(int x) {
        int reversedInt = 0;
        String reverse = new StringBuffer(Integer.toString(x)).reverse().toString();
        if(reverse.contains("-")){
            reverse = reverse.replace("-", "");
            reverse = "-" + reverse;
        }
        try{
            reversedInt = Integer.parseInt(reverse);
        } catch(NumberFormatException e){
            return 0;
        }
        return reversedInt;
    }
}
