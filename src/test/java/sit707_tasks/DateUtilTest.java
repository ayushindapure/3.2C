// DateUtilTest.java
package sit707_tasks;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * @author Ayush Indapure
 */
public class DateUtilTest {

    @Test
    public void testStudentName() {
        assertEquals("Ayush Indapure", "Ayush Indapure");
    }

    @Test
    public void testStudentID() {
        assertEquals("224880003", "224880003");
    }

    // ==========================================
    // PREVIOUS DATE TESTS (decrement)
    // ==========================================

    @Test
    public void testPreviousDate1() {
        DateUtil date = new DateUtil(1, 6, 1994);
        date.decrement();
        assertEquals("31 May 1994", date.toString());
    }

    @Test
    public void testPreviousDate2() {
        DateUtil date = new DateUtil(15, 6, 1994);
        date.decrement();
        assertEquals("14 June 1994", date.toString());
    }

    @Test
    public void testPreviousDate3() {
        DateUtil date = new DateUtil(1, 1, 2024);
        date.decrement();
        assertEquals("31 December 2023", date.toString());
    }

    @Test
    public void testPreviousDate4() {
        DateUtil date = new DateUtil(1, 3, 2024);
        date.decrement();
        assertEquals("29 February 2024", date.toString());
    }

    @Test
    public void testPreviousDate5() {
        DateUtil date = new DateUtil(1, 3, 2023);
        date.decrement();
        assertEquals("28 February 2023", date.toString());
    }

    // ==========================================
    // NEXT DATE TESTS (increment)
    // ==========================================

    @Test
    public void testNextDate1() {
        DateUtil date = new DateUtil(1, 6, 1994);
        date.increment();
        assertEquals("2 June 1994", date.toString());
    }

    @Test
    public void testNextDate2() {
        DateUtil date = new DateUtil(30, 6, 1994);
        date.increment();
        assertEquals("1 July 1994", date.toString());
    }

    @Test
    public void testNextDate3() {
        DateUtil date = new DateUtil(31, 12, 2023);
        date.increment();
        assertEquals("1 January 2024", date.toString());
    }

    @Test
    public void testNextDate4() {
        DateUtil date = new DateUtil(28, 2, 2024);
        date.increment();
        assertEquals("29 February 2024", date.toString());
    }

    @Test
    public void testNextDate5() {
        DateUtil date = new DateUtil(28, 2, 2023);
        date.increment();
        assertEquals("1 March 2023", date.toString());
    }

    // ==========================================
    // INVALID DATE TESTS
    // ==========================================

    @Test(expected = RuntimeException.class)
    public void testInvalidDate1() {
        new DateUtil(31, 6, 1994); // June has only 30 days
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidDate2() {
        new DateUtil(29, 2, 2023); // 2023 is not leap year
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidDate3() {
        new DateUtil(0, 5, 2024); // invalid day
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidDate4() {
        new DateUtil(10, 13, 2024); // invalid month
    }

    @Test(expected = RuntimeException.class)
    public void testInvalidDate5() {
        new DateUtil(10, 5, 1699); // invalid year
    }
    
    //Further distinction task test cases

    @Test
    public void testLeapYearTrue() {
        DateUtil d = new DateUtil(10, 10, 2024);
        assertEquals(true, d.isLeapYear());
    }

    @Test
    public void testLeapYearFalse() {
        DateUtil d = new DateUtil(10, 10, 2023);
        assertEquals(false, d.isLeapYear());
    }

    @Test
    public void testMonthDays() {
        DateUtil d = new DateUtil(10, 2, 2024);
        assertEquals(29, d.getMonthDays());
    }

    @Test
    public void testWeekendLogic() {
        DateUtil d = new DateUtil(7, 4, 2024);
        assertEquals(true, d.isWeekend());
    }
}
