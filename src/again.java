public class again {
    public static void main(String[] args) {
        int num = 123456789;
        int reverse = 0;
        for(;num !=0;){//using for loop
            int remainder = num%10;
            reverse = reverse*10+remainder;
            num = num/10;
        }
        System.out.println(reverse);
    }
}
