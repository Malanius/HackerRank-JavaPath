import static org.junit.Assert.*;

public class SolutionTest {

    @org.junit.Test
    public void testBalance_1() {
        assertTrue(Solution.testBalance("{}()"));
    }

    @org.junit.Test
    public void testBalance_2() {
        assertTrue(Solution.testBalance("({()})"));
    }

    @org.junit.Test
    public void testBalance_3() {
        assertFalse(Solution.testBalance("{}("));
    }

    @org.junit.Test
    public void testBalance_4() {
        assertTrue(Solution.testBalance("[]"));
    }

    @org.junit.Test
    public void testBalance_5() {
        assertFalse(Solution.testBalance("[["));
    }
}
