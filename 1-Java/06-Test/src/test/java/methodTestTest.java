import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class methodTestTest {

    @Test
    public void addTest_when5and8_thenReturn13() {
        int a=5;
        int b=8;

        int actual= methodTest.add(a,b);
        assertEquals(13,actual);
    }

    @Test
    public void isEvenTest_when6IsEven_thenReturnTrue() {
        int num=6;
        boolean actual= methodTest.isEven(num);
        assertTrue(actual);
    }

    @Test
    public void multiplyTest_when5multiply6_thenReturn30() {
        int a=5;
        int b=6;
        int actual= methodTest.multiply(a,b);
        assertEquals(30,actual);
    }

    @Test
    public void toUpperCaseTest_whenHello_thenReturnHELLO() {
        String str="hello";
        String actual= methodTest.toUpperCase(str);
        assertEquals("HELLO",actual);
    }

    @Test
    public void isPositiveTest_whenNegative_thenReturnFalse() {
        boolean actual= methodTest.isPositive(-2);
        assertFalse(actual);
    }
}