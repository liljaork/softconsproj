package is.hi.hbv202g.softconsproj;

public class Student extends User {
    //Instance variable
    private boolean feePaid; 

    /**
     * Constructs a new Student with a specified name and fee payment status.
     * @param name the name of the student
     * @param feePaid a boolean value indicating whether the fees have been paid
     */
    public Student(String name, boolean feePaid) {
        super(name);
        this.feePaid = feePaid;
    }

    /**
     * Returns whether the student has paid their fees.
     * @return true if the fees have been paid, false otherwise
     */
    public boolean isFeePaid() {
        return feePaid;
    }

    /**
     * Sets the fee payment status of the student.
     * @param feePaid a boolean value indicating whether the fees should be marked as paid
     */
    public void setFeePaid(boolean feePaid) {
        this.feePaid = feePaid;
    }
}