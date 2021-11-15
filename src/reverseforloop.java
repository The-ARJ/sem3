import java.sql.SQLOutput;

public class reverseforloop {
    public static void main(String[] args) {
        int number = 12345;
        int reverse = 0;
        for(;number !=0;number=number/10){
            int remainder = number%10;
            reverse = reverse*10+remainder;
        }
        System.out.println("The reverse of the given number is:"+reverse);
    }
}
