import static org.junit.Assert.*;

public class primeTest {

    @org.junit.Test
    public void isPrimeMethod1() {
        assertTrue(prime.isPrimeMethod1(1000000009));
    }

    @org.junit.Test
    public void isPrimeMethod2() {
        assertTrue(prime.isPrimeMethod2(1000000007));
    }

    @org.junit.Test
    public void isPrimeMethod3() {
        assertTrue(prime.isPrimeMethod3(1000000007));
    }
}