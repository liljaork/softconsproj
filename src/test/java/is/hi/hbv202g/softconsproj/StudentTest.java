package is.hi.hbv202g.softconsproj;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    /* private boolean feePaid;
    isFeePaid(); */

    private Student student;
    private Student studentUnpaid;

    @Before
    public void setUp() {
        student = new Student("Jón Jónsson", true);
        studentUnpaid = new Student("Jóna Jónsdóttir", false);
    }

    @Test
    public void testIsFeePaidWithPaidStudent() {
        assertTrue(student.isFeePaid());
    }

    @Test
    public void testIsFeePaidWithUnpaidStudent() {
        assertFalse(studentUnpaid.isFeePaid());
    }

    // breytir gildi Jónu í True og athugar hvort það virkar
    @Test
    public void testSetFeePaid() {
        studentUnpaid.setFeePaid(true);
        assertTrue(studentUnpaid.isFeePaid());
    }


}
