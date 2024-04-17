package is.hi.hbv202g.softconsproj;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for the Student class.
 */
public class StudentTest {
    
    private Student student;         // Student object with fee paid
    private Student studentUnpaid;   // Student object with fee unpaid

    /**
     * Set up test fixtures.
     */
    @Before
    public void setUp() {
        student = new Student("Jón Jónsson", true);        // Create a paid student
        studentUnpaid = new Student("Jóna Jónsdóttir", false); // Create an unpaid student
    }

    /**
     * Test for the isFeePaid method with a paid student.
     */
    @Test
    public void testIsFeePaidWithPaidStudent() {
        assertTrue(student.isFeePaid());   // Assert that the fee is paid for the student
    }

    /**
     * Test for the isFeePaid method with an unpaid student.
     */
    @Test
    public void testIsFeePaidWithUnpaidStudent() {
        assertFalse(studentUnpaid.isFeePaid());  // Assert that the fee is unpaid for the student
    }

    /**
     * Test for the setFeePaid method to set the fee paid status for an unpaid student.
     */
    @Test
    public void testSetFeePaid() {
        studentUnpaid.setFeePaid(true);    // Set the fee as paid for the unpaid student
        assertTrue(studentUnpaid.isFeePaid());   // Assert that the fee is paid for the student after setting
    }
}
