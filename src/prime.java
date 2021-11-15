public class prime {
    /**
     * @param num is the input number that is to be checked.
     * @return true if prime and false if not
     */
    public static boolean isPrimeMethod1(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeMethod2(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeMethod3(int num) {
        for (int i = 2; i < (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(prime.isPrimeMethod1(10000));
        System.out.println(prime.isPrimeMethod2(10007));
        System.out.println(prime.isPrimeMethod3(10007));
    }
}