package is.hi.hbv202g.softconsproj;

public class Student extends User {
    //Tilviksbreyta
    private boolean feePaid;

    /**
     * Smiðursem tekur inn name og feePaid
     * @param name
     * @param feePaid
     */
    public Student(String name, boolean feePaid) {
        super(name);
        this.feePaid = feePaid;        
    }

    /**
     * 
     * @return feePaid
     */
    public boolean isFeePaid() {
        return feePaid;
    }

    /**
     * Setter fyrir feePaid
     * @param feePaid
     */
    public void setFeePaid(boolean feePaid) {
        this.feePaid = feePaid;
    }
}
